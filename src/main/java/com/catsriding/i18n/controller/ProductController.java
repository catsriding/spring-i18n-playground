package com.catsriding.i18n.controller;

import com.catsriding.i18n.domain.ProductResult;
import com.catsriding.i18n.service.ProductService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class ProductController {

    private final ProductService service;

    public ProductController(ProductService service) {
        this.service = service;
    }

    @GetMapping("/products/{id}")
    public ResponseEntity<?> products(
            @PathVariable Long id
    ) {
        ProductResult result = service.retrieve(id);
        return ResponseEntity
                .ok(result);
    }

}
