package com.example.javabasebegin.annotation;

public class Son extends Father {
    public static void main(String[] args) {
        Class<Son> sonClass = Son.class;
        //@Inherited注解了的注解修饰了一个父类，如果他的子类没有被其他注解修饰，则它的子类也继承了父类的注解。
        System.out.println(sonClass.getAnnotation(WangKexin.class));
    }
}
