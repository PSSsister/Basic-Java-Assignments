package com.training.myapp;

import com.training.myapp.exceptions.ArrayIsEmptyException;

public class ArraySearch {
	public static int arr[]= {5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
	
	/*Method Type:static
	 * Method Name:search (It serch the element)
	 * Return Type=boolean
	 * Argument=int number
	 * access specifier=public
	 */
	public static boolean search(int arr[],int k) throws ArrayIsEmptyException
	{
		if(arr.length==0)
		{
			throw new ArrayIsEmptyException("Array should not be empty");
		}
		for(int i=0;i<arr.length;i++)//Iterate the array
		{
			if(arr[i]==k)
			{
				return true;
			}
		}
		return false;
	}
}
