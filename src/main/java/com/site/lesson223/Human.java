package com.site.lesson223;

public class Human extends Mammal implements Animal {

    private String name;

    @Override
    protected void sayWhoIAm() {
        super.sayWhoIAm();
        System.out.println("From Human");
    }

    @Override
    public void live() {
        System.out.println("I'm living");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
