package com.site.part2.lesson20_12;

public enum Direction {

    LEFT("влево"),
    RIGHT("вправо"),
    FORWARD("вперед"),
    BACK("назад");

    private final String description;

    Direction(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
