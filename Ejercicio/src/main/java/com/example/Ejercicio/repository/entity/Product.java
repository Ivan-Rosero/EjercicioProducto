package com.example.Ejercicio.repository.entity;

import com.example.Ejercicio.dto.ProductDTO;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Product {

    @Id
    private Integer idProduct;

    @Column(name = "PRODUCT_Name", nullable = false)
    private String name;

    public Product() {
    }

    public Product(Integer idProduct, String name) {
        this.idProduct = idProduct;
        this.name = name;
    }

    public Product(ProductDTO productDTO) {
        this.idProduct = productDTO.getIdProduct();
        this.name = productDTO.getName();
    }

    public Integer getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(Integer idProduct) {
        this.idProduct = idProduct;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
