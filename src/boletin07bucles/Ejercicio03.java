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

		// Variable para los dos números
		int numA;
		int numB;

		// Creamos el scanner
		Scanner reader = new Scanner(System.in);

		// Le pedimos dos números al usuario
		System.out.println("Introduzca dos números");
		numA = reader.nextInt();
		numB = reader.nextInt();

		// Cerramos el scanner
		reader.close();

	} // Fin de main

} // Fin de clase