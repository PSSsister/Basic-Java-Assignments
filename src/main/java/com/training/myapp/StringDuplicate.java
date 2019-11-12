package com.training.myapp;

import java.util.Arrays;
import java.util.stream.Collectors;

public class StringDuplicate {
	
	
	
	public static String removeDuplicateCharacters(String s)
	{
		String noDuplicates = Arrays.asList(s.split(""))           //It split means separate the string 
              .stream()                                            //convert array as list into stream
               .distinct()                                         //stream method for unique element
               .collect(Collectors.joining());                     //return the result of operations processed on stream
		return noDuplicates;
		
		

	}
	
	

}
