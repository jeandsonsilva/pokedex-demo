package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.entities.Ability;
import com.example.demo.services.AbilityService;

import java.util.List;

@RestController
@RequestMapping("/ability")
public class AbilityController {

    @Autowired
    private AbilityService abilityService;

    @GetMapping("/{idAbility}")
    public Ability getAbility(@PathVariable Integer idAbility) {
        return abilityService.getAbility(idAbility);
    }

    @GetMapping("/all")
    public List<Ability> getAllAbilities() {
        return abilityService.getAllAbilities();
    }

    @PostMapping
    public Ability createAbility(@RequestBody Ability ability) {
        return abilityService.saveAbility(ability);
    }

    @PutMapping
    public Ability updateAbility(@RequestBody Ability ability) {
        return abilityService.updateAbility(ability);
    }

    @DeleteMapping("/{idAbility}")
    public void removeAbility(@PathVariable Integer idAbility) {
        abilityService.removeAbility(idAbility);
    }
}
