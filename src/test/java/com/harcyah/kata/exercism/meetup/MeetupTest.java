package com.harcyah.kata.exercism.meetup;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static java.time.DayOfWeek.FRIDAY;
import static java.time.DayOfWeek.MONDAY;
import static java.time.DayOfWeek.SATURDAY;
import static java.time.DayOfWeek.SUNDAY;
import static java.time.DayOfWeek.THURSDAY;
import static java.time.DayOfWeek.TUESDAY;
import static java.time.DayOfWeek.WEDNESDAY;
import static org.assertj.core.api.Assertions.assertThat;

class MeetupTest {

    @Test
    void testMondayTeenthOfMay2013() {
        LocalDateTime expected = LocalDateTime.of(2013, 5, 13, 0, 0);
        Meetup meetup = new Meetup(5, 2013);
        assertThat(meetup.day(MONDAY, MeetupSchedule.TEENTH)).isEqualTo(expected);
    }

    @Test
    void testMondayTeenthOfAugust2013() {
        LocalDateTime expected = LocalDateTime.of(2013, 8, 19, 0, 0);
        Meetup meetup = new Meetup(8, 2013);
        assertThat(meetup.day(MONDAY, MeetupSchedule.TEENTH)).isEqualTo(expected);
    }

    @Test
    void testMondayTeenthOfSeptember2013() {
        LocalDateTime expected = LocalDateTime.of(2013, 9, 16, 0, 0);
        Meetup meetup = new Meetup(9, 2013);
        assertThat(meetup.day(MONDAY, MeetupSchedule.TEENTH)).isEqualTo(expected);
    }

    @Test
    void testTuesdayTeenthOfMarch2013() {
        LocalDateTime expected = LocalDateTime.of(2013, 3, 19, 0, 0);
        Meetup meetup = new Meetup(3, 2013);
        assertThat(meetup.day(TUESDAY, MeetupSchedule.TEENTH)).isEqualTo(expected);
    }

    @Test
    void testTuesdayTeenthOfApril2013() {
        LocalDateTime expected = LocalDateTime.of(2013, 4, 16, 0, 0);
        Meetup meetup = new Meetup(4, 2013);
        assertThat(meetup.day(TUESDAY, MeetupSchedule.TEENTH)).isEqualTo(expected);
    }

    @Test
    void testTuesdayTeenthOfAugust2013() {
        LocalDateTime expected = LocalDateTime.of(2013, 8, 13, 0, 0);
        Meetup meetup = new Meetup(8, 2013);
        assertThat(meetup.day(TUESDAY, MeetupSchedule.TEENTH)).isEqualTo(expected);
    }

    @Test
    void testWednesdayTeenthOfJanuary2013() {
        LocalDateTime expected = LocalDateTime.of(2013, 1, 16, 0, 0);
        Meetup meetup = new Meetup(1, 2013);
        assertThat(meetup.day(WEDNESDAY, MeetupSchedule.TEENTH)).isEqualTo(expected);
    }

    @Test
    void testWednesdayTeenthOfFebruary2013() {
        LocalDateTime expected = LocalDateTime.of(2013, 2, 13, 0, 0);
        Meetup meetup = new Meetup(2, 2013);
        assertThat(meetup.day(WEDNESDAY, MeetupSchedule.TEENTH)).isEqualTo(expected);
    }

    @Test
    void testWednesdayTeenthOfJune2013() {
        LocalDateTime expected = LocalDateTime.of(2013, 6, 19, 0, 0);
        Meetup meetup = new Meetup(6, 2013);
        assertThat(meetup.day(WEDNESDAY, MeetupSchedule.TEENTH)).isEqualTo(expected);
    }

    @Test
    void testThursdayTeenthOfMay2013() {
        LocalDateTime expected = LocalDateTime.of(2013, 5, 16, 0, 0);
        Meetup meetup = new Meetup(5, 2013);
        assertThat(meetup.day(THURSDAY, MeetupSchedule.TEENTH)).isEqualTo(expected);
    }

