package com.example.Ejercicio.repository;

import com.example.Ejercicio.repository.entity.Product;
import org.springframework.data.repository.CrudRepository;

public interface IProductRepository extends CrudRepository<Product, Integer> {

}
