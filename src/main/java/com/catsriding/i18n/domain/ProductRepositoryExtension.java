package com.catsriding.i18n.domain;

import java.util.Locale;

public interface ProductRepositoryExtension {

    ProductResult findProductWithTranslationById(Long id, Locale locale);

}
