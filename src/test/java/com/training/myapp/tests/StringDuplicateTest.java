package com.training.myapp.tests;

import static org.junit.Assert.*;

import org.junit.Test;


import com.training.myapp.StringDuplicate;

public class StringDuplicateTest {

	/**
	 * @Test annotation InOrder to test each Method with different scenario
	 */
	@Test
	public void testDuplicateCharacterOccuranceAndReturnUniqueString() {
		assertEquals("abc",StringDuplicate.removeDuplicateCharacters("abcabcabc"));
	}

	@Test
	public void testDuplicateCharacterOccuranceWhenProvidedEmptyStringAndReturnUniqueString() {
		assertEquals("",StringDuplicate.removeDuplicateCharacters(""));
	}

}
