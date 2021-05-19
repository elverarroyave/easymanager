package com.easymanager.easymanager.sale.model;


import com.easymanager.easymanager.product.model.Product;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table
public class SaleDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    //OneToOne unidirectional with Product.
    @OneToOne
    @JoinColumn(name = "product_id", referencedColumnName = "id")
    private Product product;

    private int amount;

    public double getPrice(){
        return (product.getPublicPrice()*amount);
    }

    public SaleDetail(Long id, Product product, int amount) {
        this.id = id;
        this.product = product;
        this.amount = amount;
    }

    public SaleDetail(){}
}