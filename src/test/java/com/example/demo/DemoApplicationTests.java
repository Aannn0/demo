package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;//导入SpringBoot注解
@SpringBootTest//读配置，连数据库
class DemoApplicationTests {

    @Test//测试方法
    void contextLoads() {
    }
//只是测试能否启动，留空，无需断言
}