    @Test
    void testThursdayTeenthOfJune2013() {
        LocalDateTime expected = LocalDateTime.of(2013, 6, 13, 0, 0);
        Meetup meetup = new Meetup(6, 2013);
        assertThat(meetup.day(THURSDAY, MeetupSchedule.TEENTH)).isEqualTo(expected);
    }

    @Test
    void testThursdayTeenthOfSeptember2013() {
        LocalDateTime expected = LocalDateTime.of(2013, 9, 19, 0, 0);
        Meetup meetup = new Meetup(9, 2013);
        assertThat(meetup.day(THURSDAY, MeetupSchedule.TEENTH)).isEqualTo(expected);
    }

    @Test
    void testFridayTeenthOfApril2013() {
        LocalDateTime expected = LocalDateTime.of(2013, 4, 19, 0, 0);
        Meetup meetup = new Meetup(4, 2013);
        assertThat(meetup.day(FRIDAY, MeetupSchedule.TEENTH)).isEqualTo(expected);
    }

    @Test
    void testFridayTeenthOfAugust2013() {
        LocalDateTime expected = LocalDateTime.of(2013, 8, 16, 0, 0);
        Meetup meetup = new Meetup(8, 2013);
        assertThat(meetup.day(FRIDAY, MeetupSchedule.TEENTH)).isEqualTo(expected);
    }

    @Test
    void testFridayTeenthOfSeptember2013() {
        LocalDateTime expected = LocalDateTime.of(2013, 9, 13, 0, 0);
        Meetup meetup = new Meetup(9, 2013);
        assertThat(meetup.day(FRIDAY, MeetupSchedule.TEENTH)).isEqualTo(expected);
    }

    @Test
    void testSaturdayTeenthOfFebruary2013() {
        LocalDateTime expected = LocalDateTime.of(2013, 2, 16, 0, 0);
        Meetup meetup = new Meetup(2, 2013);
        assertThat(meetup.day(SATURDAY, MeetupSchedule.TEENTH)).isEqualTo(expected);
    }

    @Test
    void testSaturdayTeenthOfApril2013() {
        LocalDateTime expected = LocalDateTime.of(2013, 4, 13, 0, 0);
        Meetup meetup = new Meetup(4, 2013);
        assertThat(meetup.day(SATURDAY, MeetupSchedule.TEENTH)).isEqualTo(expected);
    }

    @Test
    void testSaturdayTeenthOfOctober2013() {
        LocalDateTime expected = LocalDateTime.of(2013, 10, 19, 0, 0);
        Meetup meetup = new Meetup(10, 2013);
        assertThat(meetup.day(SATURDAY, MeetupSchedule.TEENTH)).isEqualTo(expected);
    }

    @Test
    void testSundayTeenthOfMay2013() {
        LocalDateTime expected = LocalDateTime.of(2013, 5, 19, 0, 0);
        Meetup meetup = new Meetup(5, 2013);
        assertThat(meetup.day(SUNDAY, MeetupSchedule.TEENTH)).isEqualTo(expected);
    }

    @Test
    void testSundayTeenthOfJune2013() {
        LocalDateTime expected = LocalDateTime.of(2013, 6, 16, 0, 0);
        Meetup meetup = new Meetup(6, 2013);
        assertThat(meetup.day(SUNDAY, MeetupSchedule.TEENTH)).isEqualTo(expected);
    }

    @Test
    void testSundayTeenthOfOctober2013() {
        LocalDateTime expected = LocalDateTime.of(2013, 10, 13, 0, 0);
        Meetup meetup = new Meetup(10, 2013);
        assertThat(meetup.day(SUNDAY, MeetupSchedule.TEENTH)).isEqualTo(expected);
    }

