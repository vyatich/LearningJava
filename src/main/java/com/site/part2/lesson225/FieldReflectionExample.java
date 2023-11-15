package com.site.part2.lesson225;

import com.site.part2.lesson225.Human;

import java.lang.reflect.Field;

public class FieldReflectionExample {

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Class<Human> humanClass = Human.class;
        Field[] fields = humanClass.getDeclaredFields();
        for (Field field : fields) {
            System.out.println(field.getName() + " " + field.getType());
        }

        Human human = new Human();

        System.out.println(human);

        Field ageField = humanClass.getDeclaredField("age");
        ageField.setAccessible(true);
        System.out.println(ageField.get(human));
        ageField.set(human, 200);

        System.out.println(human);
    }
}
