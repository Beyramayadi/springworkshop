package com.exemple.entity;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Data
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Builder
@Table(name = "Etudiant")

public class Etudiant implements Serializable {
    @Id
    @GeneratedValue
    private long idEtudiant;
    @Column(name="prenomE")
    private String prenomE;
    @Column(name="nomE")
    private String nomE;
    @Column(name="option")
    private Option option;


    @ManyToMany(cascade = CascadeType.ALL)
    private Set<Equipe> equipes;

    @OneToMany(cascade = CascadeType.ALL , mappedBy="etudiant")
    private Set<Contrat> Contrats;

    @ManyToOne
    Departement Departement;



}
