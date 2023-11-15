package com.site.part2.lesson225;

import java.lang.reflect.Method;

public class MethodReflectionExample {

    public static void main(String[] args) throws Exception {
        Class<Human> humanClass = Human.class;
        Method[] methods = humanClass.getMethods();
        for (Method method : methods) {
            System.out.println(method.getName());
        }

        Human human = humanClass.getDeclaredConstructor().newInstance();

        Method toString = humanClass.getMethod("toString");
        System.out.println(toString.invoke(human));
    }
}
