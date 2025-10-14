package diagramas;

import java.util.Scanner;

public class Exercise06 {

	public static void main(String[] args) {
		
		//Set the variables.
		int num1;
		int num2;
		
		//Set up the scanner.
		Scanner reader = new Scanner (System.in);
		
		//Ask the question and read the variables.
		System.out.println("Introduzca un primer número: ");
		num1 = reader.nextInt();
		
		System.out.println("Introduzca un segundo número: ");
		num2 = reader.nextInt();
		
		//Calculate the variable.
		if (num1 > num2) {
			System.out.println("Números ordenador de forma ascendente: " + num2 + "," + num1);
		} else {
			System.out.println("Números ordenador de forma ascendente: " + num1 + "," + num2);
		}
		
		//Close the scanner.
		reader.close();
		
	}

}
