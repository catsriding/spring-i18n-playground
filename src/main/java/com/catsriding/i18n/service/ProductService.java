package com.catsriding.i18n.service;

import com.catsriding.i18n.domain.ProductRepository;
import com.catsriding.i18n.domain.ProductResult;
import java.util.Locale;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class ProductService {

    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public ProductResult retrieve(Long id) {
        Locale locale = LocaleContextHolder.getLocale();
        return productRepository.findProductWithTranslationById(id, locale);
    }
}
