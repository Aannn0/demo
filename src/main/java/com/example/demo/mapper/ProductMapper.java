package com.example.demo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.demo.entity.Product;
import org.apache.ibatis.annotations.Mapper;

@Mapper//标注mapper组件，启动时mybatis生成实现类
public interface ProductMapper extends BaseMapper<Product> {
}//接口ProductMapper继承BaseMapper，自动生成selectList（），insert（），deleteById（），updateById（）和selectById（）这五个方法
