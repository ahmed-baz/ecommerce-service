package com.skyros.ecommerce.entity;
// Generated Oct 15, 2020 2:41:51 PM by Hibernate Tools 4.3.1


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


/**
 * Category generated by Ahmed Baz
 */
@Entity
@Table(name = "category", schema = "public")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Category implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    private long id;
    @Column(name = "category_name")
    private String categoryName;
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "category")
    private List<Product> products = new ArrayList<>(0);

}


