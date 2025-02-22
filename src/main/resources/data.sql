INSERT INTO products (category_id, price, image_url)
VALUES (10, 999.99, 'iphone.jpg');

INSERT INTO product_translations (product_id, locale, name, description)
VALUES (1, 'en', 'iPhone 15', 'The latest iPhone model'),
       (1, 'ko', '아이폰 15', '최신 아이폰 모델'),
       (1, 'ja', 'アイフォン15', '最新のアイフォンモデル');