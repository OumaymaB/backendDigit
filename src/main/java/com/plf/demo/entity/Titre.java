package com.plf.demo.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
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
public class Titre {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    String labelAr;
    String labelFr;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "partie_id", referencedColumnName = "id")
    @JsonBackReference
    Partie partie;
    @OneToMany(mappedBy = "titre", fetch = FetchType.LAZY)
    @JsonManagedReference
    List<Chapitre> chapitres;

}
