package com.training.myapp;

import com.training.myapp.exceptions.ArrayIsEmptyException;

public class MultiDimentionalArraySearch {
	
	public static boolean searchElementInMultiDimentionalArray(int m[][],int element) throws ArrayIsEmptyException
	{
		
		if(m.length==0)
		{
			throw new ArrayIsEmptyException("Array should not be empty");
		}
		
		boolean elementFound = false;
		
	   for(int i=0;i<m.length;i++)
	   {
		   for(int j=0;j<m[i].length;j++)
		   {
			   if(m[i][j]==element)
			   {
				   elementFound=true;
				   break;
			   }
		   }
	   }
	return elementFound;
	}
}
