package br.com.antipoda.orbits.iniciativa.models;

import br.com.antipoda.orbits.empresa.models.Empresa;
import br.com.antipoda.orbits.iniciativa.enums.StatusIniciativa;

import java.time.LocalDate;

public class IniciativaEspacial {

    private Empresa empresa;
    private String nome;
    private String descricao;
    private String areaAtuacao;
    private LocalDate dataInicio;
    private StatusIniciativa statusIniciativa;

    // construtor

    public IniciativaEspacial(Empresa empresa, String nome, String descricao, String areaAtuacao, LocalDate dataInicio, StatusIniciativa statusIniciativa) {
        this.empresa = empresa;
        this.nome = nome;
        this.descricao = descricao;
        this.areaAtuacao = areaAtuacao;
        this.dataInicio = dataInicio;
        this.statusIniciativa = statusIniciativa;
    }

    // G e S

    public StatusIniciativa getStatusIniciativa() {
        return statusIniciativa;
    }

    public void setStatusIniciativa(StatusIniciativa statusIniciativa) {
        this.statusIniciativa = statusIniciativa;
    }

    public LocalDate getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(LocalDate dataInicio) {
        this.dataInicio = dataInicio;
    }

    public String getAreaAtuacao() {
        return areaAtuacao;
    }

    public void setAreaAtuacao(String areaAtuacao) {
        this.areaAtuacao = areaAtuacao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {this.nome = nome; }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    // OUTROS


}
