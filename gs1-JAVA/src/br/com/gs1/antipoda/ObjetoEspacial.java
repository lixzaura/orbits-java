package br.com.gs1.antipoda;

import java.time.LocalDate;

public class ObjetoEspacial {

    private String nome;
    private String categoria;
    private String status;
    private double tamanho;
    private double velocidade;
    private double altitudeOrbital;
    private String riscoColisao;
    private LocalDate dataRegistro;

    // construtor

    public ObjetoEspacial(String nome, String categoria, String status, double tamanho, double velocidade, double altitudeOrbital, String riscoColisao, LocalDate dataRegistro) {
        this.nome = nome;
        this.categoria = categoria;
        this.status = status;
        this.tamanho = tamanho;
        this.velocidade = velocidade;
        this.altitudeOrbital = altitudeOrbital;
        this.riscoColisao = riscoColisao;
        this.dataRegistro = dataRegistro;
    }

    // G e S

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public double getTamanho() {
        return tamanho;
    }

    public void setTamanho(double tamanho) {
        this.tamanho = tamanho;
    }

    public double getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }

    public double getAltitudeOrbital() {
        return altitudeOrbital;
    }

    public void setAltitudeOrbital(double altitudeOrbital) {
        this.altitudeOrbital = altitudeOrbital;
    }

    public String getRiscoColisao() {
        return riscoColisao;
    }

    public void setRiscoColisao(String riscoColisao) {
        this.riscoColisao = riscoColisao;
    }

    public LocalDate getDataRegistro() {
        return dataRegistro;
    }

    public void setDataRegistro(LocalDate dataRegistro) {
        this.dataRegistro = dataRegistro;
    }

    //OUTROS

        // public void atualizarRisco(String risco)
        // public void rastrearObjeto()
}
