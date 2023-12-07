package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.entities.Pokemon;
import com.example.demo.services.PokemonService;

import java.util.List;

@RestController
@RequestMapping("/pokemon")
public class PokemonController {

    @Autowired
    private PokemonService pokemonService;

    @GetMapping("/{idPokemon}")
    public Pokemon getPokemon(@PathVariable Integer idPokemon) {
        return pokemonService.getPokemon(idPokemon);
    }

    @GetMapping("/all")
    public List<Pokemon> getAllPokemon() {
        return pokemonService.getAllPokemon();
    }

    @PostMapping
    public Pokemon createPokemon(@RequestBody Pokemon pokemon) {
        return pokemonService.savePokemon(pokemon);
    }

    @PutMapping
    public Pokemon updatePokemon(@RequestBody Pokemon pokemon) {
        return pokemonService.updatePokemon(pokemon);
    }

    @DeleteMapping("/{idPokemon}")
    public void removePokemon(@PathVariable Integer idPokemon) {
        pokemonService.removePokemon(idPokemon);
    }
}
