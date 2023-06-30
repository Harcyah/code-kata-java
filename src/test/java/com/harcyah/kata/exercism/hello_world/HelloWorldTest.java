package com.harcyah.kata.exercism.hello_world;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HelloWorldTest {

    @Test
    void helloNoName() {
        assertEquals("Hello, World!", HelloWorld.hello(""));
        assertEquals("Hello, World!", HelloWorld.hello(null));
    }

    @Test
    void helloSampleName() {
        assertEquals("Hello, Alice!", HelloWorld.hello("Alice"));
    }

    @Test
    void helloAnotherSampleName() {
        assertEquals("Hello, Bob!", HelloWorld.hello("Bob"));
    }

}
