package com.training.myapp;

import com.training.myapp.exceptions.ArrayIsEmptyException;

public class ArrayMissingNumber {
	
	/*Method Type:static
	 * Method Name:missingNumber(It find out missing number from the array)
	 * Return Type=long
	 * Argument=int[] number
	 * access specifier=public
	 */
	
	public static long missingNumber(int[] nums) throws ArrayIsEmptyException
	{
		if(nums.length==0)
		{
			throw new ArrayIsEmptyException("Array should not be empty");
		}
		int expectedNoOfElements=nums.length;
		int total_sum=expectedNoOfElements *(expectedNoOfElements+1)/2;
		
		int sum=0;
		for(int i=0;i<nums.length;i++)
		{
			sum=sum+nums[i];
		}
		
		int Missing=total_sum-sum;
		System.out.println("Missing Number : "+Missing);
		return Missing;
		
	}

	
	

}
