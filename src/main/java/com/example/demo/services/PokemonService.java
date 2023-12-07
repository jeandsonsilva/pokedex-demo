package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Pokemon;
import com.example.demo.repositories.PokemonRepository;

@Service
public class PokemonService {

    @Autowired
    private PokemonRepository pokemonRepository;

    public Pokemon getPokemon(Integer idPokemon) {
        Optional<Pokemon> pokemon = pokemonRepository.findById(idPokemon);
        return pokemon.orElse(null);
    }

    public Pokemon savePokemon(Pokemon pokemon) {
        return pokemonRepository.save(pokemon);
    }

    public Pokemon updatePokemon(Pokemon pokemon) {
        return pokemonRepository.save(pokemon);
    }

    public void removePokemon(Integer idPokemon) {
        pokemonRepository.deleteById(idPokemon);
    }

    public List<Pokemon> getAllPokemon() {
        return pokemonRepository.findAll();
    }
}
