package br.com.antipoda.orbits.objetos.models;

import br.com.antipoda.orbits.empresa.Empresa;

import java.time.LocalDate;

public class Satelite {

    private String nome;
    private String finalidade;
    private Empresa empresa;
    private String trajeto;
    private double altitudeOrbital;
    private double velocidadeOrbital;
    private LocalDate dataLancamento;
    private LocalDate tempoVida;
    private String tipoOrbita;
    private String statusOperacao;

    // construtor

    public Satelite(String nome, String finalidade, Empresa empresa, String trajeto, double altitudeOrbital, double velocidadeOrbital, LocalDate dataLancamento, LocalDate tempoVida, String tipoOrbita, String statusOperacao) {
        this.nome = nome;
        this.finalidade = finalidade;
        this.empresa = empresa;
        this.trajeto = trajeto;
        this.altitudeOrbital = altitudeOrbital;
        this.velocidadeOrbital = velocidadeOrbital;
        this.dataLancamento = dataLancamento;
        this.tempoVida = tempoVida;
        this.tipoOrbita = tipoOrbita;
        this.statusOperacao = statusOperacao;
    }

    // Getter e Setter

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFinalidade() {
        return finalidade;
    }

    public void setFinalidade(String finalidade) {
        this.finalidade = finalidade;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public String getTrajeto() {
        return trajeto;
    }

    public void setTrajeto(String trajeto) {
        this.trajeto = trajeto;
    }

    public double getAltitudeOrbital() {
        return altitudeOrbital;
    }

    public void setAltitudeOrbital(double altitudeOrbital) {
        this.altitudeOrbital = altitudeOrbital;
    }

    public double getVelocidadeOrbital() {
        return velocidadeOrbital;
    }

    public void setVelocidadeOrbital(double velocidadeOrbital) {
        this.velocidadeOrbital = velocidadeOrbital;
    }

    public LocalDate getDataLancamento() {
        return dataLancamento;
    }

    public void setDataLancamento(LocalDate dataLancamento) {
        this.dataLancamento = dataLancamento;
    }

    public LocalDate getTempoVida() {
        return tempoVida;
    }

    public void setTempoVida(LocalDate tempoVida) {
        this.tempoVida = tempoVida;
    }

    public String getTipoOrbita() {
        return tipoOrbita;
    }

    public void setTipoOrbita(String tipoOrbita) {
        this.tipoOrbita = tipoOrbita;
    }

    public String getStatusOperacao() {
        return statusOperacao;
    }

    public void setStatusOperacao(String statusOperacao) {
        this.statusOperacao = statusOperacao;
    }

    // OUTROS MÉTODOSA

        // public void ativar()
        // public void desativar()
        // public void alterarOrbita(String novaOrbita)
}
