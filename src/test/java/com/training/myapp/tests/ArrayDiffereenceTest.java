package com.training.myapp.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import com.training.myapp.ArrayDiffereence;

public class ArrayDiffereenceTest {

	//Input parameters to pass in the method
	int arr[]= {1,5,3,4,2};
	
	int k= 3;
	/**
	 * @Test annotation InOrder to test each Method with different scenario
	 */
	
	@Test
	public void testAbsoluteDifferenceBetweenArrayIndicesIsK() {
		assertEquals(2,ArrayDiffereence.countPairswithDiffK(arr, k));
	}

}
