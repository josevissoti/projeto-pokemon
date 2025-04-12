package com.project.domains.enums;

public enum NivelPokemon {

    INICIANTE(0, "INICIANTE"),
    INTERMEDIARIO(1, "INTERMEDIARIO"),
    AVANCADO(2, "AVANCADO"),
    LENDARIO(3, "LENDARIO");

    private Integer id;
    private String nivel;

    NivelPokemon(Integer id, String nivel) {
        this.id = id;
        this.nivel = nivel;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public static NivelPokemon toEnum(Integer id) {
        if (id == null) return null;
        for (NivelPokemon nivelPokemon : NivelPokemon.values()) {
            if (id.equals(nivelPokemon.getId())) {
                return nivelPokemon;
            }
        }
        throw new IllegalArgumentException("NivelPokemon inválido");
    }
}
