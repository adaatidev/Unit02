package boletin06for;

import java.util.Scanner;

public class Ejercicio07 {

	public static void main(String[] args) {

		// Realiza un programa en java que pida un número entero positivo y nos diga si
		// es primo o no.

		// Variable para el número
		int num = 0;

		// Boolean
		boolean esPrimo = true;

		// Creamos el scanner
		Scanner reader = new Scanner(System.in);

		// Le preguntamos un número al usuario
		System.out.println("Introduzca un número entero positivo");
		num = reader.nextInt();

		if (num > 0) {
			// Si es positivo entonces hacemos el estudio de si es primo
			if (num == 1) {
				esPrimo = false;
			} else {
				// Si es distinto de 1
				for (int cont = 2; cont < num; cont++) {
					if (num % cont == 0) {
						esPrimo = false;
						break;
					}
				}
			}
			
		} else {
			System.out.println("El valor introducido no es válido.");
		}

		// Imprimimos la solución
		System.out.println("¿El número introducido es primo?");
		if (esPrimo) {
			System.out.println("Sí");
		} else {
			System.out.println("No");
		}

		// Cerramos el scanner
		reader.close();

	}// Fin de main

}// Fin de clase