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
@Table(name = "Universite")

public class Universite {

    @Id
    @GeneratedValue
    private long idUniv;
    @Column(name="nomUniv")
    private String nomUniv;

    @OneToMany(cascade = CascadeType.ALL)
    private Set<Departement> Departements;


}
