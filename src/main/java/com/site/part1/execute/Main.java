package com.site.part1.execute;

import com.site.part2.lesson222.Car;
import com.site.part2.lesson222.ElectricCar;
import com.site.part2.lesson222.SportCar;

public class Main {

    public static void main(String[] args) {
        Car car = new Car() {};
        record Fruit(String name) {};
        Fruit fruit = new Fruit("APPLE");

        System.out.println(car.getClass().getSimpleName());
        SportCar sportCar = new SportCar(2000000);
        ElectricCar electricCar = new ElectricCar(5000000, 10L);

        Car[] cars = {car, sportCar, electricCar};
        for (Car current : cars) {
            current.printCar();
            System.out.println(current.getEngine());
        }
    }
}
