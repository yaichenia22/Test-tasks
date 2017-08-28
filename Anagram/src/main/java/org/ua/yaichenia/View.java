package org.ua.yaichenia;

public class View {

	public final String INPUT_FIRST_STRING = "Please, input first string:";
	public final String INPUT_SECOND_STRING = "Now input second string:";
	public final String WRONG_INPUT = "Wrong input! Strings should not have different length!";
	
	public void printMessage(String message) {
		System.out.println(message);
	}
	
	public void printError(String errorMessage) {
		System.err.println(errorMessage);
	}
	
	public void printMessageIfStringsAreAnagram(String firstString, String secondString) {
		System.out.println("Strings \"" + firstString + "\" and \"" + secondString + "\" are anagram of each other.");
	}
	
	public void printMessageIfStringsAreNotAnagram(String firstString, String secondString) {
		System.out.println("Strings \"" + firstString + "\" and \"" + secondString + "\" are not anagram of each other.");
	}
}
