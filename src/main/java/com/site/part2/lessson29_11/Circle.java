package com.site.part2.lessson29_11;

public class Circle implements Drawable, Moveable {

    private Integer radius;

    public Circle(Integer radius) {
        this.radius = radius;
    }

    public Integer getRadius() {
        return radius;
    }

    public void setRadius(Integer radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println(Math.PI * Math.pow(radius, 2));
    }

    @Override
    public void move() {
        System.out.println("MOVE");
    }
}
