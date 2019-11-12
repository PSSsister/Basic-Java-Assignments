package com.training.myapp;

import java.util.Arrays;
import java.util.HashMap;

public class PallindromeString {
	
	public static String[] str= {"MADAM","PAPER","ABBA","PEN","ABBCCBBA","CDFDC","PENCIL","ERASER","GHHG","PENPENCIL"};
		
	/*Method Type:static
	 * Method Name:isPallindrome
	 * Return Type=boolean
	 * Argument=String s
	 * access specifier=public
	 */
	
	public static boolean CheckPallindrome(String s)
	{
		
		String temp=" ";
		for(int i=s.length()-1;i>=0;i--)
		{		System.out.println(s.charAt(i));

			temp=temp+s.charAt(i);
		}
		if(temp.trim().equals(s))
		{System.out.println(temp);
			return true;
		}
		return false;
		
	}
	/*Method Type:static
	 * Method Name:descOrder
	 * Return Type=String
	 * Argument=String s
	 * access specifier=public
	 */

	public static String descOrder(String s)
	{
		char[] c=s.toCharArray();        //convert String into character array
		Arrays.sort(c);                 //sort the character in ascending order which is default order
		String t= new StringBuffer(String.valueOf(c)).reverse().toString();  //convert character array into String and reverse the string for descending order
		return t;
	}
	/*Method Type:static
	 * Method Name:countCharactersOfPallindrome
	 * Return Type=HashMap<String,Integer>
	 * Argument=String str[]
	 * access specifier=public
	 */

	
	public static HashMap<String,Integer> CountCharactersOfPallindrome(String str[])
	{
		HashMap<String,Integer> hmap=new HashMap<>();
		for(int index=0;index<str.length;index++)
	    { 
			 if(CheckPallindrome(str[index]))
			 {
				 hmap.put(descOrder(str[index]), str[index].length());
			 }
			 
		}
		return hmap;
		
	}
	
}


