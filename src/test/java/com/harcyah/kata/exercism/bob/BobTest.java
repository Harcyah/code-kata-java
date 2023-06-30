package com.harcyah.kata.exercism.bob;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BobTest {

    private final Bob bob = new Bob();

    @Test
    void saySomething() {
        assertEquals("Whatever.", bob.hey("Tom-ay-to, tom-aaaah-to."));
    }

    @Test
    void shouting() {
        assertEquals("Whoa, chill out!", bob.hey("WATCH OUT!"));
    }

    @Test
    void askingAQuestion() {
        assertEquals("Sure.", bob.hey("Does this cryogenic chamber make me look fat?"));
    }

    @Test
    void askingANumericQuestion() {
        assertEquals("Sure.", bob.hey("You are, what, like 15?"));
    }

    @Test
    void talkingForcefully() {
        assertEquals("Whatever.", bob.hey("Let's go make out behind the gym!"));
    }

    @Test
    void usingAcronymsInRegularSpeech() {
        assertEquals("Whatever.", bob.hey("It's OK if you don't want to go to the DMV."));
    }

    @Test
    void forcefulQuestions() {
        assertEquals("Whoa, chill out!", bob.hey("WHAT THE HELL WERE YOU THINKING?"));
    }

    @Test
    void shoutingNumbers() {
        assertEquals("Whoa, chill out!", bob.hey("1, 2, 3 GO!"));
    }

    @Test
    void onlyNumbers() {
        assertEquals("Whatever.", bob.hey("1, 2, 3"));
    }

    @Test
    void questionWithOnlyNumbers() {
        assertEquals("Sure.", bob.hey("4?"));
    }

    @Test
    void shoutingWithSpecialCharacters() {
        assertEquals("Whoa, chill out!", bob.hey("ZOMG THE %^*@#$(*^ ZOMBIES ARE COMING!!11!!1!"));
    }

    @Test
    void shoutingWithUmlauts() {
        assertEquals("Whoa, chill out!", bob.hey("\u00dcML\u00c4\u00dcTS!"));
    }

    @Test
    void calmlySpeakingWithUmlauts() {
        assertEquals("Whatever.", bob.hey("\u00dcML\u00e4\u00dcTS!"));
    }

    @Test
    void shoutingWithNoExclamationMark() {
        assertEquals("Whoa, chill out!", bob.hey("I HATE YOU"));
    }

    @Test
    void statementContainingQuestionMark() {
        assertEquals("Whatever.", bob.hey("Ending with ? means a question."));
    }

    @Test
    void prattlingOn() {
        assertEquals("Sure.", bob.hey("Wait! Hang on. Are you going to be OK?"));
    }

    @Test
    void silence() {
        assertEquals("Fine. Be that way!", bob.hey(""));
    }

    @Test
    void prolongedSilence() {
        assertEquals("Fine. Be that way!", bob.hey("    "));
    }

}
