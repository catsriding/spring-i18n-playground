CREATE TABLE IF NOT EXISTS products
(
    id          BIGINT AUTO_INCREMENT PRIMARY KEY,
    category_id BIGINT         NOT NULL,
    price       DECIMAL(10, 2) NOT NULL,
    image_url   VARCHAR(255)   NOT NULL
);

CREATE TABLE IF NOT EXISTS product_translations
(
    id          BIGINT AUTO_INCREMENT PRIMARY KEY,
    product_id  BIGINT       NOT NULL,
    locale      VARCHAR(10)  NOT NULL,
    name        VARCHAR(255) NOT NULL,
    description TEXT         NOT NULL,
    UNIQUE KEY unique_translation (product_id, locale),
    FOREIGN KEY (product_id) REFERENCES products (id) ON DELETE CASCADE
);