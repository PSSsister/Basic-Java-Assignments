package com.training.myapp;

public class SubjectMarks {

	public static String subjectMarks(int sub1,int sub2,int sub3)
	{
		if(sub1>60 && sub2>60 && sub3>60)
		{
			return  "Passed";
		}
		else if(sub1>60 && sub2>60 ||sub2>60 && sub3>60 && sub1>60 && sub3>60)
		{
			return  "Promoted";
		}
		else
		{
			return  "failed";
		}
	}
}