    @Test
    void testFirstMondayOfMarch2013() {
        LocalDateTime expected = LocalDateTime.of(2013, 3, 4, 0, 0);
        Meetup meetup = new Meetup(3, 2013);
        assertThat(meetup.day(MONDAY, MeetupSchedule.FIRST)).isEqualTo(expected);
    }

    @Test
    void testFirstMondayOfApril2013() {
        LocalDateTime expected = LocalDateTime.of(2013, 4, 1, 0, 0);
        Meetup meetup = new Meetup(4, 2013);
        assertThat(meetup.day(MONDAY, MeetupSchedule.FIRST)).isEqualTo(expected);
    }

    @Test
    void testFirstTuesdayOfMay2013() {
        LocalDateTime expected = LocalDateTime.of(2013, 5, 7, 0, 0);
        Meetup meetup = new Meetup(5, 2013);
        assertThat(meetup.day(TUESDAY, MeetupSchedule.FIRST)).isEqualTo(expected);
    }

    @Test
    void testFirstTuesdayOfJune2013() {
        LocalDateTime expected = LocalDateTime.of(2013, 6, 4, 0, 0);
        Meetup meetup = new Meetup(6, 2013);
        assertThat(meetup.day(TUESDAY, MeetupSchedule.FIRST)).isEqualTo(expected);
    }

    @Test
    void testFirstWednesdayOfJuly2013() {
        LocalDateTime expected = LocalDateTime.of(2013, 7, 3, 0, 0);
        Meetup meetup = new Meetup(7, 2013);
        assertThat(meetup.day(WEDNESDAY, MeetupSchedule.FIRST)).isEqualTo(expected);
    }

    @Test
    void testFirstWednesdayOfAugust2013() {
        LocalDateTime expected = LocalDateTime.of(2013, 8, 7, 0, 0);
        Meetup meetup = new Meetup(8, 2013);
        assertThat(meetup.day(WEDNESDAY, MeetupSchedule.FIRST)).isEqualTo(expected);
    }

    @Test
    void testFirstThursdayOfSeptember2013() {
        LocalDateTime expected = LocalDateTime.of(2013, 9, 5, 0, 0);
        Meetup meetup = new Meetup(9, 2013);
        assertThat(meetup.day(THURSDAY, MeetupSchedule.FIRST)).isEqualTo(expected);
    }

    @Test
    void testFirstThursdayOfOctober2013() {
        LocalDateTime expected = LocalDateTime.of(2013, 10, 3, 0, 0);
        Meetup meetup = new Meetup(10, 2013);
        assertThat(meetup.day(THURSDAY, MeetupSchedule.FIRST)).isEqualTo(expected);
    }

    @Test
    void testFirstFridayOfNovember2013() {
        LocalDateTime expected = LocalDateTime.of(2013, 11, 1, 0, 0);
        Meetup meetup = new Meetup(11, 2013);
        assertThat(meetup.day(FRIDAY, MeetupSchedule.FIRST)).isEqualTo(expected);
    }

    @Test
    void testFirstFridayOfDecember2013() {
        LocalDateTime expected = LocalDateTime.of(2013, 12, 6, 0, 0);
        Meetup meetup = new Meetup(12, 2013);
        assertThat(meetup.day(FRIDAY, MeetupSchedule.FIRST)).isEqualTo(expected);
    }

    @Test
    void testFirstSaturdayOfJanuary2013() {
        LocalDateTime expected = LocalDateTime.of(2013, 1, 5, 0, 0);
        Meetup meetup = new Meetup(1, 2013);
        assertThat(meetup.day(SATURDAY, MeetupSchedule.FIRST)).isEqualTo(expected);
    }

    @Test
    void testFirstSaturdayOfFebruary2013() {
        LocalDateTime expected = LocalDateTime.of(2013, 2, 2, 0, 0);
        Meetup meetup = new Meetup(2, 2013);
        assertThat(meetup.day(SATURDAY, MeetupSchedule.FIRST)).isEqualTo(expected);
    }

