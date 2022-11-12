package com.exemple.controller;


import com.exemple.entity.Universite;
import com.exemple.repository.IEtudiantRepository;
import com.exemple.repository.IUniversiteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UniversiteController {

    @Autowired
    IUniversiteRepository universiteRepository;

    @RequestMapping(method = RequestMethod.GET, value = "/api/univerite")
    public Iterable<Universite> getAll() {
        return universiteRepository.findAll();
    }
}
