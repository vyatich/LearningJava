package com.site.part2.lesson225;

public class ReflectionExample {

    public static void main(String[] args) throws Exception {
        Class clazz = Human.class;
        System.out.println(clazz.getSimpleName());
        System.out.println(clazz.getSuperclass());
        Class[] interfaces = clazz.getInterfaces();
        for (Class current : interfaces) {
            System.out.println(current.getSimpleName());
        }

        Human newHuman = (Human) clazz.getDeclaredConstructor(Integer.class).newInstance(12);
        System.out.println(newHuman);

        Human emptyHuman = (Human) clazz.getDeclaredConstructor().newInstance();
        System.out.println(emptyHuman);
    }
}
