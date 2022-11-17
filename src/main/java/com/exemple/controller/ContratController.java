package com.exemple.controller;


import com.exemple.entity.Contrat;
import com.exemple.repository.IContratRepository;
import com.exemple.service.ContratService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(name = "contrat Management")
@RestController
public class ContratController {

    @Autowired
     ContratService cS;

    @Operation(description = "retrieve all contrats")
   @GetMapping("/api/contrat")
    public List<Contrat> getAll()
   {
       return cS.getAll();
   }

    @Operation(description = "delete all contrats")
   @RequestMapping(method = RequestMethod.DELETE , value="/api/contrat/{id}")
    public ResponseEntity deleteContrat(@PathVariable long id)
   {

       cS.deleteContrat(id);
        return new ResponseEntity<>(HttpStatus.OK);
   }


    @Operation(description = "add a contrat")

    @PostMapping("/api/contrat")
    public ResponseEntity addContrat(Contrat contrat)
   {
       cS.saveContrat(contrat);
       return  new ResponseEntity<>(HttpStatus.OK);
   }

}
