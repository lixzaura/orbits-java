package br.com.antipoda.orbits.empresa.enums;

public enum Penalidade {
    ALTO_RISCO_DE_COLISAO(15),
    GERACAO_DE_LIXO_ESPACIAL(15),
    SATELITE_SEM_PLANO_DE_DESORBITACAO(15),
    REGISTRO_ORBITAL_IRREGULAR(20),
    FALTA_DE_TRANSPARENCIA(25),
    GERACAO_DE_FRAGMENTOS_ORBITAIS(20),
    DESCUMPRIMENTO_REGULATORIO(40),
    USO_SUSPEITO_DE_INFRAESTRUTURA_ESPACIAL(40),
    SATELITE_INATIVO_EM_ORBITA(10);

    public final int pontos;
    Penalidade(int pontos){
        this.pontos = pontos;
    }
}
