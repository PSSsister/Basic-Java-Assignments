package com.training.myapp;

import com.training.myapp.exceptions.PriceZeroException;

public class Discount {
	

	/*Method Type:static
	 * Method Name:calculateDiscount(It calculate 35% discount on item)
	 * Return Type=double
	 * Argument= double price
	 * access specifier=public
	 */
	
	public static double calculateDiscount(double price) throws PriceZeroException
	{
		if(price==0)
		{
			throw new PriceZeroException("Please enter price Greater than zero");
		}
		double discountAmount=price*35/100;  
		System.out.println(discountAmount);
		double newItemPrice=price-discountAmount;
		return newItemPrice;
		
		
				
	}

}
