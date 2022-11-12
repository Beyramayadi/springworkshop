package com.exemple.service;


import com.exemple.entity.Etudiant;
import org.springframework.stereotype.Service;

@Service
public interface EtudiantService {

    public Etudiant saveEtudiant(Etudiant etudiant);
    public Etudiant getEtudiant(long id);
    public void deleteEquipe(long id);
}

