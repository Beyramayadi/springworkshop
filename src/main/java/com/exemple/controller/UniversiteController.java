package com.exemple.controller;


import com.exemple.entity.Universite;
import com.exemple.repository.IEtudiantRepository;
import com.exemple.repository.IUniversiteRepository;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
@Tag(name = "universite Management")

@RestController
public class UniversiteController {

    @Autowired
    IUniversiteRepository universiteRepository;

    @Operation(description = "retrieve all universites")

    @RequestMapping(method = RequestMethod.GET, value = "/api/univerite")
    public Iterable<Universite> getAll() {
        return universiteRepository.findAll();
    }
}
