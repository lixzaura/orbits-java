package br.com.antipoda.orbits.usuario.models;

import br.com.antipoda.orbits.empresa.enums.Bonificacao;
import br.com.antipoda.orbits.empresa.enums.Penalidade;
import br.com.antipoda.orbits.empresa.models.Empresa;
import br.com.antipoda.orbits.usuario.enums.TipoRelatorio;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;

public class Administrador extends Usuario{
    public Administrador(String nome, String email, String telefone, String senha, LocalDate dataCadastro){
        super(nome, email, telefone, senha, dataCadastro);

    }


    //metodos
    public Relatorio emitirRelatorio(String titulo, String descricao, LocalDateTime dataEmissao, TipoRelatorio tipoRelatorio){
        Scanner scanner = new Scanner(System.in);
        System.out.println("insira sua senha");
        String pass = scanner.nextLine();
        if (!pass.equals(this.senha)){
            System.out.println("Senha Inválida. Gostaria de tentar novamente? (s/n)");
            if(scanner.nextLine().equalsIgnoreCase("s"))
                return emitirRelatorio(titulo, descricao, dataEmissao, tipoRelatorio);
            return null;
        }
        return new Relatorio(titulo, descricao, dataEmissao, tipoRelatorio, this);

    }
    public Relatorio emitirRelatorio(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira o titulo:");
        String titulo = scanner.nextLine();

        System.out.println("Insira a descrição:");
        String descricao = scanner.nextLine();

        System.out.println("Insira o tipo de relatório:");
        TipoRelatorio tipoRelatorio = null;
        do {
            for (TipoRelatorio t : TipoRelatorio.values()){
                System.out.println("\t" + t.toString().toLowerCase().replace('_', ' '));
            }
            String input = scanner.nextLine();
            for (TipoRelatorio t : TipoRelatorio.values()){
                if (input.equalsIgnoreCase(t.toString().toLowerCase().replace('_', ' '))){
                    tipoRelatorio = t;
                }
            }
        } while (tipoRelatorio == null);
        return emitirRelatorio(titulo, descricao, LocalDateTime.now(), tipoRelatorio);
    }
    public boolean penalizarEmpresa(Empresa empresa, Penalidade penalidade){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Penalizando "+ empresa.getNome() +". Insira sua senha");
        String pass = scanner.nextLine();
        if (!pass.equals(this.senha)){
            System.out.println("Senha Inválida. Gostaria de tentar novamente? (s/n)");
            if(scanner.nextLine().equalsIgnoreCase("s"))
                return penalizarEmpresa(empresa, penalidade);
            return false;
        }

        empresa.reduzirScore(penalidade.pontos);

        return true;
    }

    public boolean bonificarEmpresa(Empresa empresa, Bonificacao bonificacao){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bonificando "+ empresa.getNome() +". Insira sua senha:");
        String pass = scanner.nextLine();
        if (!pass.equals(this.senha)){
            System.out.println("Senha Inválida. Gostaria de tentar novamente? (s/n)");
            if(scanner.nextLine().equalsIgnoreCase("s"))
                return bonificarEmpresa(empresa, bonificacao);
            return false;
        }

        empresa.aumentarScore(bonificacao.pontos);

        return true;
    }
}
