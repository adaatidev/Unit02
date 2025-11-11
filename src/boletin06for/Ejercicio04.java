package boletin06for;

import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {

		// Diseñar un programa que muestre la suma de los 10 primeros números impares.

		// Variable para el número
		int numero = 1;

		// Variable para la suma
		int suma = 0;

		// Creamos el scanner
		Scanner reader = new Scanner(System.in);

		for (int cont = 1; cont <= 10; cont++) {
			suma += numero;
			numero += 2;
		}

		// Imprimimos la suma
		System.out.println("Suma de los primeros 10 números impares: " + suma);

		// Cerramos el scanner
		reader.close();

	}// Fin de main

}// Fin de clase