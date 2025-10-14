package diagramas;

import java.util.Scanner;

public class Exercise02 {

	public static void main(String[] args) {

		// Set the variable.
		int age;

		// Set up the scanner.
		Scanner reader = new Scanner(System.in);

		// Ask the question and read the variable.
		System.out.println("Introduzca su edad: ");
		age = reader.nextInt();

		// Set the conditional.
		if (age >= 18) {
			System.out.println("Eres mayor de edad.");
		} else {
			System.out.println("Eres menor de edad.");
		}

		// Close the scanner.
		reader.close();

	}

}