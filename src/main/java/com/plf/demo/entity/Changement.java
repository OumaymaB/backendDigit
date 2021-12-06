package com.plf.demo.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.plf.demo.enums.ChangementEnum;
import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Changement {

    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    ChangementEnum type;
    String raison;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "amendement_id", referencedColumnName = "id")
    @JsonBackReference
    Amendement amendement;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "article_id", referencedColumnName = "id")
    @JsonBackReference
    Article article;
}
