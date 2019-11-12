package com.training.myapp.tests;

import static org.junit.Assert.*;

import java.util.HashMap;

import org.junit.Test;

import com.training.myapp.PallindromeString;

public class PallindromeStringTest {
	/**
	 * @Test annotation InOrder to test each Method with different scenario
	 */

	@Test
	public void testTheStringArrayToCheckWhetherStringIsPallindromeAndArrangeCharsInDescOrderAndCountTheNumberOfCharacters() {
		
		HashMap<String,Integer> hmapActual=PallindromeString.CountCharactersOfPallindrome(PallindromeString.str);
		HashMap<String,Integer> hmapExpected=new HashMap<>();
		hmapExpected.put("MMDAA",5);
		hmapExpected.put("BBAA",4);
		hmapExpected.put("CCBBBBAA",8);
		hmapExpected.put("FDDCC",5);
		hmapExpected.put("HHGG",4);
		assertEquals(hmapExpected,hmapActual);
	}

	@Test
	public void testTheStringArrayWhereStringIsNotPallindrome() {
		String[] str= {"MEN","PAPER","AID","PEN","APPLE","CIDCO","PENCIL","ERASER","GATE","PENPENCIL"};
		HashMap<String,Integer> hmapActual=PallindromeString.CountCharactersOfPallindrome(str);
		HashMap<String,Integer> hmapExpected=new HashMap<>();
		assertEquals(hmapExpected,hmapActual);
	}
}
