package com.training.myapp;

public class StringReverseOrder {
	
	public static String reverseWords(String s)
	{
	    s="Let's take LeetCode contest";
	
	    String[] words= s.split(" ");               //split the string
	    for(int i=0;i<words.length;i++)
	    {
	    	words[i]=new StringBuilder(words[i]).reverse().toString();    //perform reverse and convert to the string
	    }
	     return String.join(" ", words);
	}
}
