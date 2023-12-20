package com.site.part2.lesson20_12;

import java.io.Serial;

public class RobotConnectionException extends Exception {

    @Serial
    private static final long serialVersionUID = 3471249330425485531L;

    public RobotConnectionException(String message) {
        super(message);
    }
}
