package org.ua.yaichenia;

import java.util.Scanner;

public class Controller {

	private Model model;
	private View view;
	private Scanner scanner = new Scanner(System.in);
	
	public Controller(Model model, View view) {
		this.model = model;
		this.view = view;
	}
	
	public void processUser() {
		view.printMessage(view.INPUT_FIRST_STRING);
		model.setFirstString(inputString());
		
		view.printMessage(view.INPUT_SECOND_STRING);
		model.setSecondString(inputString());
		
		try {
			model.checkStrings();
			boolean isAnagram = model.getIsAnagram();
			if(isAnagram)
				view.printMessageIfStringsAreAnagram(model.getFirstString(), model.getSecondString());
			else
				view.printMessageIfStringsAreNotAnagram(model.getFirstString(), model.getSecondString());
		} catch (DifferentStringLengthException e) {
			view.printError(view.WRONG_INPUT);
		} finally {
			scanner.close();
		}
	}
	
	private String inputString() {
		return scanner.nextLine();
	}
}
