package com.example.demo.service;

import com.baomidou.mybatisplus.spring.service.IService;
import com.example.demo.entity.Product;

import java.util.List;

//ProductService继承IService的方法
public interface ProductService extends IService<Product> {
    List<Product> getProductList();

    Product getById(Long id);//查

    void add(Product product);//增

    void update(Product product);//改

    void deleteById(Long id);//删
}
