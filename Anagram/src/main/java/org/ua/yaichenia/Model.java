package org.ua.yaichenia;

import java.util.Arrays;

public class Model {

	private String firstString;
	private String secondString;
	private boolean isAnagram;
	
	public void setFirstString(String firstString) {
		this.firstString = firstString;
	}
	
	public String getFirstString() {
		return firstString;
	}
	
	public void setSecondString(String secondString) {
		this.secondString = secondString;
	}
	
	public String getSecondString() {
		return secondString;
	}
	
	public boolean getIsAnagram() {
		return isAnagram;
	}
	
	public void checkStrings() throws DifferentStringLengthException {
		String copyOfFirstStringWithoutSpaces = firstString.replaceAll("\\s", "");
		String copyOfSecondStringWithoutSpaces = secondString.replaceAll("\\s", "");
		if (copyOfFirstStringWithoutSpaces.length() == copyOfSecondStringWithoutSpaces.length()) {
			char[] firstStringAsChar = copyOfFirstStringWithoutSpaces.toLowerCase().toCharArray();
			char[] secondStringAsChar = copyOfSecondStringWithoutSpaces.toLowerCase().toCharArray();
			Arrays.sort(firstStringAsChar);
			Arrays.sort(secondStringAsChar);
			isAnagram = Arrays.equals(firstStringAsChar, secondStringAsChar);
		}
		else
			throw new DifferentStringLengthException();
	}
}
