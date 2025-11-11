package boletin06for;

import java.util.Scanner;

public class Ejercicio06 {

	public static void main(String[] args) {

		// Pedir 5 calificaciones de alumnos y decir al final si hay algún suspenso.

		// Variable para las notas
		int nota;

		// Variable para el contador de suspensos
		int suspensos = 0;

		// Creamos el scanner
		Scanner reader = new Scanner(System.in);

		for (int cont = 1; cont <= 5; cont++) {
			System.out.println("Introduzca una nota");
			nota = reader.nextInt();
			if (nota <= 4 && nota >= 0) {
				suspensos++;
			} // Fin de if
		} // Fin de for

		// Imprimimos los suspensos
		if (suspensos == 0) {
			System.out.println("No hay suspensos");
		} else {
			System.out.println("Hay " + suspensos + " suspensos.");
		}

		// Cerramos el scanner
		reader.close();

	} // Fin de main

}// Fin de clase