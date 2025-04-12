package com.project.services;

import com.project.domains.Pokemon;
import com.project.domains.enums.NivelPokemon;
import com.project.domains.enums.TipoPokemon;
import com.project.repositories.PokemonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;

@Service
public class DBService {

    @Autowired
    private PokemonRepository pokemonRepository;

    public void initDB(){
        Pokemon pokemon01 = new Pokemon(null, "Swampert", TipoPokemon.AGUA, NivelPokemon.AVANCADO, 300, 400, 300, 200, LocalDate.of(2024, Month.JANUARY, 12), "260");
        Pokemon pokemon02 = new Pokemon(null, "Gliscor", TipoPokemon.TERRESTE, NivelPokemon.INTERMEDIARIO, 400, 300, 400, 200, LocalDate.of(2024, Month.JULY, 5), "472");
        Pokemon pokemon03 = new Pokemon(null, "Ferrothorn", TipoPokemon.METAL, NivelPokemon.INTERMEDIARIO, 340, 300, 500, 100, LocalDate.of(2024, Month.OCTOBER, 23), "598");
        Pokemon pokemon04 = new Pokemon(null, "Garchomp", TipoPokemon.DRAGAO, NivelPokemon.AVANCADO, 300, 500, 200, 400, LocalDate.of(2024, Month.DECEMBER, 3), "445");
        Pokemon pokemon05 = new Pokemon(null, "Mimikyu", TipoPokemon.FANTASMA, NivelPokemon.INICIANTE, 200, 500, 200, 500, LocalDate.of(2024, Month.MARCH, 8), "778");
        Pokemon pokemon06 = new Pokemon(null, "Giratina", TipoPokemon.SOMBRIO, NivelPokemon.LENDARIO, 400, 400, 400, 400, LocalDate.of(2025, Month.APRIL, 11), "487");

        pokemonRepository.save(pokemon01);
        pokemonRepository.save(pokemon02);
        pokemonRepository.save(pokemon03);
        pokemonRepository.save(pokemon04);
        pokemonRepository.save(pokemon05);
        pokemonRepository.save(pokemon06);

    }
}