    @Test
    void testFirstSundayOfMarch2013() {
        LocalDateTime expected = LocalDateTime.of(2013, 3, 3, 0, 0);
        Meetup meetup = new Meetup(3, 2013);
        assertThat(meetup.day(SUNDAY, MeetupSchedule.FIRST)).isEqualTo(expected);
    }

    @Test
    void testFirstSundayOfApril2013() {
        LocalDateTime expected = LocalDateTime.of(2013, 4, 7, 0, 0);
        Meetup meetup = new Meetup(4, 2013);
        assertThat(meetup.day(SUNDAY, MeetupSchedule.FIRST)).isEqualTo(expected);
    }

    @Test
    void testSecondMondayOfMarch2013() {
        LocalDateTime expected = LocalDateTime.of(2013, 3, 11, 0, 0);
        Meetup meetup = new Meetup(3, 2013);
        assertThat(meetup.day(MONDAY, MeetupSchedule.SECOND)).isEqualTo(expected);
    }

    @Test
    void testSecondMondayOfApril2013() {
        LocalDateTime expected = LocalDateTime.of(2013, 4, 8, 0, 0);
        Meetup meetup = new Meetup(4, 2013);
        assertThat(meetup.day(MONDAY, MeetupSchedule.SECOND)).isEqualTo(expected);
    }

    @Test
    void testSecondTuesdayOfMay2013() {
        LocalDateTime expected = LocalDateTime.of(2013, 5, 14, 0, 0);
        Meetup meetup = new Meetup(5, 2013);
        assertThat(meetup.day(TUESDAY, MeetupSchedule.SECOND)).isEqualTo(expected);
    }

    @Test
    void testSecondTuesdayOfJune2013() {
        LocalDateTime expected = LocalDateTime.of(2013, 6, 11, 0, 0);
        Meetup meetup = new Meetup(6, 2013);
        assertThat(meetup.day(TUESDAY, MeetupSchedule.SECOND)).isEqualTo(expected);
    }

    @Test
    void testSecondWednesdayOfJuly2013() {
        LocalDateTime expected = LocalDateTime.of(2013, 7, 10, 0, 0);
        Meetup meetup = new Meetup(7, 2013);
        assertThat(meetup.day(WEDNESDAY, MeetupSchedule.SECOND)).isEqualTo(expected);
    }

    @Test
    void testSecondWednesdayOfAugust2013() {
        LocalDateTime expected = LocalDateTime.of(2013, 8, 14, 0, 0);
        Meetup meetup = new Meetup(8, 2013);
        assertThat(meetup.day(WEDNESDAY, MeetupSchedule.SECOND)).isEqualTo(expected);
    }

    @Test
    void testSecondThursdayOfSeptember2013() {
        LocalDateTime expected = LocalDateTime.of(2013, 9, 12, 0, 0);
        Meetup meetup = new Meetup(9, 2013);
        assertThat(meetup.day(THURSDAY, MeetupSchedule.SECOND)).isEqualTo(expected);
    }

    @Test
    void testSecondThursdayOfOctober2013() {
        LocalDateTime expected = LocalDateTime.of(2013, 10, 10, 0, 0);
        Meetup meetup = new Meetup(10, 2013);
        assertThat(meetup.day(THURSDAY, MeetupSchedule.SECOND)).isEqualTo(expected);
    }

    @Test
    void testSecondFridayOfNovember2013() {
        LocalDateTime expected = LocalDateTime.of(2013, 11, 8, 0, 0);
        Meetup meetup = new Meetup(11, 2013);
        assertThat(meetup.day(FRIDAY, MeetupSchedule.SECOND)).isEqualTo(expected);
    }

