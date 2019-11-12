package com.training.myapp.tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.training.myapp.Interest;

public class InterestTest {
	/**
	 * @Test annotation InOrder to test each Method with different scenario
	 */

	@Test
	public void testsimpleInterest()
	{
	   assertEquals(2016.0,Interest.simpleInt(8400, 6, 4),2.0);
    }

	@Test
	public void testCompoundnterest()
	{
	   assertEquals(2204.806464000003,Interest.compInt(8400, 6, 4),2.0);
    }

}
