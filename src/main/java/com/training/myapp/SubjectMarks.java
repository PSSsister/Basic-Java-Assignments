package com.training.myapp;

public class SubjectMarks {

	public static String subjectMarks(int sub1Marks,int sub2Marks,int sub3Marks)
	{
		if(sub1Marks>60 && sub2Marks>60 && sub3Marks>60)
		{
			return  "Passed";
		}
		else if(sub1Marks>60 && sub2Marks>60 ||sub2Marks>60 && sub3Marks>60 && sub1Marks>60 && sub3Marks>60)
		{
			return  "Promoted";
		}
		else
		{
			return  "failed";
		}
	}
}
