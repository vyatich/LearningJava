package com.site.lesson223;

public class Mammal {

    protected String description;

    protected void sayWhoIAm() {
        System.out.println(this.getClass().getSimpleName());
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
