package com.training.myapp.tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.training.myapp.ArmStrong;

public class ArmstrongTest {

	/**
	 * @Test annotation InOrder to test each Method with different scenario
	 */
	@Test
	 public void TestValidArmstrongNumber() {
	
		 assertEquals(true,ArmStrong.checkArmstrong(153));
	}
	
	@Test
	 public void TestInValidArmstrongNumber() {
	
		 assertEquals(false,ArmStrong.checkArmstrong(532));
	}
}
