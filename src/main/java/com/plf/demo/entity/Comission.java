package com.plf.demo.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.springframework.data.repository.cdi.Eager;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Comission {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    String label;
    @OneToMany(mappedBy = "comission", fetch = FetchType.LAZY)
    @JsonManagedReference
    List<Utilisateur> utilisateurs;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "representation_id", referencedColumnName = "id")
    @JsonBackReference
    Representation representation;
    @OneToMany(mappedBy = "comission", fetch = FetchType.LAZY)
    @JsonManagedReference
    List<Amendement> amendements;

}
