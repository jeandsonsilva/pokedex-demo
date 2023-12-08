package com.example.demo.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
public class Modify {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ElementCollection
    private List<String> vantagens;

    @ElementCollection
    private List<String> desvantagens;

    @ManyToMany(mappedBy = "vantagens")
    private List<Type> typesVantagem;

    @ManyToMany(mappedBy = "desvantagens")
    private List<Type> typesDesvantagem;
}
