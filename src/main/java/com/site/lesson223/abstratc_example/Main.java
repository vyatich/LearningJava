package com.site.lesson223.abstratc_example;

public class Main {

    public static void main(String[] args) {
        Circle circle = new Circle("Круг");
        Square square = new Square("Квадрат", 4);

        Shape[] shapes = {circle, square};

        for (Shape shape : shapes) {
            System.out.println(shape.getArea());
        }
    }
}
