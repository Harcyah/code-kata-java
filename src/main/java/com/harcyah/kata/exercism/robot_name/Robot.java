package com.harcyah.kata.exercism.robot_name;

import java.security.SecureRandom;

public class Robot {

    private static final SecureRandom RANDOM = new SecureRandom();

    protected String name;

    public Robot() {
        reset();
    }

    public String getName() {
        return name;
    }

    public synchronized void reset() {
        StringBuilder builder = new StringBuilder();
        builder.append((char) (65 + RANDOM.nextInt(26)));
        builder.append((char) (65 + RANDOM.nextInt(26)));
        builder.append(String.format("%03d", RANDOM.nextInt(1000)));
        this.name = builder.toString();
    }

}
