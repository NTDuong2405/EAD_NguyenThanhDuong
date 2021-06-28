package com.example.enity;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int prodID;
    private String prodName;
    private String description;
    private Long dateOfMan;
    private Double price;
    @OneToOne(mappedBy = "product", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Sale sale;

    public Product(String prodName, String description, Long dateOfMan, Double price) {
        this.prodName = prodName;
        this.description = description;
        this.dateOfMan = dateOfMan;
        this.price = price;
    }
}