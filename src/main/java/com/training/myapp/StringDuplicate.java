package com.training.myapp;

import java.util.Arrays;
import java.util.stream.Collectors;

public class StringDuplicate {
	
	public static String removeDuplicateCharacters(String s)
	{
		String noDuplicates = Arrays.asList(s.split(""))
              .stream()
               .distinct()
               .collect(Collectors.joining());
		return noDuplicates;
		
		

	}
	
	

}
