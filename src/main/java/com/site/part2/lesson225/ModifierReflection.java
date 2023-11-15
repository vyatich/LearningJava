package com.site.part2.lesson225;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class ModifierReflection {

    public static void main(String[] args) {
        Class<Human> humanClass = Human.class;
        int modifiers = humanClass.getModifiers();
        System.out.println(Modifier.isAbstract(modifiers));

        Method[] methods = humanClass.getMethods();
        for (Method method : methods) {
            System.out.println(Modifier.isPublic(method.getModifiers()));
        }
    }
}
