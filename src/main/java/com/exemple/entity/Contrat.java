package com.exemple.entity;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Data
@Entity

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Builder
@Table(name = "Contrat")
public class Contrat implements Serializable {
    @Id
    @GeneratedValue
    private long id;

    @Temporal (TemporalType.DATE)
    private Date dateDebutContrat;
    @Temporal (TemporalType.DATE)
    private Date dateFinContrat;
    @Column(name="specialite")
    private Specialite specialite;
  //  @Column(name="archive")
    @Column(nullable = true,name="archive")
    private boolean archive;

@ManyToOne
    Etudiant etudiant;


}
