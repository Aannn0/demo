CREATE DATABASE IF NOT EXISTS java_demo
    DEFAULT CHARACTER SET utf8mb4;

USE java_demo;

DROP TABLE IF EXISTS product;

CREATE TABLE product (
                         id           INT           NOT NULL AUTO_INCREMENT  COMMENT '主键id，自增',
                         product_name VARCHAR(100)  NOT NULL                 COMMENT '名称，非空唯一,不重名',
                         price        DECIMAL(10,2) NOT NULL                 COMMENT '价格，用 DECIMAL 保证精度',
                         stock        INT           DEFAULT 0                COMMENT '库存，默认 0',
                         category     VARCHAR(50)   DEFAULT NULL             COMMENT '分类，可空',
                         create_time  DATETIME      DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间，自动填当前时间',
                         PRIMARY KEY (id),
                         UNIQUE KEY uk_product_name (product_name)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb4
  COMMENT = '商品表';
