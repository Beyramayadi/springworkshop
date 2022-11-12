package com.exemple.repository;


import com.exemple.entity.Etudiant;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEtudiantRepository extends CrudRepository<Etudiant , Long> {

    Iterable<Etudiant> findAll();
}
