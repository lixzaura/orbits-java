package br.com.gs1.antipoda;

import java.time.LocalDate;

public class Relatorio {

    private String tituloRelatorio;
    private String descricaoRelatorio;
    private LocalDate dataEmissao;
    private String tipoRelatorio;
    private Usuario usuario;

    // construtor

    public Relatorio(String tituloRelatorio, String descricaoRelatorio, LocalDate dataEmissao, String tipoRelatorio, Usuario usuario) {
        this.tituloRelatorio = tituloRelatorio;
        this.descricaoRelatorio = descricaoRelatorio;
        this.dataEmissao = dataEmissao;
        this.tipoRelatorio = tipoRelatorio;
        this.usuario = usuario;
    }

    // g e s

    public String getTituloRelatorio() {
        return tituloRelatorio;
    }

    public void setTituloRelatorio(String tituloRelatorio) {
        this.tituloRelatorio = tituloRelatorio;
    }

    public String getDescricaoRelatorio() {
        return descricaoRelatorio;
    }

    public void setDescricaoRelatorio(String descricaoRelatorio) {
        this.descricaoRelatorio = descricaoRelatorio;
    }

    public LocalDate getDataEmissao() {
        return dataEmissao;
    }

    public void setDataEmissao(LocalDate dataEmissao) {
        this.dataEmissao = dataEmissao;
    }

    public String getTipoRelatorio() {
        return tipoRelatorio;
    }

    public void setTipoRelatorio(String tipoRelatorio) {
        this.tipoRelatorio = tipoRelatorio;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
