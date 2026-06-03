package br.com.antipoda.orbits.objetos.models;

import br.com.antipoda.orbits.objetos.enums.CategoriaObjeto;
import br.com.antipoda.orbits.objetos.enums.ObjetoStatus;

import java.time.LocalDate;

public abstract class ObjetoEspacial {

    private String nome;
    private CategoriaObjeto categoria;
    private ObjetoStatus status;
    private double tamanho;
    private double velocidade;
    private double altitudeOrbital;
    private String riscoColisao;
    private LocalDate dataRegistro;

    // construtor

    public ObjetoEspacial(String nome, CategoriaObjeto categoria, ObjetoStatus status, double tamanho, double velocidade, double altitudeOrbital, String riscoColisao, LocalDate dataRegistro) {
        this(nome, categoria, status, velocidade, altitudeOrbital, dataRegistro);
        this.categoria = categoria;
        this.tamanho = tamanho;
        this.riscoColisao = riscoColisao;
    }

    public ObjetoEspacial(String nome, CategoriaObjeto categoria, ObjetoStatus status, double velocidade, double altitudeOrbital, LocalDate dataRegistro) {
        this.nome = nome;
        this.categoria = categoria;
        this.status = status;
        this.velocidade = velocidade;
        this.altitudeOrbital = altitudeOrbital;
        this.dataRegistro = dataRegistro;
    }

    // G e S

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public CategoriaObjeto getCategoria() {
        return categoria;
    }

    public void setCategoria(CategoriaObjeto categoria) {
        this.categoria = categoria;
    }

    public ObjetoStatus getStatus() {
        return status;
    }

    public void setStatus(ObjetoStatus status) {
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
