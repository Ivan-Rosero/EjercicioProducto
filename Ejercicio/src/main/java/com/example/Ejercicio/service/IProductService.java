package com.example.Ejercicio.service;

import com.example.Ejercicio.dto.ProductDTO;

import java.util.List;

public interface IProductService {

    void save(ProductDTO productDTO);

    List<ProductDTO> getAll();

    String update(ProductDTO productDTO);
}
