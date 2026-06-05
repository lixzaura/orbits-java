package br.com.antipoda.orbits.iniciativa.models;

import br.com.antipoda.orbits.empresa.models.Empresa;
import br.com.antipoda.orbits.iniciativa.enums.StatusIniciativa;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class IniciativaEspacial {

    private List<Empresa> empresas = new ArrayList<>();
    private String nome;
    private String descricao;
    private String areaAtuacao;
    private LocalDate dataInicio;
    private StatusIniciativa statusIniciativa;

    // construtor

    public IniciativaEspacial(List<Empresa> empresas, String nome, String descricao, String areaAtuacao, LocalDate dataInicio, StatusIniciativa statusIniciativa) {
        this.empresas = empresas;
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

    public List<Empresa> getEmpresas() {
        return empresas;
    }

    public void setEmpresas(List<Empresa> empresa) {
        this.empresas = empresas;
    }

    // OUTROS


}
