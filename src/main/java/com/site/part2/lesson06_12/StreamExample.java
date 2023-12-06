package com.site.part2.lesson06_12;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample {

    public static void main(String[] args) {
        Stream<String> empty = Stream.empty();

        Stream<Integer> integerStream = Stream.of(1, null, 3, 4, 10, 5, 8, 0);
        int sum = getSum(integerStream);
        System.out.println(sum);

        List<Integer> integerList = List.of(10, 23, 22, 9);
        System.out.println(getSum(integerList.stream()));

        List<Human> humans = List.of(
                new Human("Dmitr", 25),
                new Human("Sergei", 41),
                new Human("Vika", 24)
        );

        List<String> humanBefore30Age = humans.stream()
                .filter(human -> human.getAge() < 30)
                .map(human -> human.getName())
                .collect(Collectors.toList());

        System.out.println(humanBefore30Age);
    }

    private static int getSum(Stream<Integer> integerStream) {
        return integerStream
                .filter(number -> number != null && number >= 8)
                .mapToInt(Integer::intValue)
                .sum();
    }
}
