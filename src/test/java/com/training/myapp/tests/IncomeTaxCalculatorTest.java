package com.training.myapp.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import com.training.myapp.IncomeTaxCalculator;
import com.training.myapp.exceptions.InvalidCtcException;

public class IncomeTaxCalculatorTest {

	@Test
	public void testIncomeTaxByPaasingCtc() throws InvalidCtcException {
		
		double tax1=IncomeTaxCalculator.incomeTaxCalculate(300000.0);
		double tax2=30000.0;
		assertEquals(tax2,tax1,0.02);
	}

	@Test
	public void testIncomeTaxByPaasingCtcAsZero() throws InvalidCtcException {
		
		double tax1=IncomeTaxCalculator.incomeTaxCalculate(0.0);
		double tax2=0.0;
		assertEquals(tax2,tax1,0.02);
	}

	@Test(expected=InvalidCtcException.class)
	public void testIncomeTaxByPaasingCtcAsNegative() throws InvalidCtcException {
		
		IncomeTaxCalculator.incomeTaxCalculate(-1000.0);
		
	}

}
