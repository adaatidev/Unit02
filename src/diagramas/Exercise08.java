package diagramas;

import java.util.Scanner;

public class Exercise08 {

	public static void main(String[] args) {
		
		//Set the variables.
		int num1;
		int num2;
		int num3;
		
		//Set up the scanner.
		Scanner reader = new Scanner (System.in);
		
		//Ask the questions and read the answers (variables).
		System.out.println("Introduzca un primer número: ");
		num1 = reader.nextInt();
		
		System.out.println("Introduzca un segundo número: ");
		num2 = reader.nextInt();
		
		System.out.println("Introduzca un tercer número: ");
		num3 = reader.nextInt();
		
		//Set the conditional.
		if (num1 < num2) {
		
		}
		
		//Close the scanner.
		reader.close();

	}

}