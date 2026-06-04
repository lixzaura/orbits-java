package br.com.antipoda.orbits.usuario.models;

import br.com.antipoda.orbits.usuario.enums.TipoRelatorio;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Relatorio {

    private String titulo;
    private String descricao;
    private LocalDateTime dataEmissao;
    private TipoRelatorio tipo;
    private Usuario usuario;

    // construtor

    public Relatorio(String titulo, String descricao, LocalDateTime dataEmissao, TipoRelatorio tipo, Usuario usuario) {
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

    public LocalDateTime getDataEmissao() {
        return dataEmissao;
    }

    public void setDataEmissao(LocalDateTime dataEmissao) {
        this.dataEmissao = dataEmissao;
    }

    public TipoRelatorio getTipo() {
        return tipo;
    }

    public void setTipo(TipoRelatorio tipo) {
        this.tipo = tipo;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    //Outros metodos
    public static String toString(String titulo, String descricao, TipoRelatorio tipoRelatorio){
        StringBuilder st = new StringBuilder();
        st.append("Titulo: ").append(titulo).append('\n');
        st.append("Descricao: ").append(descricao).append('\n');
        st.append("Tipo: ").append(tipoRelatorio.toString().toLowerCase().replace('_', ' ')).append('\n');

        return st.toString();
    }

    public String toString() {
        return this.toString(titulo, descricao, tipo) + "DataEmissao: " + dataEmissao.getDayOfMonth() + "/" + dataEmissao.getMonth() + "/" +dataEmissao.getYear() + " - " + dataEmissao.getHour() + ":" + dataEmissao.getMinute();
    }
}

