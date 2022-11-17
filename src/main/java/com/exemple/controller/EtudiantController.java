package com.exemple.controller;


import com.exemple.entity.Etudiant;
import com.exemple.repository.IEtudiantRepository;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
@Tag(name = "etudiant Management")

@RestController
public class EtudiantController {

    @Autowired
    IEtudiantRepository etudiantRepository;

    @Operation(description = "retrieve all etudiants")

    @RequestMapping(method= RequestMethod.GET, value="/api/etudiant")
    public  Iterable<Etudiant> gellAll(){
        return etudiantRepository.findAll();
    }
}

/*
@RestController
public class ContratController {

    @Autowired
     IContratRepository contratRepository;

   @RequestMapping(method= RequestMethod.GET, value="/api/contrat")
    public Iterable<Contrat> getAll()
   {
       return contratRepository.findAll();
   }


}

 */