package org.ua.yaichenia;

import static org.junit.Assert.*;

import org.junit.*;

public class TestModel {
	
	private static Model model;
	private String[][] testAnagrams = {{"William Shakespeare", "I am a weakish speller"},
							   {"Madam Curie", "Radium came"},
							   {"silent", "listen"},
							   {"Anagrams", "Ars magna"},
							   {"elvis", "lives"}};

	private String[][] testNotAnagrams = {{"I like Java", "I do not lie"},
								  {"a first string", " second string"},
								  {"ABCD", "EFGH"},
								  {"my program", "isnt yours"},
								  {"Blah blah blah", "..."}};
	
	@BeforeClass
	public static void initModel() {
		model = new Model();
	}
	
	@Test
	public void testCheckStrings() throws DifferentStringLengthException {
		for(int i = 0; i < testAnagrams.length; i++) {
			model.setFirstString(testAnagrams[i][0]);
			model.setSecondString(testAnagrams[i][1]);
			model.checkStrings();
			assertTrue(model.getIsAnagram());
		}
		
		for(int i = 0; i < testNotAnagrams.length; i++) {
			model.setFirstString(testNotAnagrams[i][0]);
			model.setSecondString(testNotAnagrams[i][1]);
			model.checkStrings();
			assertFalse(model.getIsAnagram());
		}
	}
	
	@Test(expected = DifferentStringLengthException.class)
	public void testCheckStringOnException() throws DifferentStringLengthException {
		model.setFirstString("This string has 22 symbols");
		model.setSecondString("And this has just 16");
		model.checkStrings();
	}
}
