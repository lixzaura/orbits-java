package br.com.antipoda.orbits.app;

import br.com.antipoda.orbits.empresa.enums.Bonificacao;
import br.com.antipoda.orbits.empresa.enums.Penalidade;
import br.com.antipoda.orbits.empresa.enums.StatusEmpresa;
import br.com.antipoda.orbits.empresa.models.Empresa;
import br.com.antipoda.orbits.iniciativa.enums.StatusIniciativa;
import br.com.antipoda.orbits.iniciativa.models.IniciativaEspacial;
import br.com.antipoda.orbits.objetos.enums.CategoriaObjeto;
import br.com.antipoda.orbits.objetos.enums.ObjetoStatus;
import br.com.antipoda.orbits.objetos.enums.Orbita;
import br.com.antipoda.orbits.objetos.enums.RiscoColisao;
import br.com.antipoda.orbits.objetos.models.ObjetoEspacial;
import br.com.antipoda.orbits.objetos.models.Satelite;
import br.com.antipoda.orbits.usuario.enums.TipoRelatorio;
import br.com.antipoda.orbits.usuario.models.Administrador;
import br.com.antipoda.orbits.usuario.models.Relatorio;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Empresa spacex = new Empresa("Spacex", "USA", "Email@Spacex.com", "1234-5678", "MEI", LocalDate.now(), "", "", "1234-0001/6967", 50);
        Empresa newSpace = new Empresa("Spacex", "USA", "Email@Spacex.com", "1234-5678", "MEI", LocalDate.now(), "", "", "1234-0001/6967", 50);

        ObjetoEspacial apophis = new ObjetoEspacial("Apophis", CategoriaObjeto.METEORO, ObjetoStatus.RASTREADO, 13 , 340, 67.69, RiscoColisao.ALTA,LocalDate.of(2004, 1, 1));

        System.out.println("Insira seu nome: ");
        String nomeUsuario = scanner.nextLine();

        System.out.println("Insira sua senha: ");
        String senhaUsuario = scanner.nextLine();

        System.out.println("Insira seu email: ");
        String email = scanner.nextLine();

        System.out.println("Insira seu telefone: ");
        String telefone = scanner.nextLine();

        Administrador adm = new Administrador(nomeUsuario, email, telefone, senhaUsuario, LocalDate.now());
        senhaUsuario = null;


        Relatorio relatorio1 = adm.emitirRelatorio("Risco alto de colisao", "Satélite da Spacex tem alto risco de se colidir com Apophis, devido a falta de planejamento", LocalDateTime.now(), TipoRelatorio.RISCO_COLISAO);


        Satelite zeni = new Satelite("zeni-télite", "voar", spacex, "por ali", 67, 69, LocalDate.now(), LocalDate.EPOCH, Orbita.BAIXA, ObjetoStatus.Inativo);
        List<Empresa> empresasIniciativa = new ArrayList<>();


        empresasIniciativa.add(spacex);
        empresasIniciativa.add(newSpace);





        IniciativaEspacial iniciativa = new IniciativaEspacial(empresasIniciativa, "Iniciativa Legal", "", "Ali", LocalDate.of(2011, 6, 7), StatusIniciativa.ATIVA);
        System.out.println(spacex.getNome() + " E " + newSpace.getNome() + " acabaram de entrar para a iniciativa" + iniciativa.getNome() + ". Gostaria de bonificá-las? (s/n)");
        String resp = scanner.nextLine();
        if (resp.toLowerCase(Locale.ROOT).equals("s")){
            adm.bonificarEmpresa(spacex, Bonificacao.PARTICIPACAO_EM_INICIATIVA_SUSTENTAVEL);
            adm.bonificarEmpresa(newSpace, Bonificacao.PARTICIPACAO_EM_INICIATIVA_SUSTENTAVEL);
        }

        System.out.println("Colisão detectada, gostaria de relatar? (s/n)");
        resp = scanner.nextLine();
        if (resp.toLowerCase(Locale.ROOT).equals("s")){
            Relatorio relatorio2 = adm.emitirRelatorio("Colisao Satelite SpaceX", "Satelite XXXXXXXX colidiu com o astro Apophis", LocalDateTime.now(), TipoRelatorio.INCIDENTE);
            System.out.println("Gostaria de penalizar a empresa? (s/n)");
            resp = scanner.nextLine();
            if (resp.toLowerCase(Locale.ROOT).equals("s")) {
                adm.penalizarEmpresa(spacex, Penalidade.ALTO_RISCO_DE_COLISAO);
            }
        }


        System.out.println(spacex);
        System.out.println("\n" + newSpace);








    }
}
