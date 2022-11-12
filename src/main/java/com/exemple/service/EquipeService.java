package com.exemple.service;


import com.exemple.entity.Equipe;
import org.springframework.stereotype.Service;

@Service
public interface EquipeService {

    public Equipe saveEquipe(Equipe equipe);
    public Equipe getEquipe(long id);
    public void deleteEquipe(long id);
}


