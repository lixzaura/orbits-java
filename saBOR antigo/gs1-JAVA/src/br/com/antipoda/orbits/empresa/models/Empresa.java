package br.com.antipoda.orbits.empresa.models;

import br.com.antipoda.orbits.empresa.enums.StatusEmpresa;

import java.time.LocalDate;

public class Empresa {
    private String nome;
    private String paisOrigem;
    private StatusEmpresa status;
    private String email;
    private String telefone;
    private String tipo;
    private LocalDate dataFundacao;
    private String descricao;
    private String siteOficial;
    private String cnpj;
    private int score;

    // Construtor

    public Empresa(String nome, String paisOrigem, String email, String telefone, String tipo, LocalDate dataFundacao, String descricao, String siteOficial, String cnpj, int score) {
        this.nome = nome;
        this.paisOrigem = paisOrigem;
        this.status = StatusEmpresa.EM_ANALISE;
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

    public StatusEmpresa getStatus() {
        return status;
    }

    public void setStatus(StatusEmpresa status) {
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


    @Override
    public String toString() {
        StringBuilder st = new StringBuilder();
        st.append("Nome: ").append(this.nome).append("\n");
        st.append("Pontos: ").append(this.score).append("\n");
        st.append("Email: ").append(this.email).append("\n");
        st.append("Telefone: ").append(this.telefone).append("\n");
        st.append("Status: ").append(this.status).append("\n");

        return st.toString();
    }

    public void aumentarScore(int pontos){
        this.score += pontos;
        alterarStatus();
    }
    public void reduzirScore(int pontos){
        this.score -= pontos;
        alterarStatus();
    }
    public void alterarStatus(){
        if (score < 30){
            status = StatusEmpresa.NAO_CONFIAVEL;
        } else if (score < 45) {
            status = StatusEmpresa.SUSPEITA;
        } else
            status = StatusEmpresa.CONFIAVEL;
    }
}


