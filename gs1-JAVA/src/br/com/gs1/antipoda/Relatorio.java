package br.com.gs1.antipoda;

import java.time.LocalDate;

public class Relatorio {

    private String titulo;
    private String descricao;
    private LocalDate dataEmissao;
    private String tipo;
    private Usuario usuario;

    // construtor

    public Relatorio(String titulo, String descricao, LocalDate dataEmissao, String tipo, Usuario usuario) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.dataEmissao = dataEmissao;
        this.tipo = tipo;
        this.usuario = usuario;
    }

    // g e s

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getDataEmissao() {
        return dataEmissao;
    }

    public void setDataEmissao(LocalDate dataEmissao) {
        this.dataEmissao = dataEmissao;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
