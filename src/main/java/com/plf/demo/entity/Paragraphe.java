package com.plf.demo.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Paragraphe {

    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    int numero;
    String contenuAr;
    String contenuFr;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "article_id", referencedColumnName = "id")
    @JsonBackReference
    Article article;

}
