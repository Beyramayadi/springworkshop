package com.exemple.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Data
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Builder
@Table(name = "DetailEquipe")

public class DetailEquipe {

    @Id
    @Column(name="salle")
    private int salle;
    @Column(name="nomUniv")
    private String thematique;


    @OneToOne(mappedBy="detailEquipe")
    private Equipe equipe;


}
