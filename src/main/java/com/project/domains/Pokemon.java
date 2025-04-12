package com.project.domains;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.project.domains.enums.NivelPokemon;
import com.project.domains.enums.TipoPokemon;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;
import java.util.Objects;

@Entity
@Table(name = "pokemon")
public class Pokemon {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_pokemon")
    private Long idPokemon;

    @NotNull @NotBlank
    private String nome;

    @Enumerated(EnumType.ORDINAL)
    @JoinColumn(name = "tipoPokemon")
    private TipoPokemon tipoPokemon;

    @Enumerated(EnumType.ORDINAL)
    @JoinColumn(name = "nivelPokemon")
    private NivelPokemon nivelPokemon;

    @NotNull
    private int pontosDeVida;

    @NotNull
    private int ataque;

    @NotNull
    private int defesa;

    @NotNull
    private int velocidade;

    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate dataCaptura;

    @NotNull @NotBlank
    private String cpfPokemon;

    public Pokemon() {
    }

    public Pokemon(Long idPokemon, String nome, TipoPokemon tipoPokemon, NivelPokemon nivelPokemon, int pontosDeVida, int ataque, int defesa, int velocidade, LocalDate dataCaptura, String cpfPokemon) {
        this.idPokemon = idPokemon;
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

    public Long getIdPokemon() {
        return idPokemon;
    }

    public void setIdPokemon(Long id) {
        this.idPokemon = idPokemon;
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
        return Objects.equals(idPokemon, pokemon.idPokemon) && Objects.equals(cpfPokemon, pokemon.cpfPokemon);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idPokemon, cpfPokemon);
    }
}