    @Test
    void testSecondFridayOfDecember2013() {
        LocalDateTime expected = LocalDateTime.of(2013, 12, 13, 0, 0);
        Meetup meetup = new Meetup(12, 2013);
        assertThat(meetup.day(FRIDAY, MeetupSchedule.SECOND)).isEqualTo(expected);
    }

    @Test
    void testSecondSaturdayOfJanuary2013() {
        LocalDateTime expected = LocalDateTime.of(2013, 1, 12, 0, 0);
        Meetup meetup = new Meetup(1, 2013);
        assertThat(meetup.day(SATURDAY, MeetupSchedule.SECOND)).isEqualTo(expected);
    }

    @Test
    void testSecondSaturdayOfFebruary2013() {
        LocalDateTime expected = LocalDateTime.of(2013, 2, 9, 0, 0);
        Meetup meetup = new Meetup(2, 2013);
        assertThat(meetup.day(SATURDAY, MeetupSchedule.SECOND)).isEqualTo(expected);
    }

    @Test
    void testSecondSundayOfMarch2013() {
        LocalDateTime expected = LocalDateTime.of(2013, 3, 10, 0, 0);
        Meetup meetup = new Meetup(3, 2013);
        assertThat(meetup.day(SUNDAY, MeetupSchedule.SECOND)).isEqualTo(expected);
    }

    @Test
    void testSecondSundayOfApril2013() {
        LocalDateTime expected = LocalDateTime.of(2013, 4, 14, 0, 0);
        Meetup meetup = new Meetup(4, 2013);
        assertThat(meetup.day(SUNDAY, MeetupSchedule.SECOND)).isEqualTo(expected);
    }

    @Test
    void testThirdMondayOfMarch2013() {
        LocalDateTime expected = LocalDateTime.of(2013, 3, 18, 0, 0);
        Meetup meetup = new Meetup(3, 2013);
        assertThat(meetup.day(MONDAY, MeetupSchedule.THIRD)).isEqualTo(expected);
    }

    @Test
    void testThirdMondayOfApril2013() {
        LocalDateTime expected = LocalDateTime.of(2013, 4, 15, 0, 0);
        Meetup meetup = new Meetup(4, 2013);
        assertThat(meetup.day(MONDAY, MeetupSchedule.THIRD)).isEqualTo(expected);
    }

    @Test
    void testThirdTuesdayOfMay2013() {
        LocalDateTime expected = LocalDateTime.of(2013, 5, 21, 0, 0);
        Meetup meetup = new Meetup(5, 2013);
        assertThat(meetup.day(TUESDAY, MeetupSchedule.THIRD)).isEqualTo(expected);
    }

    @Test
    void testThirdTuesdayOfJune2013() {
        LocalDateTime expected = LocalDateTime.of(2013, 6, 18, 0, 0);
        Meetup meetup = new Meetup(6, 2013);
        assertThat(meetup.day(TUESDAY, MeetupSchedule.THIRD)).isEqualTo(expected);
    }

    @Test
    void testThirdWednesdayOfJuly2013() {
        LocalDateTime expected = LocalDateTime.of(2013, 7, 17, 0, 0);
        Meetup meetup = new Meetup(7, 2013);
        assertThat(meetup.day(WEDNESDAY, MeetupSchedule.THIRD)).isEqualTo(expected);
    }

    @Test
    void testThirdWednesdayOfAugust2013() {
        LocalDateTime expected = LocalDateTime.of(2013, 8, 21, 0, 0);
        Meetup meetup = new Meetup(8, 2013);
        assertThat(meetup.day(WEDNESDAY, MeetupSchedule.THIRD)).isEqualTo(expected);
    }

    @Test
    void testThirdThursdayOfSeptember2013() {
        LocalDateTime expected = LocalDateTime.of(2013, 9, 19, 0, 0);
        Meetup meetup = new Meetup(9, 2013);
        assertThat(meetup.day(THURSDAY, MeetupSchedule.THIRD)).isEqualTo(expected);
    }

