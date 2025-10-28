package boletin04while;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {

		/*
		 * Escribe un programa que vaya pidiendo al usuario números enteros positivos
		 * que debe ir contando. Cuando el usuario no quiera insertar más números,
		 * introducirá un número negativo y el algoritmo, antes de acabar, mostrará la
		 * cantidad de números positivos introducidos por el usuario.
		 * 
		 */

		// Declaramos las variables para el número y la cantidad.
		int numero = 0;
		int cantidad = 0;

		// Preparamos el scanner.
		Scanner reader = new Scanner(System.in);

		// Pedimos un número.
		System.out.println("Introduzca un número");
		numero = reader.nextInt();

		while (numero >= 0) {
			// Cada vez que se introduzca un número se le suma uno a la cantidad.
			cantidad++;

			// Pedimos un número
			System.out.println("Introduce un número");
			numero = reader.nextInt();
		} // Fin de while

		// Mostramos el resultado
		System.out.println("Cantidad de números introducidos: " + cantidad);

		// Cerramos el scanner.
		reader.close();

	}// Fin de main

}// Fin de clase