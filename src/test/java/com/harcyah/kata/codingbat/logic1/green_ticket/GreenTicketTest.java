package com.harcyah.kata.codingbat.logic1.green_ticket;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class GreenTicketTest {

    @Test
    void testGreenTicket() {
        GreenTicket greenTicket = new GreenTicket();
        assertThat(greenTicket.greenTicket(1, 2, 3)).isZero();
        assertThat(greenTicket.greenTicket(2, 2, 2)).isEqualTo(20);
        assertThat(greenTicket.greenTicket(1, 1, 2)).isEqualTo(10);
        assertThat(greenTicket.greenTicket(2, 1, 1)).isEqualTo(10);
        assertThat(greenTicket.greenTicket(1, 2, 1)).isEqualTo(10);
        assertThat(greenTicket.greenTicket(3, 2, 1)).isZero();
        assertThat(greenTicket.greenTicket(0, 0, 0)).isEqualTo(20);
        assertThat(greenTicket.greenTicket(2, 0, 0)).isEqualTo(10);
        assertThat(greenTicket.greenTicket(0, 9, 10)).isZero();
        assertThat(greenTicket.greenTicket(0, 10, 0)).isEqualTo(10);
        assertThat(greenTicket.greenTicket(9, 9, 9)).isEqualTo(20);
        assertThat(greenTicket.greenTicket(9, 0, 9)).isEqualTo(10);
    }

}
