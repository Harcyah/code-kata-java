package com.harcyah.kata.codingbat.logic1.inOrderEqual;

import org.junit.Assert;
import org.junit.Test;

public class InOrderEqualTest {

	@Test
	public void testInOrderEqual() {
		InOrderEqual inOrderEqual = new InOrderEqual();
		Assert.assertEquals(true, inOrderEqual.inOrderEqual(2, 5, 11, false));
		Assert.assertEquals(false, inOrderEqual.inOrderEqual(5, 7, 6, false));
		Assert.assertEquals(true, inOrderEqual.inOrderEqual(5, 5, 7, true));
		Assert.assertEquals(false, inOrderEqual.inOrderEqual(5, 5, 7, false));
		Assert.assertEquals(false, inOrderEqual.inOrderEqual(2, 5, 4, false));
		Assert.assertEquals(false, inOrderEqual.inOrderEqual(3, 4, 3, false));
		Assert.assertEquals(false, inOrderEqual.inOrderEqual(3, 4, 4, false));
		Assert.assertEquals(false, inOrderEqual.inOrderEqual(3, 4, 3, true));
		Assert.assertEquals(true, inOrderEqual.inOrderEqual(3, 4, 4, true));
		Assert.assertEquals(true, inOrderEqual.inOrderEqual(1, 5, 5, true));
		Assert.assertEquals(true, inOrderEqual.inOrderEqual(5, 5, 5, true));
		Assert.assertEquals(false, inOrderEqual.inOrderEqual(2, 2, 1, true));
		Assert.assertEquals(false, inOrderEqual.inOrderEqual(9, 2, 2, true));
		Assert.assertEquals(false, inOrderEqual.inOrderEqual(0, 1, 0, true));
	}

}