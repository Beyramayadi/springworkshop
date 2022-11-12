package com.exemple.service;


import com.exemple.entity.Universite;
import org.springframework.stereotype.Service;

@Service
public interface UniversiteService {

    public Universite saveUniversite(Universite universite);


    public Universite getUniversite(long id);
    public void deleteUniversite(long id);
}
