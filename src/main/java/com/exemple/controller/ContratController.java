package com.exemple.controller;


import com.exemple.entity.Contrat;
import com.exemple.repository.IContratRepository;
import com.exemple.service.ContratService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ContratController {

    @Autowired
     ContratService cS;

   @GetMapping("/api/contrat")
    public List<Contrat> getAll()
   {
       return cS.getAll();
   }

   @RequestMapping(method = RequestMethod.DELETE , value="/api/contrat/{id}")
    public ResponseEntity deleteContrat(@PathVariable long id)
   {

       cS.deleteContrat(id);
        return new ResponseEntity<>(HttpStatus.OK);
   }


   @PostMapping("/api/contrat")
    public ResponseEntity addContrat(Contrat contrat)
   {
       cS.saveContrat(contrat);
       return  new ResponseEntity<>(HttpStatus.OK);
   }

}
