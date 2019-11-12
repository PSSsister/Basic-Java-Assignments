package com.training.myapp;

import java.util.StringTokenizer;

public class RemoveWord {
	
	public static String removeWordsFromSentence(String s,String del,int pos)
	{
		 s=s.toUpperCase();                  //Convert String into uppercase by calling String uppercase method
		 int l=s.length();
		
		 String ans=" ";
		
	     StringTokenizer str= new StringTokenizer(s," .?!"); //String Tokenizer Create Tokens separate the String into tokens
	     int c=str.countTokens();  //countTokens count the tokens
		 String w="";
		 if(pos<1||pos>l)        //check for the position value
		 {
				 System.out.println("Sorry! The word position entered is out of range");
		 }
		 else
		 {
			for(int i=1;i<=c;i++) //Iterate the tokens upto the countOfTokens
			{
			  w=str.nextToken();  //to get next token
			  if(w.equals(del)==true && i==pos)
					  continue;
			        ans=ans + w +" ";
						 
			 }
				 System.out.println("Output: "+ans.trim());
				 
		 }
		
		return ans;
		
	}

}
