package com.training.myapp;

public class Square {

	public static int findSquare(int number) {
		
		int square=0;
		for(int i=1;i<=number;i++)
		{
		      System.out.println(number+"*"+i+"="+number*i);
		}
		square = number*number;
		System.out.println("Square : "+square);
        return square;
	}

}
