package com.harcyah.kata.exercism.hello_world;

import lombok.experimental.UtilityClass;

@UtilityClass
public class HelloWorld {

    public static String hello(String name) {
        return "Hello, " + ((name == null || name.trim().isEmpty()) ? "World" : name) + "!";
    }

}
