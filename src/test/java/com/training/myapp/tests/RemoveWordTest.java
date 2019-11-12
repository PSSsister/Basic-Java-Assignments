package com.training.myapp.tests;

import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;

import com.training.myapp.RemoveWord;

public class RemoveWordTest {

	/**
	 * @Test annotation InOrder to test each Method with different scenario
	 */
	
	@Test
	public void testToRemoveWordByPassingStringAndDeleteWordAndPosition() {
		String s="A morning walk is a is blessing for the whole day.";
		String s2=RemoveWord.removeWordsFromSentence(s, "IS", 6);
		String s3=" A MORNING WALK IS A BLESSING FOR THE WHOLE DAY ";
		assertEquals(s3,s2);
	}
	
	
	@Test
	public void testToRemoveWordByPassingSentenceWithDoubleSpacesAndDeleteWordAndPosition() {
		String s=" AS YOU    SOW, SO   SO YOU REAP.";
		String s2=RemoveWord.removeWordsFromSentence(s, "SO", 4);
		String s3=" AS YOU SOW, SO YOU REAP ";
		assertEquals(s3,s2);
	}
	
	

}
