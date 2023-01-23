package com.example.Ejercicio.controller;

import com.example.Ejercicio.dto.ProductDTO;
import com.example.Ejercicio.service.IProductService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/product")
public class ProductController {
        private final IProductService iProductService;

        public ProductController(IProductService iProductService) {
            this.iProductService = iProductService;
        }

        @GetMapping()
        public ResponseEntity<?> getProductAll(){
            return ResponseEntity
                    .ok()
                    .body(iProductService.getAll());
        }
        @PostMapping()
        public ResponseEntity<?>
        saveProduct(@RequestBody ProductDTO productDTO){
            iProductService.save(productDTO);
            return new ResponseEntity<>(HttpStatus.CREATED);
        }

    }
