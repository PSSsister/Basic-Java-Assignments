package com.training.myapp.tests;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Ignore;
import org.junit.Test;

import com.training.myapp.ArmstrongRange;

public class ArmstrongRangeTest {
	
	/**
	 * @Test annotation InOrder to test each Method with different scenario
	 */
	@Test 
	public void testwhetherArmstrongAreInValidRange() {
		int[] a= ArmstrongRange.checkArmstrongNumber();
		int[] e= {153,370,371,407,0};
		assertArrayEquals(e,a);
		
		
		
	}
	
	
	

}
