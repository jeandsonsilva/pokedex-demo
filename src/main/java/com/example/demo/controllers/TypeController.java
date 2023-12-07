package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.entities.Type;
import com.example.demo.services.TypeService;

import java.util.List;

@RestController
@RequestMapping("/type")
public class TypeController {

    @Autowired
    private TypeService typeService;

    @GetMapping("/{idType}")
    public Type getType(@PathVariable Integer idType) {
        return typeService.getType(idType);
    }

    @GetMapping("/all")
    public List<Type> getAllTypes() {
        return typeService.getAllTypes();
    }

    @PostMapping
    public Type createType(@RequestBody Type type) {
        return typeService.saveType(type);
    }

    @PutMapping
    public Type updateType(@RequestBody Type type) {
        return typeService.updateType(type);
    }

    @DeleteMapping("/{idType}")
    public void removeType(@PathVariable Integer idType) {
        typeService.removeType(idType);
    }
}