    @Test
    void testThirdThursdayOfOctober2013() {
        LocalDateTime expected = LocalDateTime.of(2013, 10, 17, 0, 0);
        Meetup meetup = new Meetup(10, 2013);
        assertThat(meetup.day(THURSDAY, MeetupSchedule.THIRD)).isEqualTo(expected);
    }

    @Test
    void testThirdFridayOfNovember2013() {
        LocalDateTime expected = LocalDateTime.of(2013, 11, 15, 0, 0);
        Meetup meetup = new Meetup(11, 2013);
        assertThat(meetup.day(FRIDAY, MeetupSchedule.THIRD)).isEqualTo(expected);
    }

    @Test
    void testThirdFridayOfDecember2013() {
        LocalDateTime expected = LocalDateTime.of(2013, 12, 20, 0, 0);
        Meetup meetup = new Meetup(12, 2013);
        assertThat(meetup.day(FRIDAY, MeetupSchedule.THIRD)).isEqualTo(expected);
    }

    @Test
    void testThirdSaturdayOfJanuary2013() {
        LocalDateTime expected = LocalDateTime.of(2013, 1, 19, 0, 0);
        Meetup meetup = new Meetup(1, 2013);
        assertThat(meetup.day(SATURDAY, MeetupSchedule.THIRD)).isEqualTo(expected);
    }

    @Test
    void testThirdSaturdayOfFebruary2013() {
        LocalDateTime expected = LocalDateTime.of(2013, 2, 16, 0, 0);
        Meetup meetup = new Meetup(2, 2013);
        assertThat(meetup.day(SATURDAY, MeetupSchedule.THIRD)).isEqualTo(expected);
    }

    @Test
    void testThirdSundayOfMarch2013() {
        LocalDateTime expected = LocalDateTime.of(2013, 3, 17, 0, 0);
        Meetup meetup = new Meetup(3, 2013);
        assertThat(meetup.day(SUNDAY, MeetupSchedule.THIRD)).isEqualTo(expected);
    }

    @Test
    void testThirdSundayOfApril2013() {
        LocalDateTime expected = LocalDateTime.of(2013, 4, 21, 0, 0);
        Meetup meetup = new Meetup(4, 2013);
        assertThat(meetup.day(SUNDAY, MeetupSchedule.THIRD)).isEqualTo(expected);
    }

    @Test
    void testFourthMondayOfMarch2013() {
        LocalDateTime expected = LocalDateTime.of(2013, 3, 25, 0, 0);
        Meetup meetup = new Meetup(3, 2013);
        assertThat(meetup.day(MONDAY, MeetupSchedule.FOURTH)).isEqualTo(expected);
    }

    @Test
    void testFourthMondayOfApril2013() {
        LocalDateTime expected = LocalDateTime.of(2013, 4, 22, 0, 0);
        Meetup meetup = new Meetup(4, 2013);
        assertThat(meetup.day(MONDAY, MeetupSchedule.FOURTH)).isEqualTo(expected);
    }

    @Test
    void testFourthTuesdayOfMay2013() {
        LocalDateTime expected = LocalDateTime.of(2013, 5, 28, 0, 0);
        Meetup meetup = new Meetup(5, 2013);
        assertThat(meetup.day(TUESDAY, MeetupSchedule.FOURTH)).isEqualTo(expected);
    }

    @Test
    void testFourthTuesdayOfJune2013() {
        LocalDateTime expected = LocalDateTime.of(2013, 6, 25, 0, 0);
        Meetup meetup = new Meetup(6, 2013);
        assertThat(meetup.day(TUESDAY, MeetupSchedule.FOURTH)).isEqualTo(expected);
    }

    @Test
    void testFourthWednesdayOfJuly2013() {
        LocalDateTime expected = LocalDateTime.of(2013, 7, 24, 0, 0);
        Meetup meetup = new Meetup(7, 2013);
        assertThat(meetup.day(WEDNESDAY, MeetupSchedule.FOURTH)).isEqualTo(expected);
    }

