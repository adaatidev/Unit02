package boletin04while;

import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {

		/*
		 * Escribe un algoritmo que pida al usuario 10 números enteros (pueden ser
		 * positivos, negativos o cero). Cuando acabe de insertar los números, el
		 * algoritmo debe mostrar la suma de los números positivos, la media de los
		 * números negativos y el número de ceros que ha introducido el usuario.
		 * 
		 */

		// Declaramos las variables para un número, un contador de números, la suma de
		// positivos, la suma de negativos, el contador de negativos y el contador de
		// ceros.
		int numero;
		int contador = 0;
		int sumaPositivos = 0;
		int sumaNegativos = 0;
		int contadorNegativos = 0;
		int mediaNegativos = 0;
		int contadorCeros = 0;

		// Preparamos el scanner.
		Scanner reader = new Scanner(System.in);

		while (contador < 10) {
			// Pedimos un número.
			System.out.println("Introduzca un número");
			numero = reader.nextInt();
			// Sumamos al contador
			contador++;
			// Si el numero es mayor que cero se suman los números positivos
			if (numero > 0) {
				sumaPositivos += numero;
				// Si el numero es menor que cero se suman los números negativos y se le suma
				// uno a su contador
			} else if (numero < 0) {
				sumaNegativos += numero;
				contadorNegativos++;
				// Si no es ninguno de los casos anteriores, es cero, se le suma uno a su
				// contador
			} else {
				contadorCeros++;
			} // Fin if
		} // Fin while

		// Calculamos la media
		mediaNegativos = sumaNegativos / contadorNegativos;

		// Mostramos el resultado
		System.out.println("Suma de todos los positivos: " + sumaPositivos);
		System.out.println("Media de números negativos: " + mediaNegativos);
		System.out.println("Contador de ceros: " + contadorCeros);

		// Cerramos el scanner.
		reader.close();

	}// Fin main

}// Fin clase