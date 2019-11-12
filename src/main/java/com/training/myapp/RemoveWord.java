package com.training.myapp;

import java.util.StringTokenizer;

public class RemoveWord {
	
	public static String RemoveWordsFromSentence(String s,String del,int pos)
	{
		 s=s.toUpperCase();
		 int l=s.length();
		 char last=s.charAt(l-1);//Extracting Last Character
		 String ans=" ";
		 
		 /*Checking whether the sentence ends with '.' or'?' or not */
		 if(last !='.' && last !='?' &&  last !='!')
		 {
			 System.out.println("Invalid Input.End a sentence either '.'?' or '!' only");
		 }
		 else
		 {
			 StringTokenizer str= new StringTokenizer(s," .?!");
			 int c=str.countTokens();
			 String w="";
			 if(pos<1||pos>l)
			 {
				 System.out.println("Sorry! The word position entered is out of range");
			 }
			 else
			 {
				 for(int i=1;i<=c;i++)
				 {
					 w=str.nextToken();
					 if(w.equals(del)==true && i==pos)
					 
						 continue;
			        ans=ans + w +" ";
						 
				 }
				 System.out.println("Output: "+ans.trim()+last);
				 
			 }
		 }
		return ans;
		
	}

}