    @Test
    void testFourthWednesdayOfAugust2013() {
        LocalDateTime expected = LocalDateTime.of(2013, 8, 28, 0, 0);
        Meetup meetup = new Meetup(8, 2013);
        assertThat(meetup.day(WEDNESDAY, MeetupSchedule.FOURTH)).isEqualTo(expected);
    }

    @Test
    void testFourthThursdayOfSeptember2013() {
        LocalDateTime expected = LocalDateTime.of(2013, 9, 26, 0, 0);
        Meetup meetup = new Meetup(9, 2013);
        assertThat(meetup.day(THURSDAY, MeetupSchedule.FOURTH)).isEqualTo(expected);
    }

    @Test
    void testFourthThursdayOfOctober2013() {
        LocalDateTime expected = LocalDateTime.of(2013, 10, 24, 0, 0);
        Meetup meetup = new Meetup(10, 2013);
        assertThat(meetup.day(THURSDAY, MeetupSchedule.FOURTH)).isEqualTo(expected);
    }

    @Test
    void testFourthFridayOfNovember2013() {
        LocalDateTime expected = LocalDateTime.of(2013, 11, 22, 0, 0);
        Meetup meetup = new Meetup(11, 2013);
        assertThat(meetup.day(FRIDAY, MeetupSchedule.FOURTH)).isEqualTo(expected);
    }

    @Test
    void testFourthFridayOfDecember2013() {
        LocalDateTime expected = LocalDateTime.of(2013, 12, 27, 0, 0);
        Meetup meetup = new Meetup(12, 2013);
        assertThat(meetup.day(FRIDAY, MeetupSchedule.FOURTH)).isEqualTo(expected);
    }

    @Test
    void testFourthSaturdayOfJanuary2013() {
        LocalDateTime expected = LocalDateTime.of(2013, 1, 26, 0, 0);
        Meetup meetup = new Meetup(1, 2013);
        assertThat(meetup.day(SATURDAY, MeetupSchedule.FOURTH)).isEqualTo(expected);
    }

    @Test
    void testFourthSaturdayOfFebruary2013() {
        LocalDateTime expected = LocalDateTime.of(2013, 2, 23, 0, 0);
        Meetup meetup = new Meetup(2, 2013);
        assertThat(meetup.day(SATURDAY, MeetupSchedule.FOURTH)).isEqualTo(expected);
    }

    @Test
    void testFourthSundayOfMarch2013() {
        LocalDateTime expected = LocalDateTime.of(2013, 3, 24, 0, 0);
        Meetup meetup = new Meetup(3, 2013);
        assertThat(meetup.day(SUNDAY, MeetupSchedule.FOURTH)).isEqualTo(expected);
    }

    @Test
    void testFourthSundayOfApril2013() {
        LocalDateTime expected = LocalDateTime.of(2013, 4, 28, 0, 0);
        Meetup meetup = new Meetup(4, 2013);
        assertThat(meetup.day(SUNDAY, MeetupSchedule.FOURTH)).isEqualTo(expected);
    }

    @Test
    void testLastMondayOfMarch2013() {
        LocalDateTime expected = LocalDateTime.of(2013, 3, 25, 0, 0);
        Meetup meetup = new Meetup(3, 2013);
        assertThat(meetup.day(MONDAY, MeetupSchedule.LAST)).isEqualTo(expected);
    }

    @Test
    void testLastMondayOfApril2013() {
        LocalDateTime expected = LocalDateTime.of(2013, 4, 29, 0, 0);
        Meetup meetup = new Meetup(4, 2013);
        assertThat(meetup.day(MONDAY, MeetupSchedule.LAST)).isEqualTo(expected);
    }

