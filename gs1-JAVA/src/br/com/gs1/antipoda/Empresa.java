package br.com.gs1.antipoda;

import java.time.LocalDate;

public class Empresa {
    private String nome;
    private String paisOrigem;
    private String status;
    private String email;
    private String telefone;
    private String tipo;
    private LocalDate dataFundacao;
    private String descricao;
    private String siteOficial;
    private String cnpj;
    private int score;

    // Construtor

    public Empresa(String nome, String paisOrigem, String status, String email, String telefone, String tipo, LocalDate dataFundacao, String descricao, String siteOficial, String cnpj, int score) {
        this.nome = nome;
        this.paisOrigem = paisOrigem;
        this.status = status;
        this.email = email;
        this.telefone = telefone;
        this.tipo = tipo;
        this.dataFundacao = dataFundacao;
        this.descricao = descricao;
        this.siteOficial = siteOficial;
        this.cnpj = cnpj;
        this.score = score;
    }

    //GETTERS E SETTERRS

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPaisOrigem() {
        return paisOrigem;
    }

    public void setPaisOrigem(String paisOrigem) {
        this.paisOrigem = paisOrigem;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public LocalDate getDataFundacao() {
        return dataFundacao;
    }

    public void setDataFundacao(LocalDate dataFundacao) {
        this.dataFundacao = dataFundacao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getSiteOficial() {
        return siteOficial;
    }

    public void setSiteOficial(String siteOficial) {
        this.siteOficial = siteOficial;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    // OUTROS METODOS

        // public void aumentarScore(int pontos)
        // public void reduzirScore(int pontos)
        // public void alterarStatus(String status)
}


