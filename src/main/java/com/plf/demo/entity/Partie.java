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
public class Partie {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    String labelAr;
    String labelFr;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "plf_id", referencedColumnName = "id")
    @JsonBackReference
    Plf plf;
    @OneToMany(mappedBy = "partie", fetch = FetchType.LAZY)
    @JsonManagedReference
    List<Titre> titres;




}
