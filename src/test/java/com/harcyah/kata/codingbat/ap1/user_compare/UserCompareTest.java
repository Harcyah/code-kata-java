package com.harcyah.kata.codingbat.ap1.user_compare;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class UserCompareTest {

    @Test
    void testUserCompare() {
        UserCompare userCompare = new UserCompare();
        assertThat(userCompare.userCompare("bb", 1, "zz", 2))
            .isEqualTo(-1);
        assertThat(userCompare.userCompare("bb", 1, "aa", 2))
            .isEqualTo(1);
        assertThat(userCompare.userCompare("bb", 1, "bb", 1))
            .isZero();
        assertThat(userCompare.userCompare("bb", 5, "bb", 1))
            .isEqualTo(1);
        assertThat(userCompare.userCompare("bb", 5, "bb", 10))
            .isEqualTo(-1);
        assertThat(userCompare.userCompare("adam", 1, "bob", 2))
            .isEqualTo(-1);
        assertThat(userCompare.userCompare("bob", 1, "bob", 2))
            .isEqualTo(-1);
        assertThat(userCompare.userCompare("bzb", 1, "bob", 2))
            .isEqualTo(1);
    }

}
