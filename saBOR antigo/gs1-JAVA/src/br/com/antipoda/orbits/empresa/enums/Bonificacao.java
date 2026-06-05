package br.com.antipoda.orbits.empresa.enums;

public enum Bonificacao {
    DESORBITACAO_RESPONSAVEL(20),
    BAIXO_RISCO_DE_COLISAO(15),
    SATELITE_ATIVO_E_REGULARIZADO(10),
    PLANO_DE_MITIGACAO_APROVADO(25),
    BAIXA_GERACAO_DE_LIXO_ESPACIAL(20),
    REGISTRO_ORBITAL_REGULAR(10),
    TRANSPARENCIA_DE_DADOS(15),
    PARTICIPACAO_EM_INICIATIVA_SUSTENTAVEL(30),
    CONFORMIDADE_REGULATORIA(10);

    public final int pontos;

    Bonificacao(int pontos){
        this.pontos = pontos;
    }
}
