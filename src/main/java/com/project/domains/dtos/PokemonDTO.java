package com.project.domains.dtos;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.project.domains.Pokemon;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import org.hibernate.validator.constraints.br.CPF;

import java.time.LocalDate;

public class PokemonDTO {

    private Long idPokemon;

    @NotNull(message = "O campo nome não pode ser nulo")
    @NotBlank(message = "O campo nome não pode ser vazio")
    private String nome;

    private int tipoPokemon;

    private int nivelPokemon;

    @NotNull(message = "O campo PontosDeVida não pode ser nulo")
    private int pontosDeVida;

    @NotNull(message = "O campo ataque não pode ser nulo")
    private int ataque;

    @NotNull(message = "O campo defesa não pode ser nulo")
    private int defesa;

    @NotNull(message = "O campo velocidade não pode ser nulo")
    private int velocidade;

    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate dataDeCaptura;

    @NotNull(message = "O campo CPF não pode ser nulo")
    @NotBlank(message = "O campo CPF não pode ser vazio")
    @CPF
    private String cpfPokemon;

    public PokemonDTO() {
    }

    public Long getIdPokemon() {
        return idPokemon;
    }

    public void setIdPokemon(Long idPokemon) {
        this.idPokemon = idPokemon;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getTipoPokemon() {
        return tipoPokemon;
    }

    public void setTipoPokemon(int tipoPokemon) {
        this.tipoPokemon = tipoPokemon;
    }

    public int getNivelPokemon() {
        return nivelPokemon;
    }

    public void setNivelPokemon(int nivelPokemon) {
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

    public LocalDate getDataDeCaptura() {
        return dataDeCaptura;
    }

    public void setDataDeCaptura(LocalDate dataDeCaptura) {
        this.dataDeCaptura = dataDeCaptura;
    }

    public String getCpfPokemon() {
        return cpfPokemon;
    }

    public void setCpfPokemon(String cpfPokemon) {
        this.cpfPokemon = cpfPokemon;
    }

    public PokemonDTO(Pokemon pokemon) {
        this.idPokemon = pokemon.getIdPokemon();
        this.nome = pokemon.getNome();
        this.tipoPokemon = pokemon.getTipoPokemon().getId();
        this.nivelPokemon = pokemon.getNivelPokemon().getId();
        this.pontosDeVida = pokemon.getPontosDeVida();
        this.ataque = pokemon.getAtaque();
        this.defesa = pokemon.getDefesa();
        this.velocidade = pokemon.getVelocidade();
        this.dataDeCaptura = pokemon.getDataCaptura();
        this.cpfPokemon = pokemon.getCpfPokemon();


    }
}
