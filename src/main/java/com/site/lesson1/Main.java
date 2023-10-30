package com.site.lesson1;

public class Main {

    public static void main(String[] args) {
        Fruit apple = new Fruit();
        apple.name = "APPLE";
        Fruit mango = new Fruit();
        //mango.name = "MANGO";
        Fruit bananas = new Fruit("BANANA");

        System.out.println(bananas.name);
        System.out.println(apple.name);
        System.out.println(mango.name);
        System.out.println(Fruit.type);
    }
}
