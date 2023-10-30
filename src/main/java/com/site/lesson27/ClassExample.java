package com.site.lesson27;

public class ClassExample {

    public static void main(String[] args) {
        User newUser = new User("30");
        System.out.println(newUser.getName());

        //System.out.println(Math.max(1, 9));

        Integer age = 30;
        fillFields(newUser, age);

        System.out.println(age);
        System.out.println(newUser.getName());
    }

    public static void fillFields(User user, Integer age) {
        age = age + 50;
        user.setName("NONAME");
    }
}
