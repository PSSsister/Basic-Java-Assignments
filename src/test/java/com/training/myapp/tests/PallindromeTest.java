package com.training.myapp.tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.training.myapp.Pallindrome;

public class PallindromeTest {
	
	//Check whether String is pallindrome or not using @Test Annotation and providing methods
	@Test
	public void testIsPalindromewithNotPallindrome() {
	
		assertEquals(false,Pallindrome.isPallindrome("234"));
	}
	
	@Test
	public void testIsPalindromeWithPallindromeNumber() {
		assertEquals(true,Pallindrome.isPallindrome("121"));
	}

    @Test
    public void testIsPallindromeWithNegativeNumber() {
		assertEquals(false,Pallindrome.isPallindrome("-121"));
	}
}
