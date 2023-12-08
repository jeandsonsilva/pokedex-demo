package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Modify;
import com.example.demo.repositories.ModifyRepository;

@Service
public class ModifyService {

    @Autowired
    private ModifyRepository modifyRepository;

    public Modify getModify(Integer idModify) {
        Optional<Modify> modify = modifyRepository.findById(idModify);
        return modify.orElse(null);
    }

    public Modify saveModify(Modify modify) {
        return modifyRepository.save(modify);
    }

    public Modify updateModify(Modify modify) {
        return modifyRepository.save(modify);
    }

    public void removeModify(Integer idModify) {
        modifyRepository.deleteById(idModify);
    }

    public List<Modify> getAllModifies() {
        return modifyRepository.findAll();
    }
}
