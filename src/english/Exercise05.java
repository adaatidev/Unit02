package english;

import java.util.Scanner;

public class Exercise05 {

	public static void main(String[] args) {

		// Set the variables for velocity, displacement and time
		double velocity = 0;
		double displacement = 0;
		double time = 0;

		// Set the variables for the two types of data
		char type1;
		char type2;

		// Set up the scanner
		Scanner reader = new Scanner(System.in);

		// Ask the user about the type of data
		System.out.println("Give me one type of data:");
		type1 = reader.next().toUpperCase().charAt(0);

		// Depending on the letter it will read the answer for velocity, displacement or
		// time
		if (type1 == 'V') {
			System.out.println("Give the value for that data:");
			velocity = reader.nextDouble();
		} else if (type1 == 'D') {
			System.out.println("Give the value for that data:");
			displacement = reader.nextDouble();
		} else {
			System.out.println("Give the value for that data:");
			time = reader.nextDouble();
		}

		// Ask the user about the type of data
		System.out.println("Give me one type of data:");
		type2 = reader.next().toUpperCase().charAt(0);

		// Depending on the letter it will read the answer for velocity, displacement or
		// time
		if (type2 == 'V') {
			System.out.println("Give the value for that data:");
			velocity = reader.nextDouble();
		} else if (type2 == 'D') {
			System.out.println("Give the value for that data:");
			displacement = reader.nextDouble();
		} else {
			System.out.println("Give the value for that data:");
			time = reader.nextDouble();
		}

		// If the types of data aren't the same, it will start comparing the answers and
		// doing the calcules to get the right answer
		if (type1 != type2) {
			if ((type1 == 'V' || type1 == 'D') && (type2 == 'V' || type2 == 'D')) {
				time = displacement / velocity;
				System.out.println("Result: " + time);
			} else if ((type1 == 'V' || type1 == 'T') && (type2 == 'V' || type2 == 'T')) {
				displacement = time * velocity;
				System.out.println("Result: " + displacement);
			} else {
				velocity = displacement / time;
				System.out.println("Result: " + velocity);
			}
		} else {
			System.out.println("You cant enter the same type of data");
		}

		// Close the scanner
		reader.close();

	}

}