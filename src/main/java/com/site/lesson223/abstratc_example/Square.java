package com.site.lesson223.abstratc_example;

public class Square extends Shape {

    private Integer side;

    public Square(String name, Integer side) {
        super(name);
        this.side = side;
    }

    @Override
    double getArea() {
        return side * side;
    }
}
