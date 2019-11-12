package com.training.myapp.tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.training.myapp.Square;



public class SquareTest {
	/**
	 * @Test annotation InOrder to test each Method with different scenario
	 */
	
  @Test
	public void testSquareOfPositiveNumber() {
		assertEquals(25, Square.FindSquare(5));
	}
  @Test
	public void testSquareOfNegativeNumber() {
		assertEquals(25, Square.FindSquare(-5));
	}
  
 
}
