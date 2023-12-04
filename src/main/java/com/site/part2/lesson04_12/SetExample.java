package com.site.part2.lesson04_12;

import java.util.Set;
import java.util.TreeSet;

public class SetExample {

    public static void main(String[] args) {
        Set<String> stringSet = new TreeSet<>();
        stringSet.add("Пушкин");
        stringSet.add("Лермонтов");
        stringSet.add("Блок");
        stringSet.add("Есенин");
        stringSet.add("Блок");

        System.out.println(stringSet);

        Set<AirPlane> airPlanes = new TreeSet<>();
        airPlanes.add(new AirPlane("Boeing"));
        airPlanes.add(new AirPlane("Su"));
        airPlanes.add(new AirPlane("Boeing"));
        airPlanes.add(new AirPlane("Airbus"));

        System.out.println(airPlanes);
    }
}
