package com.example.javabasebegin.annotation;

import java.lang.annotation.*;


@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD,ElementType.TYPE,ElementType.FIELD})
@Documented
@Inherited
public @interface WangKexin {
    String name() default "mao";

    int age() default 18;
}

