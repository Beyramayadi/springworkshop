package com.exemple.repository;


import com.exemple.entity.Universite;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUniversiteRepository extends CrudRepository<Universite, Long> {
    Iterable<Universite> findAll();
}
