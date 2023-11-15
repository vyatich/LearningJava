package com.site.part2.lesson225;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class AnnonatationReflection {

    public static void main(String[] args) {
        Class<Human> humanClass = Human.class;
        Method[] methods = humanClass.getDeclaredMethods();
        for (Method method : methods) {
            Annotation[] declaredAnnotations = method.getDeclaredAnnotations();
            for (Annotation declaredAnnotation : declaredAnnotations) {
                System.out.println(declaredAnnotation.annotationType().getSimpleName());
            }
        }
    }
}
