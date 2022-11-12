package com.exemple.repository;


import com.exemple.entity.Equipe;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEquipeRepository extends CrudRepository<Equipe, Long> {
    Iterable<Equipe> findAll();
}



