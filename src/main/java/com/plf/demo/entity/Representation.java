package com.plf.demo.entity;

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
public class Representation {

    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    String lebel;
    @OneToMany(mappedBy = "representation", fetch = FetchType.LAZY)
    @JsonManagedReference
    List<Comission> comissions;
}
