package com.training.myapp;



public class ArmstrongRange {
	
	
	/*Method Type:static
	 * Method Name:checkArmstrongNumber(To check whether number is Armstrong Or Not Within the range eg.153=1^3+5^3+3^3=1+125+27=153
	 * Return Type=int[]
	 * 
	 */
	
	public static  int[] checkArmstrongNumber()
	{
        int armNumberArray[]=new int[5]; 
        int i=0;
        for(int num=100;num<=999;num++)                       //for loop to iterate the number from 100 to 999 range
        {
        	int temp=num;
        	int rem,sum=0;
        	
        	while(temp!=0)                                 //while loop to iterate the loop until condition is true
        	{
        		rem=temp%10;
        		sum=sum+(rem*rem*rem);
        		temp=temp/10;
        	}
        	if(num==sum)                                     //if num is equal to the sum
        	{
        		armNumberArray[i]=num;                       //assign number to the array index
        		i=i+1;                                       //increment index
        	}
        }
		return armNumberArray;
		
	}
}

