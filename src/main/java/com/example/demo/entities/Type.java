package com.example.demo.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
public class Type {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false)
    private String vantagem;

    @Column(nullable = false)
    private String desvantagem;

    @ManyToMany(mappedBy = "types")
    private List<Pokemon> pokemons;
}
