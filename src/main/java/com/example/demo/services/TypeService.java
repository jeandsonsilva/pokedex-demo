package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Type;
import com.example.demo.repositories.TypeRepository;

@Service
public class TypeService {

    @Autowired
    private TypeRepository typeRepository;

    public Type getType(Integer idType) {
        Optional<Type> type = typeRepository.findById(idType);
        return type.orElse(null);
    }

    public Type saveType(Type type) {
        return typeRepository.save(type);
    }

    public Type updateType(Type type) {
        return typeRepository.save(type);
    }

    public void removeType(Integer idType) {
        typeRepository.deleteById(idType);
    }

    public List<Type> getAllTypes() {
        return typeRepository.findAll();
    }
}
