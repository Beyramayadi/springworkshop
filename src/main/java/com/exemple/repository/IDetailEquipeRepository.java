package com.exemple.repository;


import com.exemple.entity.DetailEquipe;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IDetailEquipeRepository extends CrudRepository<DetailEquipe, Long> {


    Iterable<DetailEquipe> findAll();
}


