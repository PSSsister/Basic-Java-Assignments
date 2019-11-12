package com.training.myapp;

public class Interest {
	

	/*Method Type:static
	 * Method Name:simpleInt(It calculate simple Interest)
	 * Return Type=double
	 * Argument=double principle,double rate,double time
	 * access specifier=public
	 */
	public static double simpleInt(double p,double rate,double time)
	{
        
		return (p*time*rate)/100;
	}

	/*Method Type:static
	 * Method Name:comInt(It calculate Compound Interest)
	 * Return Type=double
	 * Argument=double principle,double rate,double time
	 * access specifier=public
	 */

	public static double compInt(double p,double rate,double time)
	{
	
		return p*Math.pow(1.0+rate/100.0, time)-p;
	}
	


}
