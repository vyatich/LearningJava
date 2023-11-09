package com.site.lesson223;

public class Main {

    public static void main(String[] args) {
        Animal animal = new Human();
        animal.live();

        Mammal mammal = new Human();
        Cow cow = new Cow();
        Human human = new Human();

        sayWhoIAm(mammal);
        sayWhoIAm(cow);

        System.out.println(animal instanceof Human);
        System.out.println(animal instanceof Mammal);
        System.out.println(animal instanceof Animal);

        System.out.println(animal instanceof Object);

        if (animal instanceof Human) {
            Human currentHuman = (Human) animal;
            currentHuman.sayWhoIAm();
        }
    }

    public static void sayWhoIAm(Mammal mammal) {
        mammal.sayWhoIAm();
    }
}