    @Test
    void testLastTuesdayOfMay2013() {
        LocalDateTime expected = LocalDateTime.of(2013, 5, 28, 0, 0);
        Meetup meetup = new Meetup(5, 2013);
        assertThat(meetup.day(TUESDAY, MeetupSchedule.LAST)).isEqualTo(expected);
    }

    @Test
    void testLastTuesdayOfJune2013() {
        LocalDateTime expected = LocalDateTime.of(2013, 6, 25, 0, 0);
        Meetup meetup = new Meetup(6, 2013);
        assertThat(meetup.day(TUESDAY, MeetupSchedule.LAST)).isEqualTo(expected);
    }

    @Test
    void testLastWednesdayOfJuly2013() {
        LocalDateTime expected = LocalDateTime.of(2013, 7, 31, 0, 0);
        Meetup meetup = new Meetup(7, 2013);
        assertThat(meetup.day(WEDNESDAY, MeetupSchedule.LAST)).isEqualTo(expected);
    }

    @Test
    void testLastWednesdayOfAugust2013() {
        LocalDateTime expected = LocalDateTime.of(2013, 8, 28, 0, 0);
        Meetup meetup = new Meetup(8, 2013);
        assertThat(meetup.day(WEDNESDAY, MeetupSchedule.LAST)).isEqualTo(expected);
    }

    @Test
    void testLastThursdayOfSeptember2013() {
        LocalDateTime expected = LocalDateTime.of(2013, 9, 26, 0, 0);
        Meetup meetup = new Meetup(9, 2013);
        assertThat(meetup.day(THURSDAY, MeetupSchedule.LAST)).isEqualTo(expected);
    }

    @Test
    void testLastThursdayOfOctober2013() {
        LocalDateTime expected = LocalDateTime.of(2013, 10, 31, 0, 0);
        Meetup meetup = new Meetup(10, 2013);
        assertThat(meetup.day(THURSDAY, MeetupSchedule.LAST)).isEqualTo(expected);
    }

    @Test
    void testLastFridayOfNovember2013() {
        LocalDateTime expected = LocalDateTime.of(2013, 11, 29, 0, 0);
        Meetup meetup = new Meetup(11, 2013);
        assertThat(meetup.day(FRIDAY, MeetupSchedule.LAST)).isEqualTo(expected);
    }

    @Test
    void testLastFridayOfDecember2013() {
        LocalDateTime expected = LocalDateTime.of(2013, 12, 27, 0, 0);
        Meetup meetup = new Meetup(12, 2013);
        assertThat(meetup.day(FRIDAY, MeetupSchedule.LAST)).isEqualTo(expected);
    }

    @Test
    void testLastSaturdayOfJanuary2013() {
        LocalDateTime expected = LocalDateTime.of(2013, 1, 26, 0, 0);
        Meetup meetup = new Meetup(1, 2013);
        assertThat(meetup.day(SATURDAY, MeetupSchedule.LAST)).isEqualTo(expected);
    }

    @Test
    void testLastSaturdayOfFebruary2013() {
        LocalDateTime expected = LocalDateTime.of(2013, 2, 23, 0, 0);
        Meetup meetup = new Meetup(2, 2013);
        assertThat(meetup.day(SATURDAY, MeetupSchedule.LAST)).isEqualTo(expected);
    }

    @Test
    void testLastSundayOfMarch2013() {
        LocalDateTime expected = LocalDateTime.of(2013, 3, 31, 0, 0);
        Meetup meetup = new Meetup(3, 2013);
        assertThat(meetup.day(SUNDAY, MeetupSchedule.LAST)).isEqualTo(expected);
    }

    @Test
    void testLastSundayOfApril2013() {
        LocalDateTime expected = LocalDateTime.of(2013, 4, 28, 0, 0);
        Meetup meetup = new Meetup(4, 2013);
        assertThat(meetup.day(SUNDAY, MeetupSchedule.LAST)).isEqualTo(expected);
    }

}
