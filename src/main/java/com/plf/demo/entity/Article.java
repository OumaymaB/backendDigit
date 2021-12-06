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
@FieldDefaults(level = AccessLevel.PRIVATE)
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class Article {

    @Id @GeneratedValue(strategy = GenerationType.TABLE)
    Long id;
    String label;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "chapitre_id", referencedColumnName = "id")
    @JsonBackReference
    Chapitre chapitre;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "loi_id", referencedColumnName = "id")
    @JsonBackReference
    Loi loi;
    @OneToMany(mappedBy = "article", fetch = FetchType.LAZY)
    @JsonManagedReference
    List<Paragraphe> paragraphes;
    @OneToMany(mappedBy = "article", fetch = FetchType.LAZY)
    @JsonManagedReference
    List<Changement> changements;


}
