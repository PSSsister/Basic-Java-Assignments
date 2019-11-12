package com.training.myapp;

public class ArmStrong {

	
	 // Method Name:checkArmstrong(To check whether number is Armstrong Or Not eg.153=1^3+5^3+3^3=1+125+27=153
	
	public static boolean checkArmstrong(int number) {
		
		int sum = 0,rem;                          
		int orgnum=number;
		//Iterate the loop until while number is not equal to 0
		while(number !=0)
		{
			rem=number%10;              //find remainder of number
			sum=sum+(rem*rem*rem);      
			number=number/10;          //find quotient and assigned it to the number
		}
		if(orgnum==sum)            //check orgnum is equal to the sum if yes the execute if block
		{
			return true;
			
		}
		
	
	return false;	
		
	}

}
