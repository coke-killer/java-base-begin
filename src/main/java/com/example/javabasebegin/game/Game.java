package com.example.javabasebegin.game;

import java.lang.annotation.*;

/**游戏注解*/
@Repeatable(Person.class)
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface Game {
    String value() default "";
}

