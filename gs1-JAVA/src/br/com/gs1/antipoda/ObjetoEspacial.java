package br.com.gs1.antipoda;

import java.time.LocalDate;

public class ObjetoEspacial {

    private String nomeObjeto;
    private String categoriaObjeto;
    private String statusObjeto;
    private double tamanho;
    private double velocidade;
    private double altitudeOrbital;
    private String riscoColisao;
    private LocalDate dataRegistro;

    // construtor

    public ObjetoEspacial(String nomeObjeto, String categoriaObjeto, String statusObjeto, double tamanho, double velocidade, double altitudeOrbital, String riscoColisao, LocalDate dataRegistro) {
        this.nomeObjeto = nomeObjeto;
        this.categoriaObjeto = categoriaObjeto;
        this.statusObjeto = statusObjeto;
        this.tamanho = tamanho;
        this.velocidade = velocidade;
        this.altitudeOrbital = altitudeOrbital;
        this.riscoColisao = riscoColisao;
        this.dataRegistro = dataRegistro;
    }

    // G e S

    public String getNomeObjeto() {
        return nomeObjeto;
    }

    public void setNomeObjeto(String nomeObjeto) {
        this.nomeObjeto = nomeObjeto;
    }

    public String getCategoriaObjeto() {
        return categoriaObjeto;
    }

    public void setCategoriaObjeto(String categoriaObjeto) {
        this.categoriaObjeto = categoriaObjeto;
    }

    public String getStatusObjeto() {
        return statusObjeto;
    }

    public void setStatusObjeto(String statusObjeto) {
        this.statusObjeto = statusObjeto;
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
