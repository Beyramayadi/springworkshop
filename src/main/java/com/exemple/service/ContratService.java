package com.exemple.service;

import com.exemple.entity.Contrat;

import org.springframework.stereotype.Service;

import java.util.List;


public interface ContratService  {


    public Contrat saveContrat(Contrat contrat);



    public Contrat getContrat (long id);
    public void deleteContrat(long id);
    List<Contrat> getAll();
}
