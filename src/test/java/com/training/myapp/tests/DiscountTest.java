package com.training.myapp.tests;

import static org.junit.Assert.*;

import java.text.ParseException;

import org.junit.Test;

import com.training.myapp.Discount;
import com.training.myapp.exceptions.PriceZeroException;

public class DiscountTest {

	/**
	 * @Test annotation InOrder to test each Method with different scenario
	 */
	@Test
	public void testNewItemPrice() throws PriceZeroException {
		assertEquals(14950.0,Discount.calculateDiscount(23000.0),0.02);
	}

	@Test(expected=PriceZeroException.class)
	public void testNewItemPriceWhenPriceIsZero() throws PriceZeroException {
	   Discount.calculateDiscount(0);
	}
}
