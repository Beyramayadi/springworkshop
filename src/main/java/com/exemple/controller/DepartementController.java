package com.exemple.controller;


import com.exemple.entity.Departement;
import com.exemple.repository.IContratRepository;
import com.exemple.repository.IDepartementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DepartementController {

    @Autowired
    IDepartementRepository departementRepository;

    @RequestMapping(method= RequestMethod.GET, value="/api/departement")
    public Iterable<Departement> getAll(){
        return departementRepository.findAll();
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