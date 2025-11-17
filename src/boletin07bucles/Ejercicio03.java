package boletin07bucles;

import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {

		// Para dos números dados, a y b, es posible calcular el máximo común divisor
		// (el número más grande que divide a ambos) mediante un algoritmo ineficiente
		// pero sencillo: desde el menor de a y b, ir buscando, de forma decreciente
		// (-1), el primer número que divide a ambos simultáneamente. Teniendo en cuenta
		// lo que se acaba de explicar, realiza un programa que calcule el máximo común
		// divisor de dos números.

		// Primer número
		int numA;

		// Segundo número
		int numB;

		// Máximo común divisor
		int mcd = 1;

		// Variable para almacenar el mínimo
		int min;

		// Variable para almacenar los divisores
		int divisor;

		// Creamos el scanner para leer los dos números
		Scanner sc = new Scanner(System.in);

		// Le pedimos dos números al usuario
		System.out.println("Introduzca el primer número");
		numA = sc.nextInt();

		System.out.println("Introduzca el segundo número");
		numB = sc.nextInt();

		// Comprobamos cuál es el más pequeño
		min = Math.min(numA, numB);

		// Iniciamos el divisor a el número más pequeño
		divisor = min;

		// Mientras no lleguemos a 1 y el mcd siga siendo 1, es decir, no hemos
		// encontrado un divisor distinto de 1
		while (divisor >= 1 && mcd == 1) {
			// Comprobamos si i divide a ambos números
			if (numA % divisor == 0 && numB % divisor == 0) {
				// Establecemos el valor para el mcd con el divisor común
				mcd = divisor;
			} // Fin if
			divisor--;
		} // Fin while

		// Mostramos el resultado
		System.out.println("El máximo común divisor de " + numA + " y " + numB + " es " + mcd);

		// Cerramos el scanner
		sc.close();

	} // Fin de main

} // Fin de clase