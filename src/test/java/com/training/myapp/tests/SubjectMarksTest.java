package com.training.myapp.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import com.training.myapp.SubjectMarks;

public class SubjectMarksTest {

	/**
	 * @Test annotation InOrder to test each Method with different scenario
	 */
	
	
	@Test
	public void testSubjectMarksResultWithAllMarksAboveSixty() {
		assertEquals("Passed",SubjectMarks.subjectMarks(65, 67, 65));
	}

	@Test
	public void testSubjectMarksResultWithTwoSubMarksGreaterThanSixty() {
		assertEquals("Promoted",SubjectMarks.subjectMarks(65, 67, 55));
	}
	
	@Test
	public void testSubjectMarksResultWithOneSubMarksGreaterThanSixty() {
		assertEquals("failed",SubjectMarks.subjectMarks(65, 56, 55));
	}

	@Test
	public void testSubjectMarksResultWithSubMarksLessThanSixty(){
		assertEquals("failed",SubjectMarks.subjectMarks(55, 56, 55));
	}
}
