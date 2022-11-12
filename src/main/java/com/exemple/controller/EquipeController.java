package com.exemple.controller;


import com.exemple.entity.Equipe;
import com.exemple.repository.IEquipeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EquipeController {

    @Autowired
    IEquipeRepository equipeRepository;

    @RequestMapping(method= RequestMethod.GET,value = "/api/equipe")
    public Iterable<Equipe> getAll()
    {
        return equipeRepository.findAll();
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