package com.harcyah.kata.misc.josephus;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class JosephusRecursiveImplTest {

    protected JosephusRecursiveImpl josephus = new JosephusRecursiveImpl();

    @Test
    void testWith5PeopleAndStep3() {
        assertThat(josephus.getLastManStanding(5, 3)).isEqualTo(3);
    }

    @Test
    void testWith10PeopleAndStep4() {
        assertThat(josephus.getLastManStanding(10, 4)).isEqualTo(4);
    }

    @Test
    void testWith100PeopleAndStep2() {
        assertThat(josephus.getLastManStanding(100, 2)).isEqualTo(72);
    }

}
