package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Ability;
import com.example.demo.repositories.AbilityRepository;

@Service
public class AbilityService {

    @Autowired
    private AbilityRepository abilityRepository;

    public Ability getAbility(Integer idAbility) {
        Optional<Ability> ability = abilityRepository.findById(idAbility);
        return ability.orElse(null);
    }

    public Ability saveAbility(Ability ability) {
        return abilityRepository.save(ability);
    }

    public Ability updateAbility(Ability ability) {
        return abilityRepository.save(ability);
    }

    public void removeAbility(Integer idAbility) {
        abilityRepository.deleteById(idAbility);
    }

    public List<Ability> getAllAbilities() {
        return abilityRepository.findAll();
    }
}
