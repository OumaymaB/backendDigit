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
public class Chapitre {

    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    String labelAr;
    String labelFr;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "titre_id", referencedColumnName = "id")
    @JsonBackReference
    Titre titre;
    @OneToMany(mappedBy = "chapitre", fetch = FetchType.LAZY)
    @JsonManagedReference
    List<Article> articles;
}
