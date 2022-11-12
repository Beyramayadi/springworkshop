package com.exemple.repository;


import com.exemple.entity.Contrat;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IContratRepository extends CrudRepository<Contrat, Long> {



List<Contrat> findAll();



}
