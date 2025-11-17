package boletin07bucles;

import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {

		// De forma similar a la actividad 3, realiza un programa que calcule el mínimo
		// común múltiplo de dos números dados. En este caso, habrá que partir del
		// máximo de los dos e ir incrementando hasta encontrar el primer número que sea
		// múltiplo de los dos números.

		// Variable para el primer número
		int numA;

		// Variable para el primer número
		int numB;

		// Variable para el número mayor de los dos
		int max;

		// Creamos el scanner
		Scanner sc = new Scanner(System.in);

		// Le pedimos dos números al usuario
		System.out.println("Introduzca dos números");
		numA = sc.nextInt();
		numB = sc.nextInt();

		// Comprobamos el mayor de los dos
		max = Math.max(numA, numB);
		
		

		// Cerramos el scanner
		sc.close();

	} // Fin de main

} // Fin de clase