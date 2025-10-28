package boletin03condicionales;

import java.util.Scanner;

public class Ejercicio06 {

	public static void main(String[] args) {

		/*
		 * Pedir al usuario el número de un mes y el año (comprobando si es o no
		 * bisiesto). Debe imprimir por pantalla el número de días que tiene el mes.
		 */

		/*
		 * PRUEBA Mes a introducir: 2 Año a introducir: 2024 Respuesta esperada: El año
		 * no es bisiesto. El mes tiene 28 días Respuesta obtenida: El año no es
		 * bisiesto. El mes tiene 28 días
		 */

		// Declaramos las variables para el mes, el año y para saber si es bisiesto.
		int mes = 0;
		int ano = 0;
		boolean bisiesto;

		// Preparamos el scanner.
		Scanner reader = new Scanner(System.in);

		// Le preguntamos al usuario sobre un mes y un año.
		System.out.println("Introduzca un número de mes: ");
		mes = reader.nextInt();

		System.out.println("Introduzca un año: ");
		ano = reader.nextInt();

		// Calculamos si el año es bisiesto o no. Si al dividirlo entre 4 el resultado
		// es entero es bisiesto, sino no.
		bisiesto = ano % 4 == 0;

		// Declaramos el condicional, si el año es bisiesto y el mes es 2 escribe que es
		// bisiesto y que tiene 29 días. Si no es bisiesto y el mes es 2 escribe que no
		// es bisiesto y que tiene 28 días. Si solo es bisiesto lo escribe y si no lo es
		// dice que no es bisiesto.
		if (bisiesto && mes == 2) {
			System.out.println("El año es bisiesto.");
			System.out.println("El mes tiene 29 días");
		} else if (!bisiesto && mes == 2) {
			System.out.println("El año no es bisiesto.");
			System.out.println("El mes tiene 28 días");
		} else if (bisiesto) {
			System.out.println("El año es bisiesto.");
		} else {
			System.out.println("El año no es bisiesto.");
		}

		// Declaramos el condicional, si el mes es 1, 3, 5, 7, 8, 10 o 12 tiene 31 días,
		// si no tiene 30.
		switch (mes) {
		case 1, 3, 5, 7, 8, 10, 12 -> {
			System.out.println("El mes tiene 31 días");
		}
		case 4, 6, 9, 11 -> {
			System.out.println("El mes tiene 30 días");
		}
		case 2 -> {
			System.out.println("");
		}
		default -> {
			System.out.println("Error, el mes es incorrecto");
		}
		}

		// Cerramos el scanner.
		reader.close();

	}

}