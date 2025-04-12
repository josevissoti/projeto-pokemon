package com.project.services;

import com.project.domains.dtos.PokemonDTO;
import com.project.repositories.PokemonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
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

}
