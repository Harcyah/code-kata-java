package com.harcyah.kata.exercism.twelve_days;

import lombok.experimental.UtilityClass;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

@UtilityClass
public class TwelveDays {

    public static String verse(int number) {
        StringBuilder lyrics = new StringBuilder("On the " + getOrdinal(number) + " day of Christmas my true love gave to me, ");

        for (int i = number; i > 1; i--) {
            lyrics.append(getGift(i));
            lyrics.append(", ");
        }

        if (number > 1) {
            lyrics.append("and ");
        }

        lyrics.append(getGift(1));
        lyrics.append("\n");

        return lyrics.toString();
    }

    public static String verses(int from, int to) {
        return IntStream
            .range(from, to + 1)
            .mapToObj(TwelveDays::verse)
            .collect(Collectors.joining("\n"));
    }

    public static String sing() {
        return verses(1, 12);
    }

    private static String getGift(int number) {
        return switch (number) {
            case 1 -> "a Partridge in a Pear Tree.";
            case 2 -> "two Turtle Doves";
            case 3 -> "three French Hens";
            case 4 -> "four Calling Birds";
            case 5 -> "five Gold Rings";
            case 6 -> "six Geese-a-Laying";
            case 7 -> "seven Swans-a-Swimming";
            case 8 -> "eight Maids-a-Milking";
            case 9 -> "nine Ladies Dancing";
            case 10 -> "ten Lords-a-Leaping";
            case 11 -> "eleven Pipers Piping";
            case 12 -> "twelve Drummers Drumming";
            default -> "";
        };
    }

    private static String getOrdinal(int number) {
        return switch (number) {
            case 1 -> "first";
            case 2 -> "second";
            case 3 -> "third";
            case 4 -> "fourth";
            case 5 -> "fifth";
            case 6 -> "sixth";
            case 7 -> "seventh";
            case 8 -> "eighth";
            case 9 -> "ninth";
            case 10 -> "tenth";
            case 11 -> "eleventh";
            case 12 -> "twelfth";
            default -> "";
        };
    }

}
