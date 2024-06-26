package com.harcyah.kata.codingbat.logic1.red_ticket;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class RedTicketTest {

    @Test
    void testRedTicket() {
        RedTicket redTicket = new RedTicket();
        assertThat(redTicket.redTicket(2, 2, 2)).isEqualTo(10);
        assertThat(redTicket.redTicket(2, 2, 1)).isZero();
        assertThat(redTicket.redTicket(0, 0, 0)).isEqualTo(5);
        assertThat(redTicket.redTicket(2, 0, 0)).isEqualTo(1);
        assertThat(redTicket.redTicket(1, 1, 1)).isEqualTo(5);
        assertThat(redTicket.redTicket(1, 2, 1)).isZero();
        assertThat(redTicket.redTicket(1, 2, 0)).isEqualTo(1);
        assertThat(redTicket.redTicket(0, 2, 2)).isEqualTo(1);
        assertThat(redTicket.redTicket(1, 2, 2)).isEqualTo(1);
        assertThat(redTicket.redTicket(0, 2, 0)).isZero();
        assertThat(redTicket.redTicket(1, 1, 2)).isZero();
    }

}
