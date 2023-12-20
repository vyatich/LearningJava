package com.site.part2.lesson20_12;

import java.util.Objects;

public class Robot {

    private int coordinateX;
    private int coordinateY;
    private Direction direction;

    public Robot(int coordinateX, int coordinateY, Direction direction) {
        this.coordinateX = coordinateX;
        this.coordinateY = coordinateY;
        this.direction = direction;
    }

    public void turnLeft() {
        this.direction = switch (this.direction) {
            case BACK -> Direction.RIGHT;
            case LEFT -> Direction.BACK;
            case RIGHT -> Direction.FORWARD;
            case FORWARD -> Direction.LEFT;
        };
    }

    public void turnRight() {
        this.direction = switch (this.direction) {
            case BACK -> Direction.LEFT;
            case LEFT -> Direction.FORWARD;
            case RIGHT -> Direction.BACK;
            case FORWARD -> Direction.RIGHT;
        };
    }

    public void move() {
        switch (this.direction) {
            case BACK -> this.coordinateY--;
            case LEFT -> this.coordinateX--;
            case RIGHT -> this.coordinateX++;
            case FORWARD -> this.coordinateY++;
        };
    }

    public int getCoordinateX() {
        return coordinateX;
    }

    public void setCoordinateX(int coordinateX) {
        this.coordinateX = coordinateX;
    }

    public int getCoordinateY() {
        return coordinateY;
    }

    public void setCoordinateY(int coordinateY) {
        this.coordinateY = coordinateY;
    }

    public Direction getDirection() {
        return direction;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Robot robot = (Robot) o;
        return coordinateX == robot.coordinateX && coordinateY == robot.coordinateY && direction == robot.direction;
    }

    @Override
    public int hashCode() {
        return Objects.hash(coordinateX, coordinateY, direction);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Robot{");
        sb.append("coordinateX=").append(coordinateX);
        sb.append(", coordinateY=").append(coordinateY);
        sb.append(", direction=").append(direction);
        sb.append('}');
        return sb.toString();
    }
}
