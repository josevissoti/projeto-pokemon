package com.project.resources;

import com.project.domains.Pokemon;
import com.project.domains.dtos.PokemonDTO;
import com.project.services.PokemonService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
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

    @GetMapping(value = "/{id}")
    public ResponseEntity<PokemonDTO> findById(@PathVariable Long id) {
        Pokemon obj = this.pokemonService.findById(id);
        return ResponseEntity.ok().body(new PokemonDTO(obj));
    }

    @GetMapping(value = "/cpf/{cpfPokemon}")
    public ResponseEntity<PokemonDTO> findByCpfPokemon(@PathVariable String cpfPokemon) {
        Pokemon obj = this.pokemonService.findByCpfPokemon(cpfPokemon);
        return ResponseEntity.ok().body(new PokemonDTO(obj));
    }

    @PostMapping
    public ResponseEntity<PokemonDTO> create(@Valid @RequestBody PokemonDTO dto) {
        Pokemon pokemon = pokemonService.create(dto);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
                .buildAndExpand(pokemon.getIdPokemon()).toUri();

        return ResponseEntity.created(uri).build();
    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<PokemonDTO> update(@PathVariable Long id, @Valid @RequestBody PokemonDTO dto) {
        Pokemon obj = pokemonService.update(id, dto);
        return ResponseEntity.ok().body(new PokemonDTO(obj));
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<PokemonDTO> delete(@PathVariable Long id) {
        pokemonService.delete(id);
        return ResponseEntity.noContent().build();
    }
}
