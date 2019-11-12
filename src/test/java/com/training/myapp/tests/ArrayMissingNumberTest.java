package com.training.myapp.tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.training.myapp.ArrayMissingNumber;
import com.training.myapp.exceptions.ArrayIsEmptyException;

public class ArrayMissingNumberTest {
	/**
	 * @Test annotation InOrder to test each Method with different scenario
	 */
	//check the missing number in the array
	
	@Test
	public void testMissingNumberInArray() throws ArrayIsEmptyException
	{
		int arr[]= {0,1,2,3,4,6,7,8,9,10};
		assertEquals(5,ArrayMissingNumber.missingNumber(arr));
	}
	// check whether exception is thrown when  empty array is provided
	@Test(expected=ArrayIsEmptyException.class)
	public void testMissingNumberInArrayWhenArrayIsEmpty() throws ArrayIsEmptyException
	{
		int arr[]= {};
		assertEquals(5,ArrayMissingNumber.missingNumber(arr));
	}

}
