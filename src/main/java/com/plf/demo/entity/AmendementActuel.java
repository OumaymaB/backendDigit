package com.plf.demo.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
public class AmendementActuel extends Amendement {
    @OneToMany(mappedBy = "amendementActuel", fetch = FetchType.LAZY)
    @JsonManagedReference
    List<AmendementHistorique> amendementHistoriques;
}
