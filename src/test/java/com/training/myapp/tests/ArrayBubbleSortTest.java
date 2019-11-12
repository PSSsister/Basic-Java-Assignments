package com.training.myapp.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import com.training.myapp.ArrayBubbleSort;

public class ArrayBubbleSortTest {

	@Test
	public void testBubbleSortByPassingArray() {
	
		
		int arr1[]= {1,5,6,7,12,14,19,23,26,35,37,47,52,78,86};
		System.out.println(arr1.length);
		assertArrayEquals(arr1,ArrayBubbleSort.bubbleSort());

}
}
