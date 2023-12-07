package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Region;
import com.example.demo.repositories.RegionRepository;

@Service
public class RegionService {

    @Autowired
    private RegionRepository regionRepository;

    public Region getRegion(Integer idRegion) {
        Optional<Region> region = regionRepository.findById(idRegion);
        return region.orElse(null);
    }

    public Region saveRegion(Region region) {
        return regionRepository.save(region);
    }

    public Region updateRegion(Region region) {
        return regionRepository.save(region);
    }

    public void removeRegion(Integer idRegion) {
        regionRepository.deleteById(idRegion);
    }

    public List<Region> getAllRegions() {
        return regionRepository.findAll();
    }
}
