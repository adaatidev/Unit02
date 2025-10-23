package english;

import java.util.Scanner;

public class Exercise01 {

	public static void main(String[] args) {

		/*
		 * Write a program to take an order for a new computer. The basic system costs
		 * 375.99. The user then has to choose from a 38 cm screen (costing 75.99) or a
		 * 43 cm screen (costing 99.99). The following extras are optional.
		 * 
		 */

		// Set the variables for
		int screen;
		double totalPrice = 0;
		int extra;

		// Set up the scanner.
		Scanner reader = new Scanner(System.in);

		// Ask the user about what size of screen they want.
		System.out.println("Do you want a 38cm screen or a 43cm screen?");
		screen = reader.nextInt();

		// Set the conditional, if they chose the 38cm screen the price will increase
		// 75.99, if they chose the 43cm screen the price will increase 99.99
		if (screen == 38) {
			totalPrice = (double) (375.99 + 75.99);
		} else if (screen == 43) {
			totalPrice = (double) (375.99 + 99.99);
		} else {
			System.out.println("You must chose between a 38cm screen and a 43cm screen.");
		}

		// Ask the user if they want any extras.
		System.out.println("Do you want any of these extras?");
		System.out.println("1. Antivirus Software");
		System.out.println("2. Printer");
		System.out.println("3. Nothing");
		extra = reader.nextInt();

		// Set another conditional, if the user wants extras the price will increase.
		switch (extra) {
		case 1 -> {
			totalPrice = totalPrice + 65.99;
			System.out.println("Total price: " + totalPrice);
		}
		case 2 -> {
			totalPrice = totalPrice + 125.00;
			System.out.println("Total price: " + totalPrice);
		}
		default -> {
			System.out.println("Total price: " + totalPrice);
		}
		}

		// Close the scanner.
		reader.close();

	}

}
