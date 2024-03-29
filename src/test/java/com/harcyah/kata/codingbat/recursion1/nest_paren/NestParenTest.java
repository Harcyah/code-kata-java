package com.harcyah.kata.codingbat.recursion1.nest_paren;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class NestParenTest {

    @Test
    void testNestParen() {
        NestParen nestParen = new NestParen();
        assertThat(nestParen.nestParen("(())")).isTrue();
        assertThat(nestParen.nestParen("((()))")).isTrue();
        assertThat(nestParen.nestParen("(((x))")).isFalse();
        assertThat(nestParen.nestParen("((())")).isFalse();
        assertThat(nestParen.nestParen("((()()")).isFalse();
        assertThat(nestParen.nestParen("()")).isTrue();
        assertThat(nestParen.nestParen("")).isTrue();
        assertThat(nestParen.nestParen("(yy)")).isFalse();
        assertThat(nestParen.nestParen("(())")).isTrue();
        assertThat(nestParen.nestParen("(((y))")).isFalse();
        assertThat(nestParen.nestParen("((y)))")).isFalse();
        assertThat(nestParen.nestParen("((()))")).isTrue();
        assertThat(nestParen.nestParen("(())))")).isFalse();
        assertThat(nestParen.nestParen("((yy())))")).isFalse();
        assertThat(nestParen.nestParen("(((())))")).isTrue();
    }

}
