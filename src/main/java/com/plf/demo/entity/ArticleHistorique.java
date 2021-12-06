package com.plf.demo.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ArticleHistorique extends Article{

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "articleActuel_id", referencedColumnName = "id")
    @JsonBackReference
    ArticleActuel articleActuel;
}
