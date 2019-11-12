package com.training.myapp;

public class StringOccourance {
	
	public static int numberOfOccurance(String[]s,String name)
	{
		
		int count=0;
		for(int i=0;i<s.length;i++)
		{
			if(s[i].equals(name))
			{
				count++;
				
			}
		}
		if(count!=0)
		{
			System.out.println("The Number of occurance of the Name is : " +count);
		}
		else
		{
			System.out.println("Word Not Found");
		}
		return count;
	}

}
