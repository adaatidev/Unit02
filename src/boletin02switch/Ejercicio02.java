package boletin02switch;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {

		// Declaramos la variable para el día de la semana.
		int dia;

		// Preparamos el scanner.
		Scanner reader = new Scanner(System.in);

		// Preguntamos al usuario sobre el día.
		System.out.println("¿Qué día de la semana es en números?");
		dia = reader.nextInt();

		// Declaramos la condicional.
		switch (dia) {
		// Si el número introducido es 1 monstrará que es lunes.
		case 1 -> System.out.println("Hoy es lunes.");
		// Si el número introducido es 2 monstrará que es martes.
		case 2 -> System.out.println("Hoy es martes.");
		// Si el número introducido es 3 monstrará que es miércoles.
		case 3 -> System.out.println("Hoy es miércoles.");
		// Si el número introducido es 4 monstrará que es jueves.
		case 4 -> System.out.println("Hoy es jueves.");
		// Si el número introducido es 5 monstrará que es viernes.
		case 5 -> System.out.println("Hoy es viernes.");
		// Si el número introducido es 6 monstrará que es sábado.
		case 6 -> System.out.println("Hoy es sábado.");
		// Si el número introducido es 7 monstrará que es domingo.
		case 7 -> System.out.println("Hoy es domingo.");
		// Si el número introducido no está entre el 1 y el 7 mostrará el siguiente
		// mensaje.
		default -> System.out.println("El valor debe estar comprendido entre el 1 y el 7.");
		}

		// Cerramos el scanner.
		reader.close();

	}

}