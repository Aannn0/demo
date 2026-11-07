package com.example.demo;

import lombok.Data;

@Data//自动生成get/set

//T泛型，能装不同类型
public class Result <T>{
    private Integer code;
    private String msg;
    //业务数据，查列表是list，单个是product
    private T data;

    //静态方法，统一返回格式{code，msg，data}
    public static <T> Result<T> success(T data){
        Result<T> result=new Result<>();
        result.setCode(200);
        result.setMsg("操作成功");
        result.setData(data);
        return result;//返回值给Controller
    }

}
