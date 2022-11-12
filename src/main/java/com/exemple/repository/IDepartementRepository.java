package com.exemple.repository;


import com.exemple.entity.Departement;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IDepartementRepository extends CrudRepository<Departement, Long> {


    Iterable<Departement> findAll();
}




