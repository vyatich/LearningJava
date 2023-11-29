package com.site.part2.lessson29_11;

import org.w3c.dom.css.Rect;

public class Main {

    public static void main(String[] args) {
        Circle circle = new Circle(5);
        move(circle);
        draw(circle);

        //SOLID
        Moveable moveable = new Circle(7);
        move(moveable);

        Rectangle rectangle = new Rectangle(10, 20);
        draw(rectangle);

        Object[] array = new Object[10];
        array[0] = circle;
        array[1] = rectangle;
    }

    private static void draw(Circle circle) {
        circle.draw();
    }

    private static void move(Moveable moveable) {
        moveable.move();
    }

    private static void draw(Rectangle drawable) {
        drawable.draw();
    }
}
