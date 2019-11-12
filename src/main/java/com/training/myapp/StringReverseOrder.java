package com.training.myapp;

public class StringReverseOrder {
	
	public static String reverseWords(String s)
	{
	    s="Let's take LeetCode contest";
	
	    String[] words= s.split(" ");
	    for(int i=0;i<words.length;i++)
	    {
	    	words[i]=new StringBuilder(words[i]).reverse().toString();
	    }
	     return String.join(" ", words);
	}
}
