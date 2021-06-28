package com.example.enity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Sale {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int slNo;
    private int salesmanID;
    private String salesmanName;
    private Long DOS;
    @JoinColumn(name = "prodID")
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JsonIgnore
    private Product product;
    @Column(insertable = false, updatable = false)
    private int prodID;

    public Sale(int salesmanID, String salesmanName, Long DOS, Product product) {
        this.salesmanID = salesmanID;
        this.salesmanName = salesmanName;
        this.DOS = DOS;
        this.product = product;
    }
}
