package com.plf.demo.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonFormat;
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
@FieldDefaults(level = AccessLevel.PRIVATE)
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class Amendement {

    @Id @GeneratedValue(strategy = GenerationType.TABLE)
    Long id;
    @Temporal(TemporalType.DATE)
    @JsonFormat(pattern = "yyyy-MM-dd")
    Date date;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "comission_id", referencedColumnName = "id")
    @JsonBackReference
    Comission comission;
    @OneToMany(mappedBy = "amendement", fetch = FetchType.LAZY)
    @JsonManagedReference
    List<Vote> votes;
    @OneToMany(mappedBy = "amendement", fetch = FetchType.LAZY)
    @JsonManagedReference
    List<Changement> changements;
}
