package com.site.part2.lesson20_12;

public class Main {

    public static void main(String[] args) {
        Robot robot = new Robot(0, 0, Direction.LEFT);

        try(RobotConnection robotConnection = new RobotConnection(robot)) {
            robotConnection.move(3, 4);
        } catch (RobotConnectionException e) {
            System.out.println(e.getMessage());
        }

        System.out.println(robot.getDirection().getDescription());
        System.out.println(robot.getCoordinateX());
        System.out.println(robot.getCoordinateY());
    }
}
