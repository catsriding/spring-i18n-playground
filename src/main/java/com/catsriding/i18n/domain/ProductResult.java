package com.catsriding.i18n.domain;

import java.math.BigDecimal;

public record ProductResult(
        Long id,
        BigDecimal price,
        String imageUrl,
        String name,
        String description
) {

}
