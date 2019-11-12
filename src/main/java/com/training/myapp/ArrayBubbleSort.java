package com.training.myapp;

import com.training.myapp.exceptions.ArrayIsEmptyException;

public class ArrayBubbleSort {
	public static int arr[]= {5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};   //static array decla
	
	/*Method Type:static
	 * Method Name:bubbleSort
	 * Return Type=int[]
	 * 
	 * access specifier=public
	 */
	
	public static int[] bubbleSort(int arr[]) throws ArrayIsEmptyException {
		
		
		if(arr.length==0)
		{
			throw new ArrayIsEmptyException("Array should not be empty");
		}
		int l=arr.length;
		for(int i=0;i<l-1;i++)
		{
			for(int j=i+1;j<l;j++)
			{
				if(arr[i] > arr[j])                            //It specify condition
				{
					int temp=arr[i];                           // swap the elements
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		return arr;
		
	}
	
	

}
