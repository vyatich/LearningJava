package com.site.part2.lesson222;

public class ElectricCar extends Car {

    private Long cost;

    public ElectricCar(int cost, Long electricCost) {
        super.cost = cost;
        this.cost = electricCost;
    }

    @Override
    public void printCar() {
        super.printCar();
        System.out.printf("It's my electric with cost %s", super.cost);
    }

    public Long getElectricCost() {
        return cost;
    }

    public void setElectricCost(Long cost) {
        this.cost = cost;
    }
}
