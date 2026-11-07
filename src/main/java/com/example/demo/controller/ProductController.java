package com.example.demo.controller;

import com.example.demo.Result;
import com.example.demo.entity.Product;
import com.example.demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController//标记控制器，接收HTTP请求，将方法返回值转成JSON返回给前端
@RequestMapping("/product")//统一路径前缀
public class ProductController {
    @Autowired//注入依赖
    private ProductService productService;

    @GetMapping("/list")
    //全局查
    public Result<List<Product>> list() {
        return Result.success(productService.getProductList());
    }

    @GetMapping("/{id}")
    //接收Get请求，按id查询商品
    public Result<Product> getById(@PathVariable Long id){
        return Result.success(productService.getById(id));
    }//把URL里边的{id}值赋给id

    @PostMapping("/add")
    //接收Post请求，新增商品
    public Result<String> add(@RequestBody Product product){
        productService.add(product);
        return Result.success("success");
    }//把前端的JSON数据转成product对象

    @PutMapping("/update")
    //接收Put请求，更改商品
    public Result<String> update(@RequestBody Product product){
        productService.update(product);
        return Result.success("success");
    }

    @DeleteMapping("/delete/{id}")
    //接收Delete请求，删除商品
    public Result<String> delete(@PathVariable Long id){
        productService.deleteById(id);
        return  Result.success("success");
    }
}
