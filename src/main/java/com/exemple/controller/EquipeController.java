package com.exemple.controller;


import com.exemple.entity.Equipe;
import com.exemple.repository.IEquipeRepository;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
@Tag(name = "equipe Management")

@RestController
public class EquipeController {

    @Autowired
    IEquipeRepository equipeRepository;

    @Operation(description = "retrieve all equipes")

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