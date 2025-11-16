package boletin06for;

import java.util.Scanner;

public class Ejercicio08 {

	public static void main(String[] args) {

		// Realiza un programa que pida dos números enteros A y B. Luego visualiza los
		// números que hay entre A y B. Si A es menor que B, entonces debe mostrar los
		// números desde A hasta B. Si B es menor que A, entonces debe mostrar los
		// números desde B hasta A.

		// Varaiable para los dos números
		int numA = 0;
		int numB = 0;

		// Variable para la diferencia
		int menor;
		int mayor;

		// Creamos el scanner
		Scanner reader = new Scanner(System.in);

		// Preguntamos al usuario por dos notas
		System.out.println("Introduzca dos números");
		numA = reader.nextInt();
		numB = reader.nextInt();

		// menor = Math.min(numA, numB);
		// mayor = Math.max(numA, numB);

		// Comprobación de qué número es mayor
		if (numA < numB) {
			menor = numA;
			mayor = numB;
		} else {
			menor = numB;
			mayor = numA;
		} // Fin de if

		// Vamos desde el número más pequeño al más grande
		for (int cont = menor; cont <= mayor; cont++) {
			System.out.println(cont);
		} // Fin de for

		// Cerramos el scanner
		reader.close();

	}// Fin de main

}// Fin de clase