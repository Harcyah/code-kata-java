package com.harcyah.kata.codingbat.string3.max_block;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MaxBlockTest {

    @Test
    void testMaxBlock() {
        MaxBlock maxBlock = new MaxBlock();
        assertThat(maxBlock.maxBlock("hoopla")).isEqualTo(2);
        assertThat(maxBlock.maxBlock("abbCCCddBBBxx")).isEqualTo(3);
        assertThat(maxBlock.maxBlock("")).isZero();
        assertThat(maxBlock.maxBlock("xyz")).isEqualTo(1);
        assertThat(maxBlock.maxBlock("xxyz")).isEqualTo(2);
        assertThat(maxBlock.maxBlock("xyzz")).isEqualTo(2);
        assertThat(maxBlock.maxBlock("abbbcbbbxbbbx")).isEqualTo(3);
        assertThat(maxBlock.maxBlock("XXBBBbbxx")).isEqualTo(3);
        assertThat(maxBlock.maxBlock("XXBBBBbbxx")).isEqualTo(4);
        assertThat(maxBlock.maxBlock("XXBBBbbxxXXXX")).isEqualTo(4);
        assertThat(maxBlock.maxBlock("XX2222BBBbbXX2222")).isEqualTo(4);
    }

}
