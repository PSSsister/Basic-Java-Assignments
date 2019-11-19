package com.training.myapp;

class StudentAverageAndTotal{
	
	static int m[][]= {{48,57,78},{60,78,89},{79,56,90}};
	public static double calculateTotalAndAverageOfThreeSubject(int m[][])
	{
	    double total=0;double average=0;int count=0;
		for(int i=0;i<3;i++)
		{ 
			for(int j=0;j<3;j++)
			{
			    total=total+m[i][j];
			    average=total/3;
			}
			
			count+=1;
			System.out.println("Student "+count+" total mark:"+total);
			System.out.println("Student "+count+" average mark:"+average);
		}	
		System.out.println("----------This code is to calculate each subject total mark and average marks-------");
		count = 0;
		for(int i = 0;i<3;i++) {
			for(int j = 0;j<3;j++) {
				total += m[j][i];
				average = total/3;
			}

			count+=1;
			System.out.println("subject "+count+" total mark:"+total);
			System.out.println("subject "+count+" average mark:"+average);
		}

		return average;
	}

	    public static void main(String[] args) {
		StudentAverageAndTotal sat=new StudentAverageAndTotal();
		StudentAverageAndTotal.calculateTotalAndAverageOfThreeSubject(m);
	}
	
}