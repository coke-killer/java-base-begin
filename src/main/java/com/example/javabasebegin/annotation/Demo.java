package com.example.javabasebegin.annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

@WangKexin
public class Demo {
    @WangKexin
    public void test() {

    }

    public static void main(String[] args) {
        //获取类注解属性
        Class<Father> fatherClass = Father.class;
        boolean annotationPresent = fatherClass.isAnnotationPresent(WangKexin.class);
        if (annotationPresent) {
            WangKexin annotation = fatherClass.getAnnotation(WangKexin.class);
            System.out.println(annotation.name());
            System.out.println(annotation.age());
        }
        try {
            Field xxx = Father.class.getDeclaredField("xxx");
            xxx.setAccessible(true);
                //获取一个成员变量上的注解
            WangKexin annotation = xxx.getAnnotation(WangKexin.class);
            Method getName = Father.class.getDeclaredMethod("getName");
            if (getName!=null){
                Annotation[] annotation2 = getName.getAnnotations();
                for (int i = 0; i < annotation2.length; i++) {
                    System.out.println(annotation2[i].toString());
                }
            }

            if (annotation != null) {
                System.out.println("WangKexin age:" + annotation.age());
                System.out.println("WangKexin name:" + annotation.name());
            }
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
}