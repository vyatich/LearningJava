package com.site.part2.lesson20_12;

import java.util.Random;

public class RobotConnection implements AutoCloseable {

    private final Robot robot;

    public RobotConnection(Robot robot) {
        this.robot = robot;
    }

    public void move(int destinationX, int destinationY) throws RobotConnectionException {
        getConnect();

        robot.move();
        //todo описать логику движения
    }

    private void getConnect() throws RobotConnectionException {
        Random random = new Random();
        int randomInt = random.nextInt(0, 9);
        if (randomInt % 2 == 1) {
            throw new RobotConnectionException(String.format("Connection refused for robot %s because random is %s", robot, randomInt));
        }
    }

    @Override
    public void close() {
        System.out.println("Connection is closed");
    }
}
