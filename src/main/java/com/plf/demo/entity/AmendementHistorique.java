package com.plf.demo.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AmendementHistorique extends Article{
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "amendementActuel_id", referencedColumnName = "id")
    @JsonBackReference
    AmendementActuel amendementActuel;
}
