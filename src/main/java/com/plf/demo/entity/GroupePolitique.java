package com.plf.demo.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jdk.dynalink.linker.LinkerServices;
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
public class GroupePolitique {

    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    String label;
    int total;
    @OneToMany(mappedBy = "groupePolitique", fetch = FetchType.LAZY)
    @JsonManagedReference
    List<Utilisateur> utilisateurs;

}
