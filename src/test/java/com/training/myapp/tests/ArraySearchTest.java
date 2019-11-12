package com.training.myapp.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import com.training.myapp.ArraySearch;
import com.training.myapp.exceptions.ArrayIsEmptyException;

public class ArraySearchTest {

	/**
	 * @throws ArrayIsEmptyException 
	 * @Test annotation InOrder to test each Method with different scenario
	 */
	@Test
	public void testElementIsPresent() throws ArrayIsEmptyException {
		 
		assertEquals(true,ArraySearch.search(ArraySearch.arr,19));
	}
	
	@Test
	public void testElementIsNotPresent() throws ArrayIsEmptyException {
		assertEquals(false,ArraySearch.search(ArraySearch.arr,11));
	}
    
	@Test(expected=ArrayIsEmptyException.class)
	public void testWhenArrayIsEmpty() throws ArrayIsEmptyException {
		
		int arr1[]= {};
	    ArraySearch.search(arr1,11);
	}


}
