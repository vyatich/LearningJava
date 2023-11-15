package com.site.part2.lesson225;

public class Human extends Mammal implements Animal {

    private Integer age;

    public Human() {
    }

    public Human(Integer age) {
        this.age = age;
    }

    @Override
    @Example
    void live() {

    }

    @Override
    @Example
    public String toString() {
        final StringBuilder sb = new StringBuilder("Human{");
        sb.append("age=").append(age);
        sb.append('}');
        return sb.toString();
    }
}
