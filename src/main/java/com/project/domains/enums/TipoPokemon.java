package com.project.domains.enums;

public enum TipoPokemon {
    AGUA(0, "AGUA"),
    DRAGAO(1, "DRAGAO"),
    ELETRICO(2, "ELETRICO"),
    FADA(3, "FADA"),
    FANTASMA(4, "FANTASMA"),
    FOGO(5, "FOGO"),
    GELO(6, "GELO"),
    INSETO(7, "INSETO"),
    LUTADOR(8, "LUTADOR"),
    NORMAL(9, "NORMAL"),
    PEDRA(10, "PEDRA"),
    PLANTA(11, "PLANTA"),
    PSIQUICO(12, "PSIQUICO"),
    SOMBRIO(13, "SOMBRIO"),
    TERRESTE(14, "TERRESTRE"),
    VENENOSO(15, "VENENOSO"),
    VOADOR(16, "VOADOR"),
    METAL(17, "METAL");

    private Integer id;
    private String tipo;

    TipoPokemon(Integer id, String tipo) {
        this.id = id;
        this.tipo = tipo;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public static TipoPokemon toEnum(Integer id) {
        if (id == null) return null;
        for (TipoPokemon tipoPokemon : TipoPokemon.values()) {
            if (id.equals(tipoPokemon.getId())) {
                return tipoPokemon;
            }
        }
        throw new IllegalArgumentException("TipoPokemon inválido");
    }
}
