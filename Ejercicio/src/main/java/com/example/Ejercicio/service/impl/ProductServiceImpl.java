package com.example.Ejercicio.service.impl;

import com.example.Ejercicio.dto.ProductDTO;
import com.example.Ejercicio.repository.IProductRepository;
import com.example.Ejercicio.repository.entity.Product;
import com.example.Ejercicio.service.IProductService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductServiceImpl implements IProductService {

    private final IProductRepository productRepository;

    public ProductServiceImpl(IProductRepository productRepository){
        this.productRepository = productRepository;
    }

    @Override
    public List<ProductDTO> getAll(){
        List<Product> productList = (List<Product>) productRepository.findAll();
        return productList.stream()
                .map(ProductDTO::new)
                .collect(Collectors.toList());
    }

    @Override
    public String update(ProductDTO productDTO) {
        return null;
    }

    @Override
    public void save(ProductDTO productDTO){
        if(!productRepository.existsById(productDTO.getIdProduct())){
            productRepository.save(new Product(productDTO));
        }
    }
}
