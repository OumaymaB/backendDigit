package com.plf.demo.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ArticleActuel extends Article{
    @OneToMany(mappedBy = "articleActuel", fetch = FetchType.LAZY)
    @JsonManagedReference
    List<ArticleHistorique> articleHistoriques;
}
