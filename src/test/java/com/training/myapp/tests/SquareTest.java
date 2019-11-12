package com.training.myapp.tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.training.myapp.Square;



public class SquareTest {
	/**
	 * @throws ValueOutOfRangeException 
	 * @Test annotation InOrder to test each Method with different scenario
	 */
	
	//find the square when positive number is provided
  @Test
	public void testSquareOfPositiveNumber() {
		assertEquals(25, Square.findSquare(5));
	}
  //find the square when negative number is provided
  @Test
	public void testSquareOfNegativeNumber() {
		assertEquals(25, Square.findSquare(-5));
	}
  
  
 
 
}
