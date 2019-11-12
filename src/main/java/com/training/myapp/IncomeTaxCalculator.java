package com.training.myapp;

import com.training.myapp.exceptions.InvalidCtcException;

public class IncomeTaxCalculator {
	
	public static double incomeTaxCalculate(double ctc) throws InvalidCtcException
	{
		double tax=0.0;
		if(ctc>=0 && ctc<=180000.0)
		{
			return tax;
		}
		else if(ctc>=180000.1 && ctc<=300000.0)
		{
			tax=ctc*10/100;
			return tax;
		}
		else if(ctc>=300000.1 && ctc<=500000.0)
		{
			tax=ctc*20/100;
			return tax;
		}
		else if(ctc>=500000.1 && ctc<=1000000.0)
		{
			tax=ctc*30/100;
			return tax;
		}
		else
		{
			throw new InvalidCtcException("Please enter Positive value");
		}
	}

}
