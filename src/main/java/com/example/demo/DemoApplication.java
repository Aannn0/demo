package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//这个spring boot application可以自动帮忙装好配置，扫描controller，service和mapper等spring组件以及本包和其他子包，自带服务器tomcat，三合一

@SpringBootApplication//标注“我是spring boot application ”，是个三合一注解，包含声明配置类，自动配置和扫描组件
public class DemoApplication {
//项目运行开始时先来这里，进行main方法
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }
//如果代码运行成功，会在控制台显示tomcat服务器已经启动在8080端口，demoapplication在xx秒内开始运行
}
