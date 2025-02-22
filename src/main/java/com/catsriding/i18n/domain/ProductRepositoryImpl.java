package com.catsriding.i18n.domain;

import static com.catsriding.i18n.domain.QProduct.product;
import static com.catsriding.i18n.domain.QProductTranslation.productTranslation;

import com.querydsl.core.types.Projections;
import com.querydsl.jpa.impl.JPAQueryFactory;
import java.util.Locale;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ProductRepositoryImpl implements ProductRepositoryExtension {

    private final JPAQueryFactory queryFactory;

    public ProductRepositoryImpl(JPAQueryFactory queryFactory) {
        this.queryFactory = queryFactory;
    }

    @Override
    public ProductResult findProductWithTranslationById(Long id, Locale locale) {
        return queryFactory
                .select(Projections.constructor(
                        ProductResult.class,
                        product.id,
                        product.price,
                        product.imageUrl,
                        productTranslation.name,
                        productTranslation.description
                ))
                .from(product)
                .innerJoin(productTranslation).on(productTranslation.product.eq(product))
                .where(
                        product.id.eq(id),
                        productTranslation.locale.eq(locale.getLanguage())
                )
                .fetchOne();
    }
}
