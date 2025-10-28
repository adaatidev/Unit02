package boletin04while;

import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {

		/*
		 * Escribe un programa que vaya pidiendo al usuario números enteros positivos
		 * que debe ir sumando. Cuando el usuario no quiera insertar más números,
		 * introducirá un número negativo y el algoritmo, antes de acabar, mostrará la
		 * suma de los números positivos introducidos por el usuario.
		 * 
		 */

		// Declaramos las variables para el número y la suma.
		int numero = 0;
		int suma = 0;

		// Preparamos el scanner.
		Scanner reader = new Scanner(System.in);

		// Pedimos un númerp
		System.out.println("Introduce un número");
		numero = reader.nextInt();

		while (numero >= 0) {
			// Añadimos el valor de número a suma
			suma += numero;

			// Pedimos un número
			System.out.println("Introduce un número");
			numero = reader.nextInt();
		} // Fin de while

		// Mostramos el resultado
		System.out.println("La suma es: " + suma);

		// Cerramos el scanner.
		reader.close();

	} // Fin main

}// Fin clase