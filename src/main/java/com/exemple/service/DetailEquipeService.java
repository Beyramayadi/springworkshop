package com.exemple.service;

import com.exemple.entity.DetailEquipe;
import org.springframework.stereotype.Service;

@Service
public interface DetailEquipeService {


    public DetailEquipe saveDetailEquipe(DetailEquipe detailEquipe);
    public DetailEquipe getDetailEquipe(long id);
    public void deleteDetailEquipe(long id);

}



