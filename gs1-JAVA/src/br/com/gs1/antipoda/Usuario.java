package br.com.gs1.antipoda;

import java.time.LocalDate;

public class Usuario {

    private String nomeUsuario;
    private String emailUsuario;
    private String telefone;
    private String senha;
    private LocalDate dataCadastro;

    // construtior

    public Usuario(String nomeUsuario, String emailUsuario, String telefone, String senha, LocalDate dataCadastro) {
        this.nomeUsuario = nomeUsuario;
        this.emailUsuario = emailUsuario;
        this.telefone = telefone;
        this.senha = senha;
        this.dataCadastro = dataCadastro;
    }

    // GETTERS E SETTERS

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public String getEmailUsuario() {
        return emailUsuario;
    }

    public void setEmailUsuario(String emailUsuario) {
        this.emailUsuario = emailUsuario;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public LocalDate getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(LocalDate dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    // OUTROS MÉTODOS
}
