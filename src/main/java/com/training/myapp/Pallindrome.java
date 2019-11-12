package com.training.myapp;

public class Pallindrome {
	
	/*Method Type:static
	 * Method Name:isPallindrome
	 * Return Type=boolean
	 * Argument=String s
	 * access specifier=public
	 */
	public static boolean isPallindrome(String s)
	{
		
		String temp=" ";                         //take temp String as empty
		for(int i=s.length()-1;i>=0;i--)         //Iterate the loop inorder to get reverse order of string
		{		System.out.println(s.charAt(i));

			temp=temp+s.charAt(i);        
		}
		if(temp.trim().equals(s))            
		{
			System.out.println(temp);
			return true;
		}
		return false;
		
	}
}
