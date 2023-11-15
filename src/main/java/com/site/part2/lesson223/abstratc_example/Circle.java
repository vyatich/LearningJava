package com.site.part2.lesson223.abstratc_example;

public class Circle extends Shape {

    private Integer radius;

    public Circle(String name) {
        super(name);
    }

    @Override
    double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }
}
