package com.training.myapp;

import com.training.myapp.exceptions.InvalidInputException;


public class Interest {
	

	/*Method Type:static
	 * Method Name:simpleInt(It calculate simple Interest)
	 * Return Type=double
	 * Argument=double principle,double rate,double time
	 * access specifier=public
	 */
	public static double simpleInt(double principle,double rate,double time) throws InvalidInputException
	{
        checkValidInput(principle,rate,time);
        double simInt=principle*time*rate/100;
		return simInt;
	}

	/*Method Type:static
	 * Method Name:comInt(It calculate Compound Interest)
	 * Return Type=double
	 * Argument=double principle,double rate,double time
	 * access specifier=public
	 */

	public static double compInt(double principle,double rate,double time) throws InvalidInputException
	{
		checkValidInput(principle,rate,time);
        double comInt=principle*Math.pow(1.0+rate/100.0, time)-principle;
		
		return comInt;
	}
	
	static void checkValidInput(double principle,double rate,double time) throws InvalidInputException {
		if(principle <= 0 || rate <= 0 || time <= 0) {
			throw new InvalidInputException("Please enter proper values");
		}

}
}
