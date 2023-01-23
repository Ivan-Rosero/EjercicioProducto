package com.example.Ejercicio.dto;

import com.example.Ejercicio.repository.entity.Product;

public class ProductDTO {

    private Integer idProduct;

    private String name;

    public ProductDTO() {
    }

    public ProductDTO(Integer idProduct, String name) {
        this.idProduct = idProduct;
        this.name = name;
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

    public ProductDTO(Product product){
        this.idProduct = product.getIdProduct();
        this.name = product.getName();
    }
}
