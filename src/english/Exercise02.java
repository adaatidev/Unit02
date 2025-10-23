package english;

import java.util.Scanner;

public class Exercise02 {

	public static void main(String[] args) {

		// Set the variable for the user's money.
		double money;
		String type;
		double moneyB;
		double moneyX;
		double moneyAC;

		// Set up the scanner.
		Scanner reader = new Scanner(System.in);

		// Ask the user about the amount of money in their bank account.
		System.out.println("How much money do you have in your bank account?");
		money = reader.nextDouble();

		// Ask them what type of back account they have.
		System.out.println("What type of bank account do you have?");
		System.out.println("A");
		System.out.println("B");
		System.out.println("C");
		System.out.println("X");
		type = reader.next();

		// Set the conditional, depending on the type of bank account they have it must
		// be increased.
		switch (type) {
		case "B" -> {
			moneyB = (money * 2 / 100) - money * -1;
			System.out.println("Money: " + moneyB);
		}
		case "X" -> {
			moneyX = (money * 5 / 100) - money * -1;
			System.out.println("Money: " + moneyX);
		}
		default -> {
			moneyAC = (money * 1.5 / 100) - money * -1;
			System.out.println("Money: " + moneyAC);
		}
		}

		// Close the scanner.
		reader.close();

	}

}