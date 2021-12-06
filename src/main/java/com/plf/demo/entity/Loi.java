package com.plf.demo.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Loi {

    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    String numero;
    String label;
    Date annee;
    String type;
    @OneToMany(mappedBy = "loi", fetch = FetchType.LAZY)
    @JsonManagedReference
    List<Article> articles;

}
