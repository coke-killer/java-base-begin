package com.example.javabasebegin.annotation;
@WangKexin(name = "father",age = 50)
public class Father {
    @WangKexin(name = "xxx",age = 20)
    private String xxx;
    @WangKexin(name = "father",age = 50)
    public String getName() {
        return "test";
    }
}
