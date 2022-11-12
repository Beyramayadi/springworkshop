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
@Table(name="Equipe")
public class Equipe  implements Serializable {
    @Id
    @GeneratedValue
    private long id;
    @Column (name="nomEquipe")
    private String nomEquipe;
    @Column (name="niveau")

    private Niveau niveau;


    @OneToOne
    private DetailEquipe detailEquipe;


    @ManyToMany(mappedBy="equipes", cascade = CascadeType.ALL)
    private Set<Etudiant> etudiants;


}
