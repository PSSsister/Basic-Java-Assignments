package com.training.myapp;

public class ArrayDiffereence {
	//Initialization of Static variable and static array
    public static int arr[]= {1,5,3,4,2};
	public static int k= 3;
	
	/*Method Type:static
	 * Method Name:countPairswithDiffK
	 * Return Type=boolean
	 * Argument=int arr[],int k
	 * access specifier=public
	 */
	
	public static int countPairswithDiffK(int arr[],int k)
	{
		int n=arr.length;
		int count =0;
		
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(arr[i] - arr[j]==k || arr[j]-arr[i]==k)
					count++;
			}
		}
		return count;
	}

}
