package com.plf.demo.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Plf {

    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    String numero;
    String nom;
    int annee;
    @OneToMany(mappedBy = "plf", fetch = FetchType.LAZY)
    @JsonManagedReference
    List<Partie> parties;
    @OneToMany(mappedBy = "plf", fetch = FetchType.LAZY)
    @JsonManagedReference
    List<Utilisateur> utilisateurs;




}
