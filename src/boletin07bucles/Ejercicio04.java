package boletin07bucles;

import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {

		// De forma similar a la actividad 3, realiza un programa que calcule el mínimo
		// común múltiplo de dos números dados. En este caso, habrá que partir del
		// máximo de los dos e ir incrementando hasta encontrar el primer número que sea
		// múltiplo de los dos números.

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