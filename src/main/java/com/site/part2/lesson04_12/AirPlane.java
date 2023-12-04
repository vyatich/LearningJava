package com.site.part2.lesson04_12;

public class AirPlane implements Comparable<AirPlane> {

    private String name;

    public AirPlane(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(AirPlane o) {
        return this.name.compareTo(o.name);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("AirPlane{");
        sb.append("name='").append(name).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
