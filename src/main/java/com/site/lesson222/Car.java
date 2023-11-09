package com.site.lesson222;

public abstract class Car {

    protected int cost;
    protected Engine engine;
    protected DayOfWeek dayOfWeek;

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public DayOfWeek getDayOfWeek() {
        return dayOfWeek;
    }

    public void setDayOfWeek(DayOfWeek dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    public void printCar() {
        System.out.println(this.getClass().getSimpleName());
    }

    public static class Engine {

        protected double power;

        public Engine(double power) {
            this.power = power;
        }

        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder("Engine{");
            sb.append("power=").append(power);
            sb.append('}');
            return sb.toString();
        }
    }
}
