package boletin06for;

import java.util.Scanner;

public class Ejercicio07 {

	public static void main(String[] args) {

		// Realiza un programa en java que pida un número entero positivo y nos diga si
		// es primo o no.

		// Variable para el número
		int numero = 0;

		// Boolean
		boolean esPrimo = true;

		// Creamos el scanner
		Scanner reader = new Scanner(System.in);

		// Le preguntamos un número al usuario
		System.out.println("Introduzca un número");
		numero = reader.nextInt();

		// Condicional, si el número es 1 no es primo, luego false
		if (numero == 1) {
			esPrimo = false;
		}

		for (int cont = 2; cont < numero; cont++) {
			if (numero % cont == 0) {
				esPrimo = false;
			}
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