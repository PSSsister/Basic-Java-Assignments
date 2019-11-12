package com.training.myapp.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import com.training.myapp.ArrayMissingNumber;
import com.training.myapp.MultiDimentionalArraySearch;
import com.training.myapp.exceptions.ArrayIsEmptyException;

public class MultiDimentionalArraySearchTest {
	
	/*
	 * Test annotation to test the method
	 */

	//Check whether given element present in the multidimensional array
	@Test
	public void testWhetherTheElementPresentInTheMultidimentionalArray() throws ArrayIsEmptyException {
		
		int m[][]={ { 1, 2 }, { 3, 4 } ,{6,7}};
		assertEquals(true,MultiDimentionalArraySearch.searchElementInMultiDimentionalArray(m, 6));
		
	}
	//Check whether the given element is not present in the multidimensional array
	@Test
	public void testWhenElementIsNotPresentInTheMultidimentionalArray() throws ArrayIsEmptyException {
		
		int m[][]={ { 1, 2 }, { 3, 4 } ,{6,7}};
		assertEquals(false,MultiDimentionalArraySearch.searchElementInMultiDimentionalArray(m, 5));
		
	}
    //check when empty array is provided
	@Test(expected=ArrayIsEmptyException.class)
	public void testElementPresentInTheMultidimentionalArrayWhenArrayIsEmpty() throws ArrayIsEmptyException
	{
		int arr[][]= {};
		MultiDimentionalArraySearch.searchElementInMultiDimentionalArray(arr,1);
		
	}
}
