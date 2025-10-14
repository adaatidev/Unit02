package diagramas;

import java.util.Scanner;

public class Exercise03 {

	public static void main(String[] args) {

		// Set the variables.
		int num1;
		int num2;

		int suma;
		int resta;
		int mult;
		double div;

		// Set up the scanner.
		Scanner reader = new Scanner(System.in);

		// Ask the questions and the scanner reads the variables.
		System.out.println("Introduzca un primer número: ");
		num1 = reader.nextInt();

		System.out.println("Introduzca un segundo número: ");
		num2 = reader.nextInt();

		// Calculate the variables.
		suma = num1 + num2;
		resta = num1 - num2;
		mult = num1 * num2;
		div = (double) num1 / num2;

		// Set the variable.
		if (num1 == 0 || num2 == 0) {
			System.out.println("División de ambos números: error");
		} else {
			System.out.println("División de ambos números: " + div);
		}

		// Answer.
		System.out.println("Suma de ambos números: " + suma);
		System.out.println("Resta de ambos números: " + resta);
		System.out.println("Multiplicación de ambos números: " + mult);
		
		// Close the scanner.
		reader.close();

	}

}