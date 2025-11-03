package english;

import java.util.Scanner;

public class Exercise04 {

	public static void main(String[] args) {

		// Set the variables for both payments
		int clientMustPay = 0;
		int clientGivesMe = 0;

		// Set the variable for the rest of the money
		int money = 0;

		// Set a variable for each type of coin
		int coin200 = 0;
		int coin100 = 0;
		int coin50 = 0;
		int coin20 = 0;
		int coin10 = 0;
		int coin5 = 0;
		int coin2 = 0;
		int coin1 = 0;

		// Set up the scanner
		Scanner reader = new Scanner(System.in);

		// Ask the user about the payments
		System.out.println("How much the client must pay?");
		clientMustPay = reader.nextInt();

		System.out.println("How much did the client give you?");
		clientGivesMe = reader.nextInt();

		// Calculate the money.
		money = clientGivesMe - clientMustPay;

		// The money HAS to be >= 0 so we can calculate and do the operations
		if (money >= 0) {
			System.out.println("The client has to pay you " + money + " cents");

			// If the % of money returns the same number as money it means no coin is being
			// used
			if (money % 200 != money) {

				coin200 = money / 200;
				money -= 200 * coin200;
			}
			if (money % 100 != money) {

				coin100 = money / 100;
				money -= 100 * coin100;
			}
			if (money % 50 != money) {

				coin50 = money / 50;
				money -= 50 * coin50;
			}
			if (money % 20 != money) {

				coin20 = money / 20;
				money -= 20 * coin20;
			}
			if (money % 10 != money) {

				coin10 = money / 10;
				money -= 10 * coin10;
			}
			if (money % 5 != money) {

				coin5 = money / 5;
				money -= 5 * coin5;
			}
			if (money % 2 != money) {

				coin2 = money / 2;
				money -= 2 * coin2;
			} else {
				coin1 = money;
			}

		} else {
			System.out.println("The client owes you more money than they gave you.");
		}

		// Show the results
		System.out.println("Coins of 2€: " + coin200);
		System.out.println("Coins of 1€: " + coin100);
		System.out.println("Coins of 50 cents: " + coin50);
		System.out.println("Coins of 20 cents: " + coin20);
		System.out.println("Coins of 10 cents: " + coin10);
		System.out.println("Coins of 5 cents: " + coin5);
		System.out.println("Coins of 2 cents: " + coin2);
		System.out.println("Coins of 1 cents: " + coin1);

		// Close the scanner
		reader.close();

	}

}