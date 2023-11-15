package com.site.part2.lesson224.serlialization;

import java.io.Serializable;

public class Cube implements Serializable {

    private static final long serialVersionUID = -4580003907575523882l;

    Side side;

    String color;
    String name;

    int length;
    int weight;
    int depth;

    public Cube(Side side, int length, int weight, int depth) {
        this.side = side;
        this.length = length;
        this.weight = weight;
        this.depth = depth;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Cube{");
        sb.append("length=").append(length);
        sb.append(", weight=").append(weight);
        sb.append(", depth=").append(depth);
        sb.append('}');
        return sb.toString();
    }
}
