package com.site.part2.lesson01_12;

import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Task {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int peopleCount = Integer.parseInt(scanner.nextLine());
        int currentIndex = 0;
        Human[] people = new Human[peopleCount];
        while (peopleCount > 0) {
            String current = scanner.nextLine();
            String[] peopleInfo = current.split(",");
            String name = peopleInfo[0];
            Integer age = Integer.valueOf(peopleInfo[1]);
            people[currentIndex] = new Human(name, age);
            peopleCount--;
            currentIndex++;
        }
        String format = scanner.nextLine();

        Predicate<Integer> checkCondition = age -> age > 20;
        Consumer<Human> printer = human -> System.out.printf(format + "\n", human.getName(), human.getAge());
        printFilteredStudent(people, checkCondition, printer);
    }

    private static void printFilteredStudent(Human[] people, Predicate<Integer> checkCondition, Consumer<Human> printer) {
        for (Human person : people) {
            if (checkCondition.test(person.getAge())) {
                printer.accept(person);
            }
        }
    }

    static class Human {
        private final String name;
        private final Integer age;

        public Human(String name, Integer age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public Integer getAge() {
            return age;
        }

        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder("Human{");
            sb.append("name='").append(name).append('\'');
            sb.append(", age=").append(age);
            sb.append('}');
            return sb.toString();
        }
    }
}
