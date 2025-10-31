package english;

import java.util.Scanner;

public class Exercise01 {

	public static void main(String[] args) {

		/*
		 * Write a program to take an order for a new computer. The basic system costs
		 * 375.99. The user then has to choose from a 38 cm screen (costing 75.99) or a
		 * 43 cm screen (costing 99.99). The following extras are optional.
		 */

		// Set the variables for the screen and the price
		int screen;
		double totalPrice = 375.99;

		// Set the constant for the prices of each type of screen
		final double SCREEN_38 = 75.99;
		final double SCREEN_43 = 99.99;

		// Set the variable for the user's answer
		String answer;

		// Set up the scanner.
		Scanner reader = new Scanner(System.in);

		// Ask the user about what size of screen they want
		System.out.println("Which screen do you prefer?");
		System.out.println("1. 38cm - 75,99");
		System.out.println("2. 43cm - 99,99");
		screen = reader.nextInt();

		// Set the condition, if they want the screen 1 the price will increase in
		// +75,99 if they want the screen 2 the price will increase in +99,99
		switch (screen) {
		case 1:
			totalPrice += SCREEN_38;
			break;
		case 2:
			totalPrice += SCREEN_43;
			break;
		}

		// Ask the user if they want an antivirus software
		System.out.println("Do you want antivirus software? (Y / N)");
		answer = reader.next();

		// If they want it, the total price will increase
		if (answer.equalsIgnoreCase("Y")) {
			totalPrice += 65.99;
		}

		// Ask the user if they want a printer
		System.out.println("Do you want a printer? (Y / N)");
		answer = reader.next();

		// If they want it, the total price will increase
		if (answer.equalsIgnoreCase("Y")) {
			totalPrice += 125.00;
		}

		// Show the total price
		System.out.println("Total price = " + totalPrice);

		// Close the scanner.
		reader.close();

	}

}