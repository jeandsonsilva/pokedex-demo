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

    @ManyToMany(mappedBy = "types")
    private List<Pokemon> pokemons;

    @ManyToMany
    @JoinTable(
            name = "type_vantagem",
            joinColumns = @JoinColumn(name = "type_id"),
            inverseJoinColumns = @JoinColumn(name = "modify_id")
    )
    private List<Modify> vantagens;

    @ManyToMany
    @JoinTable(
            name = "type_desvantagem",
            joinColumns = @JoinColumn(name = "type_id"),
            inverseJoinColumns = @JoinColumn(name = "modify_id")
    )
    private List<Modify> desvantagens;
}
