package com.training.myapp.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import com.training.myapp.StringOccourance;

public class StringOccouranceTest {
	/**
	 * @Test annotation InOrder to test each Method with different scenario
	 */
	@Test
	public void testStringOccuranceCount() {
		
		String[] names= {"Dave","Ann","George","Sam","Ted","Gag","Saj","Agati","Mary","Sam","Ayan","Dev",
				"Kity","Meery","Smith","Johnson", "Bill","Williams","Jones","Brown","Davis","Miller","Wilson",
				"Moore","Taylor","Anderson","Thomas","Jackson"};
		
		assertEquals( 2,StringOccourance.NumberOfOccurance(names,"Sam"));
		
		
	}
	
	@Test
	public void testStringOccuranceByPassingNameWhichIsNotInTheArray() {
		
		String[] names= {"Dave","Ann","George","Sam","Ted","Gag","Saj","Agati","Mary","Sam","Ayan","Dev",
				"Kity","Meery","Smith","Johnson", "Bill","Williams","Jones","Brown","Davis","Miller","Wilson",
				"Moore","Taylor","Anderson","Thomas","Jackson"};
		
		assertEquals( 0,StringOccourance.NumberOfOccurance(names,"Priyanka"));
		
		
	}


}
