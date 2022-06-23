package com.harcyah.kata.codingbat.logic1.squirrel_play;

public class SquirrelPlay {

    public boolean squirrelPlay(int temp, boolean isSummer) {
        int upperLimit = isSummer ? 100 : 90;
        return temp >= 60 && temp <= upperLimit;
    }

}
