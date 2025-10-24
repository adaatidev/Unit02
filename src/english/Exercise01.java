package english;

import java.util.Scanner;

public class Exercise01 {

	public static void main(String[] args) {

		/* Write a program to take an order for a new computer. The basic system costs
		 * 375.99. The user then has to choose from a 38 cm screen (costing 75.99) or a
		 * 43 cm screen (costing 99.99). The following extras are optional.
		 */

		// Set the variables for
		int screen;
		double totalPrice = 375.99;
		final double SCREEN_38 = 75.99;
		final double SCREEN_43 = 99.99;
		String answer;

		// Set up the scanner.
		Scanner reader = new Scanner(System.in);

		// Ask the user about what size of screen they want.
		System.out.println("Which screen do you prefer?");
		System.out.println("1. 38cm - 75,99");
		System.out.println("2. 43cm - 99,99");
		screen = reader.nextInt();

		switch (screen) {
		case 1:
			totalPrice += SCREEN_38;
			break;
		case 2:
			totalPrice += SCREEN_43;
			break;
		}
		
		System.out.println("Do you want antivirus software? (Y / N)");
		answer = reader.next();
		
		if (answer.equalsIgnoreCase("Y")) {
			totalPrice += 65.99;
		}
		
		System.out.println("Do you want a printer? (Y / N)");
		answer = reader.next();
		
		if  (answer.equalsIgnoreCase("Y")) {
			totalPrice += 125.00;
		}
		
		System.out.println("Total price = " + totalPrice);
		
		// Close the scanner.
		reader.close();

	}

}