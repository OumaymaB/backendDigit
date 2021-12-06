package com.plf.demo.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.plf.demo.enums.VoteEnum;
import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Vote {

    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    VoteEnum status;
    int resultat;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "amendement_id", referencedColumnName = "id")
    @JsonBackReference
    Amendement amendement;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "utilisateur_id", referencedColumnName = "id")
    @JsonBackReference
    Utilisateur utilisateur;

}
