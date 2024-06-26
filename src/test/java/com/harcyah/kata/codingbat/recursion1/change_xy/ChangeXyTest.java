package com.harcyah.kata.codingbat.recursion1.change_xy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ChangeXyTest {

    @Test
    void testChangeXy() {
        ChangeXY sut = new ChangeXY();
        assertThat(sut.changeXY("codex")).isEqualTo("codey");
        assertThat(sut.changeXY("xxhixx")).isEqualTo("yyhiyy");
        assertThat(sut.changeXY("xhixhix")).isEqualTo("yhiyhiy");
        assertThat(sut.changeXY("hiy")).isEqualTo("hiy");
        assertThat(sut.changeXY("h")).isEqualTo("h");
        assertThat(sut.changeXY("x")).isEqualTo("y");
        assertThat(sut.changeXY("")).isEmpty();
        assertThat(sut.changeXY("xxx")).isEqualTo("yyy");
        assertThat(sut.changeXY("yyhxyi")).isEqualTo("yyhyyi");
        assertThat(sut.changeXY("hihi")).isEqualTo("hihi");
    }

}
