package com.exemple.repository;


import com.exemple.entity.Contrat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IContratRepository extends JpaRepository<Contrat, Long> {



//List<Contrat> findAll();
//Contrat




}
