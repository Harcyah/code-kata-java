package com.harcyah.kata.codingbat.recursion1.bunny_ears;

public class BunnyEars {

    public int bunnyEars(int bunnies) {
        return (bunnies == 0) ? 0 : 2 + bunnyEars(bunnies - 1);
    }

}
