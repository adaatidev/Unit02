package boletin04while;

import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {

		/*
		 * Escribe un programa que vaya pidiendo al usuario números enteros positivos
		 * que debe ir sumando. Cuando el usuario no quiera insertar más números,
		 * introducirá un número negativo y el algoritmo, antes de acabar, mostrará la
		 * media de los números positivos introducidos por el usuario.
		 * 
		 */

		// Declaramos las variables para el número, la cantidad y la suma.
		int numero = 0;
		int cantidad = 0;
		int suma = 0;
		double media = 0;

		// Preparamos el scanner.
		Scanner reader = new Scanner(System.in);

		// Pedimos un número
		System.out.println("Introduzca un número");
		numero = reader.nextInt();

		while (numero >= 0) {
			// Cada vez que se introduzca un número se le suma uno a la cantidad
			cantidad++;

			// Vamos sumando los números introducidos
			suma += numero;

			// Pedimos un número
			System.out.println("Introduzca un número");
			numero = reader.nextInt();
		} // Fin while

		// Calculamos la media
		media = suma / cantidad;

		// Mostramos el resultado
		System.out.println("La media de los números introducidos es: " + media);

		// Cerramos el scanner.
		reader.close();

	} // Fin main

} // Fin clase