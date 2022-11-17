package com.exemple.controller;


import com.exemple.entity.DetailEquipe;
import com.exemple.repository.IDetailEquipeRepository;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
@Tag(name = "detail equipe Management")

@RestController
public class DetailEquipeController {
    @Autowired
    IDetailEquipeRepository detailEquipeRepository;


    @Operation(description = "retrieve all details equipes")

    @RequestMapping(method = RequestMethod.GET , value = "/api/detailequipe")
    public Iterable<DetailEquipe> getAll()
    {
        return detailEquipeRepository.findAll();
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