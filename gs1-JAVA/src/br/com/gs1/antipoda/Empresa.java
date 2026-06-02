package br.com.gs1.antipoda;

import java.time.LocalDate;

public class Empresa {
    private String nomeEmpresa;
    private String paisOrigem;
    private String statusEmpresa;
    private String emailEmpresa;
    private String telefone;
    private String tipoEmpresa;
    private LocalDate dataFundacao;
    private String descricao;
    private String siteOficial;
    private String cnpj;
    private int score;

    // Construtor

    public Empresa(String nomeEmpresa, String paisOrigem, String statusEmpresa, String emailEmpresa, String telefone, String tipoEmpresa, LocalDate dataFundacao, String descricao, String siteOficial, String cnpj, int score) {
        this.nomeEmpresa = nomeEmpresa;
        this.paisOrigem = paisOrigem;
        this.statusEmpresa = statusEmpresa;
        this.emailEmpresa = emailEmpresa;
        this.telefone = telefone;
        this.tipoEmpresa = tipoEmpresa;
        this.dataFundacao = dataFundacao;
        this.descricao = descricao;
        this.siteOficial = siteOficial;
        this.cnpj = cnpj;
        this.score = score;
    }

    //GETTERS E SETTERRS

    public String getNomeEmpresa() {
        return nomeEmpresa;
    }

    public void setNomeEmpresa(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
    }

    public String getPaisOrigem() {
        return paisOrigem;
    }

    public void setPaisOrigem(String paisOrigem) {
        this.paisOrigem = paisOrigem;
    }

    public String getStatusEmpresa() {
        return statusEmpresa;
    }

    public void setStatusEmpresa(String statusEmpresa) {
        this.statusEmpresa = statusEmpresa;
    }

    public String getEmailEmpresa() {
        return emailEmpresa;
    }

    public void setEmailEmpresa(String emailEmpresa) {
        this.emailEmpresa = emailEmpresa;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getTipoEmpresa() {
        return tipoEmpresa;
    }

    public void setTipoEmpresa(String tipoEmpresa) {
        this.tipoEmpresa = tipoEmpresa;
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


