package boletin04while;

import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {

		/*
		 * Implementar una aplicación para calcular datos estadísticos de las edades de
		 * los alumnos de un centro educativo. Se introducirán datos hasta que uno de
		 * ellos sea negativo, y se mostrará: la suma de todas las edades introducidas,
		 * la media, el número de alumnos y cuántos son mayores de edad.
		 * 
		 */

		// Declaramos las variables para las edades, la suma y la cantidad.
		int edad;
		int suma = 0;
		int cantidadTodos = 0;
		int cantidadMayores = 0;
		double media;

		// Preparamos el scanner.
		Scanner reader = new Scanner(System.in);

		// Pedimos una edad
		System.out.println("Introduzca la edad del alumno");
		edad = reader.nextInt();

		while (edad >= 0) {
			// Vamos sumando las edades.
			suma += edad;
			// Cada vez que se introduzca una edad se suma 1 a la cantidad de alumnos.
			cantidadTodos++;
			// Si es mayor de edad se le suma 1 a la cantidad de alumnos mayores de edad.
			if (edad >= 18) {
				cantidadMayores++;
			} // Fin if
		} // Fin while

		// Calculamos la media
		media = suma / cantidadTodos;

		// Mostramos el resultado
		System.out.println("Suma de todas las edades: " + suma);
		System.out.println("Media de las edades: " + media);
		System.out.println("Cantidad total de alumnos: " + cantidadTodos);
		System.out.println("Cantidad de alumnos mayores de edad: " + cantidadMayores);

		// Cerramos el scanner.
		reader.close();

	}// Fin main

} // Fin clase