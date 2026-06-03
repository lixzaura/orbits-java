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
            System.out.println("Senha Inválida");
            return null;
        }
        return new Relatorio(titulo, descricao, dataEmissao, tipoRelatorio, this);

    }

    public boolean penalizarEmpresa(Empresa empresa, Penalidade penalidade){
        Scanner scanner = new Scanner(System.in);
        System.out.println("insira sua senha");
        String pass = scanner.nextLine();
        if (!pass.equals(this.senha)){
            System.out.println("Senha Inválida");
            return false;
        }

        empresa.reduzirScore(penalidade.pontos);

        return true;
    }

    public boolean bonificarEmpresa(Empresa empresa, Bonificacao bonificacao){
        Scanner scanner = new Scanner(System.in);
        System.out.println("insira sua senha");
        String pass = scanner.nextLine();
        if (!pass.equals(this.senha)){
            System.out.println("Senha Inválida");
            return false;
        }

        empresa.aumentarScore(bonificacao.pontos);

        return true;
    }
}
