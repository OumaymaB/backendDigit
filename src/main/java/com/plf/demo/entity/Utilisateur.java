package com.plf.demo.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.springframework.web.bind.annotation.GetMapping;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Utilisateur {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    String nom;
    String prenom;
    String fonction;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "plf_id", referencedColumnName = "id")
    @JsonBackReference
    Plf plf;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "groupePolitique_id", referencedColumnName = "id")
    @JsonBackReference
    GroupePolitique groupePolitique;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "comission_id", referencedColumnName = "id")
    @JsonBackReference
    Comission comission;
    @OneToMany(mappedBy = "utilisateur", fetch = FetchType.LAZY)
    @JsonManagedReference
    List<Vote> votes;


}
