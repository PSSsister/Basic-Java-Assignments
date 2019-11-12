package com.training.myapp.tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.training.myapp.Interest;
import com.training.myapp.exceptions.InvalidInputException;

public class InterestTest {
	/**
	 * @throws InvalidInputException 
	 * @Test annotation InOrder to test each Method with different scenario
	 */
    //check simple Interest
	
	@Test
	public void testsimpleInterest() throws InvalidInputException
	{
	   assertEquals(2016.0,Interest.simpleInt(8400, 6, 4),2.0);
    }
	
   //check compound Interest
	
	@Test
	public void testCompoundnterest() throws InvalidInputException
	{
	   assertEquals(2204.806464000003,Interest.compInt(8400, 6, 4),2.0);
    }
	
    //check when invalid values provided to the method for parameters is it shows exception
	
	@Test(expected=InvalidInputException.class)
	public void testCompoundnterestWithInvalidInput() throws InvalidInputException
	{
	   Interest.compInt(0, -3, 4);
    }
}
