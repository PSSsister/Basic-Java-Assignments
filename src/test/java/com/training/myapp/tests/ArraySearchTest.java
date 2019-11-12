package com.training.myapp.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import com.training.myapp.ArraySearch;

public class ArraySearchTest {

	/**
	 * @Test annotation InOrder to test each Method with different scenario
	 */
	@Test
	public void testElementIsPresent() {
		assertEquals(true,ArraySearch.search(19));
	}
	
	@Test
	public void testElementIsNotPresent() {
		assertEquals(false,ArraySearch.search(11));
	}


}
