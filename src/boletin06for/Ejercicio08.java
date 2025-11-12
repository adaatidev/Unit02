package boletin06for;

import java.util.Scanner;

public class Ejercicio08 {

	public static void main(String[] args) {

		// Realiza un programa que pida dos números enteros A y B. Luego visualiza los
		// números que hay entre A y B. Si A es menor que B, entonces debe mostrar los
		// números desde A hasta B. Si B es menor que A, entonces debe mostrar los
		// números desde B hasta A.

		// Varaiable para los dos números
		int numeroA = 0;
		int numeroB = 0;

		// Variable para la diferencia
		int resta = 0;

		// Creamos el scanner
		Scanner reader = new Scanner(System.in);

		// Preguntamos al usuario por dos notas
		System.out.println("Introduzca dos números");
		numeroA = reader.nextInt();
		numeroB = reader.nextInt();

		if (numeroA < numeroB) {
			resta = numeroB - numeroA;
			for (int cont = 0; cont <= resta; cont++) {
				System.out.println("Números desde A hasta B: " + numeroA);
				numeroA++;
			}// Fin de for
		} else {
			resta = numeroA - numeroB;
			for (int cont = 0; cont <= resta; cont++) {
				System.out.println("Números desde B hasta A: " + numeroB);
				numeroB++;
			}// Fin de for
		}// Fin de if
		
		// Cerramos el scanner
		reader.close();

	}// Fin de main

}// Fin de clase