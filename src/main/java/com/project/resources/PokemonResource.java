package com.project.resources;

import com.project.domains.dtos.PokemonDTO;
import com.project.services.PokemonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/pokemon")
public class PokemonResource {

    @Autowired
    private PokemonService pokemonService;

    @GetMapping
    public ResponseEntity<List<PokemonDTO>> findAll() {
        return ResponseEntity.ok().body(pokemonService.findAll());
    }
}
