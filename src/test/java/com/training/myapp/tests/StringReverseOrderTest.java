package com.training.myapp.tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.training.myapp.StringReverseOrder;

public class StringReverseOrderTest {
	
	/**
	 * @Test annotation InOrder to test each Method with different scenario
	 */
	@Test
	public void testStringReverseOrder() {
		
		System.out.println(StringReverseOrder.reverseWords("Let's take LeetCode contest"));
		
		assertEquals("s'teL ekat edoCteeL tsetnoc",StringReverseOrder.reverseWords("Let's take LeetCode contest"));
	}

}
