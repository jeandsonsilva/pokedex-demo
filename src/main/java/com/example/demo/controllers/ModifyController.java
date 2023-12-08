package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.entities.Modify;
import com.example.demo.services.ModifyService;

import java.util.List;

@RestController
@RequestMapping("/modify")
public class ModifyController {

    @Autowired
    private ModifyService modifyService;

    @GetMapping("/{idModify}")
    public Modify getModify(@PathVariable Integer idModify) {
        return modifyService.getModify(idModify);
    }

    @GetMapping("/all")
    public List<Modify> getAllModifies() {
        return modifyService.getAllModifies();
    }

    @PostMapping
    public Modify createModify(@RequestBody Modify modify) {
        return modifyService.saveModify(modify);
    }

    @PutMapping
    public Modify updateModify(@RequestBody Modify modify) {
        return modifyService.updateModify(modify);
    }

    @DeleteMapping("/{idModify}")
    public void removeModify(@PathVariable Integer idModify) {
        modifyService.removeModify(idModify);
    }
}
