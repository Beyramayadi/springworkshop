package com.exemple.service;

import com.exemple.entity.Contrat;
import com.exemple.repository.IContratRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContratServiceImpl implements ContratService {
    @Autowired
    IContratRepository cR;

    @Override
    public Contrat saveContrat(Contrat contrat) {
       return cR.save(contrat);
    }

    @Override
    public Contrat getContrat(long id) {
        return null;
    }

    @Override
    public void deleteContrat(long id) {
         cR.deleteById(id);
    }

    @Override
    public List<Contrat> getAll() {

        return cR.findAll();
    }
    @Override
    public Contrat updateContrat(Contrat contrat) {
      return  cR.save(contrat);
    }
    @Override
    public Contrat getContratById(long id){
        return cR.findById(id).get();
    }


}
