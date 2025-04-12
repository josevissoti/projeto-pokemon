package com.project.domains;

import com.project.domains.enums.NivelPokemon;
import com.project.domains.enums.TipoPokemon;

import java.time.LocalDate;
import java.util.Objects;

public class Pokemon {
    private Long id;
    private String nome;
    private TipoPokemon tipoPokemon;
    private NivelPokemon nivelPokemon;
    private int pontosDeVida;
    private int ataque;
    private int defesa;
    private int velocidade;
    private LocalDate dataCaptura;
    private String cpfPokemon;

    public Pokemon() {
    }

    public Pokemon(Long id, String nome, TipoPokemon tipoPokemon, NivelPokemon nivelPokemon, int pontosDeVida, int ataque, int defesa, int velocidade, LocalDate dataCaptura, String cpfPokemon) {
        this.id = id;
        this.nome = nome;
        this.tipoPokemon = tipoPokemon;
        this.nivelPokemon = nivelPokemon;
        this.pontosDeVida = pontosDeVida;
        this.ataque = ataque;
        this.defesa = defesa;
        this.velocidade = velocidade;
        this.dataCaptura = dataCaptura;
        this.cpfPokemon = cpfPokemon;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public TipoPokemon getTipoPokemon() {
        return tipoPokemon;
    }

    public void setTipoPokemon(TipoPokemon tipoPokemon) {
        this.tipoPokemon = tipoPokemon;
    }

    public NivelPokemon getNivelPokemon() {
        return nivelPokemon;
    }

    public void setNivelPokemon(NivelPokemon nivelPokemon) {
        this.nivelPokemon = nivelPokemon;
    }

    public int getPontosDeVida() {
        return pontosDeVida;
    }

    public void setPontosDeVida(int pontosDeVida) {
        this.pontosDeVida = pontosDeVida;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getDefesa() {
        return defesa;
    }

    public void setDefesa(int defesa) {
        this.defesa = defesa;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public LocalDate getDataCaptura() {
        return dataCaptura;
    }

    public void setDataCaptura(LocalDate dataCaptura) {
        this.dataCaptura = dataCaptura;
    }

    public String getCpfPokemon() {
        return cpfPokemon;
    }

    public void setCpfPokemon(String cpfPokemon) {
        this.cpfPokemon = cpfPokemon;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Pokemon pokemon = (Pokemon) o;
        return Objects.equals(id, pokemon.id) && Objects.equals(cpfPokemon, pokemon.cpfPokemon);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, cpfPokemon);
    }
}
