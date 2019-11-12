package com.training.myapp;

public class ArmStrong {

	/*Method Type:static
	 * Method Name:checkArmstrong(To check whether number is Armstrong Or Not eg.153=1^3+5^3+3^3=1+125+27=153
	 * Return Type=boolean
	 * Argument=int number
	 * access specifier=public
	 */
	public static boolean checkArmstrong(int number) {
		// TODO Auto-generated method stub
		int sum = 0,rem;
		int orgnum=number;
		//Iterate the loop until while condition is true
		while(number !=0)
		{
			rem=number%10;
			sum=sum+(rem*rem*rem);
			number=number/10;
		}
		if(orgnum==sum)
		{
			return true;
			
		}
		
	
	return false;	
		
	}

}
