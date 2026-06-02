package br.com.gs1.antipoda;

import java.time.LocalDate;

public class IniciativaEspacial {

    private Empresa empresa;
    private String nomeIniciativa;
    private String descricao;
    private String areaAtuacao;
    private LocalDate dataInicio;
    private String statusIniciativa;

    // construtor

    public IniciativaEspacial(Empresa empresa, String nomeIniciativa, String descricao, String areaAtuacao, LocalDate dataInicio, String statusIniciativa) {
        this.empresa = empresa;
        this.nomeIniciativa = nomeIniciativa;
        this.descricao = descricao;
        this.areaAtuacao = areaAtuacao;
        this.dataInicio = dataInicio;
        this.statusIniciativa = statusIniciativa;
    }

    // G e S

    public String getStatusIniciativa() {
        return statusIniciativa;
    }

    public void setStatusIniciativa(String statusIniciativa) {
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

    public String getNomeIniciativa() {
        return nomeIniciativa;
    }

    public void setNomeIniciativa(String nomeIniciativa) {
        this.nomeIniciativa = nomeIniciativa;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    // OUTROS


}
