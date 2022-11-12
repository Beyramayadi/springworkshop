package com.exemple.service;


import com.exemple.entity.Departement;
import org.springframework.stereotype.Service;

@Service
public interface DepartementService {


    public Departement saveDepartement(Departement departement);

    public Departement getDepartement (long id);
    public void deleteDepartement(long id);
}


