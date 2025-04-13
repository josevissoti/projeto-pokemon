package com.project.services;

import com.project.domains.Pokemon;
import com.project.domains.dtos.PokemonDTO;
import com.project.repositories.PokemonRepository;
import com.project.services.exceptions.DataIntegrityViolationException;
import com.project.services.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class PokemonService {

    @Autowired
    private PokemonRepository pokemonRepository;

    public List<PokemonDTO> findAll() {
        return pokemonRepository.findAll().stream()
                .map(obj -> new PokemonDTO(obj))
                .collect(Collectors.toList());
    }

    public Pokemon findById(Long id) {
        Optional<Pokemon> obj = pokemonRepository.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Pokemon não encontrado. ID: " + id));
    }

    public Pokemon findByCpfPokemon(String cpfPokemon) {
        Optional<Pokemon> obj = pokemonRepository.findByCpfPokemon(cpfPokemon);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Pokemon não encontrado. CPF: " + cpfPokemon));
    }

    public Pokemon create(PokemonDTO dto) {
        dto.setIdPokemon(null);
        validaPokemon(dto);
        Pokemon obj = new Pokemon(dto);
        return pokemonRepository.save(obj);
    }

    private void validaPokemon(PokemonDTO objDto) {
        Optional<Pokemon> obj = pokemonRepository.findByCpfPokemon(objDto.getCpfPokemon());
        if (obj.isPresent() && obj.get().getIdPokemon() != objDto.getIdPokemon()) {
            throw new DataIntegrityViolationException("CPF já cadastrado no sistema");
        }
    }

    public Pokemon update(Long id, PokemonDTO objDto) {
        objDto.setIdPokemon(id);
        Pokemon oldObj = findById(id);
        validaPokemon(objDto);
        oldObj = new Pokemon(objDto);
        return pokemonRepository.save(oldObj);
    }

    public void delete(Long id) {
        Pokemon pokemon = findById(id);
        pokemonRepository.deleteById(id);
    }

}
