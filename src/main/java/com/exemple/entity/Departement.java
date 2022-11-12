package com.exemple.entity;

import lombok.*;

import javax.persistence.*;
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
@Table(name = "Departement")
public class Departement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idDepart")

    private int idDepart;
    @Column(name = "nomDepart")
    private String nomDepart;


    @OneToMany(cascade = CascadeType.ALL , mappedBy="Departement")
    private Set<Etudiant> Etudiants;



}
