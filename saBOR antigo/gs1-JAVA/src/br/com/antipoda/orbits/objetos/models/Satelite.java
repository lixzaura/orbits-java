package br.com.antipoda.orbits.objetos.models;

import br.com.antipoda.orbits.empresa.models.Empresa;
import br.com.antipoda.orbits.objetos.enums.CategoriaObjeto;
import br.com.antipoda.orbits.objetos.enums.ObjetoStatus;
import br.com.antipoda.orbits.objetos.enums.Orbita;

import java.time.LocalDate;

public class Satelite extends ObjetoEspacial{

    private String finalidade;
    private Empresa empresa;
    private String trajeto;
    private LocalDate tempoVida;
    private Orbita tipoOrbita;

    // construtor

    public Satelite(String nome, String finalidade, Empresa empresa, String trajeto, double altitudeOrbital, double velocidadeOrbital, LocalDate dataLancamento, LocalDate tempoVida, Orbita tipoOrbita, ObjetoStatus statusOperacao) {
        super(nome, CategoriaObjeto.SATELITE_ARTIFICIAL, statusOperacao, velocidadeOrbital, altitudeOrbital, dataLancamento);
        this.finalidade = finalidade;
        this.empresa = empresa;
        this.trajeto = trajeto;
        this.tempoVida = tempoVida;
        this.tipoOrbita = tipoOrbita;
    }

    // Getter e Setter


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

   public LocalDate getTempoVida() {
        return tempoVida;
    }

    public void setTempoVida(LocalDate tempoVida) {
        this.tempoVida = tempoVida;
    }

    public Orbita getTipoOrbita() {
        return tipoOrbita;
    }

    public void setTipoOrbita(Orbita tipoOrbita) {
        this.tipoOrbita = tipoOrbita;
    }
    

    // OUTROS MÉTODOSA

        // public void ativar()
        // public void desativar()
        // public void alterarOrbita(String novaOrbita)
}
