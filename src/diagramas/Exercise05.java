package diagramas;

import java.util.Scanner;

public class Exercise05 {

	public static void main(String[] args) {

		// Set the variable.
		int num;

		// Set up the scanner.
		Scanner reader = new Scanner(System.in);

		// Ask the question and read the variable.
		System.out.println("Introduzca un número: ");
		num = reader.nextInt();

		// Set the conditional.
		if (num <= 0) {
			System.out.println("Número negativo.");
		} else {
			System.out.println("Número positivo.");
		}

		//Close the scanner.
		reader.close();
	}

}