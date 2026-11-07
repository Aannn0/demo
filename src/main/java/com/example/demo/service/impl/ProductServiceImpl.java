package com.example.demo.service.impl;

import com.baomidou.mybatisplus.spring.service.impl.ServiceImpl;
import com.example.demo.entity.Product;
import com.example.demo.mapper.ProductMapper;
import com.example.demo.service.ProductService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service//业务组件
public class ProductServiceImpl extends ServiceImpl<ProductMapper, Product> implements ProductService {
//ProductServiceImpl继承ServiceImpl，拥有五种方法
    @Override
    public List<Product> getProductList() {
        return this.list();
    }
//全局查
    @Override
    public Product getById(Long id) {
        return super.getById(id);
    }
//按id查
    @Override
    public void add(Product product) {
        this.save(product);
    }
//增
    @Override
    public void update(Product product) {
        this.updateById(product);
    }
//按id改
    @Override
    public void deleteById(Long id) {
        this.removeById(id);
    }
//按id删
}
