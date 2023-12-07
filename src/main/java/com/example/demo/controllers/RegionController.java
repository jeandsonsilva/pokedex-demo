package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.entities.Region;
import com.example.demo.services.RegionService;

import java.util.List;

@RestController
@RequestMapping("/region")
public class RegionController {

    @Autowired
    private RegionService regionService;

    @GetMapping("/{idRegion}")
    public Region getRegion(@PathVariable Integer idRegion) {
        return regionService.getRegion(idRegion);
    }

    @GetMapping("/all")
    public List<Region> getAllRegions() {
        return regionService.getAllRegions();
    }

    @PostMapping
    public Region createRegion(@RequestBody Region region) {
        return regionService.saveRegion(region);
    }

    @PutMapping
    public Region updateRegion(@RequestBody Region region) {
        return regionService.updateRegion(region);
    }

    @DeleteMapping("/{idRegion}")
    public void removeRegion(@PathVariable Integer idRegion) {
        regionService.removeRegion(idRegion);
    }
}
