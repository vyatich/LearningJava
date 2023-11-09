package com.site.lesson223.abstratc_example;

public abstract class Shape {

    protected final String name;

    abstract double getArea();

    public Shape(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
