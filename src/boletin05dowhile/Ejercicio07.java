package boletin05dowhile;

import java.util.Scanner;

public class Ejercicio07 {

	public static void main(String[] args) {

		// Variable para el primer número
		double num1;

		// Variable para el segundo número
		double num2;

		// Variable para la opción del menú
		String opcion;

		// Variable para almacenar el resultado
		double resultado;

		// Creamos el scanner
		Scanner reader = new Scanner(System.in);

		// Mostramos el menú
		System.out.println("¿Qué operación desea realizar?");
		System.out.println("A. SUMAR LOS NÚMEROS");
		System.out.println("B. RESTAR LOS NÚMEROS");
		System.out.println("C. MULTIPLICAR LOS NÚMEROS");
		System.out.println("D. DIVIDIR LOS NÚMEROS");
		System.out.println("E. SALIR");
		opcion = reader.next().toUpperCase();

		// Pedimos al usuario dos números
		System.out.println("Introduzca el primer número");
		num1 = reader.nextDouble();

		System.out.println("Introduzca el segundo número");
		num2 = reader.nextDouble();

		do {
			switch (opcion) {
			case "A" -> resultado = num1 + num2;
			case "B" -> resultado = num1 - num2;
			case "C" -> resultado = num1 * num2;
			case "D" -> {
				if (num2 != 0) {
					resultado = num1 / num2;
				} else {
					System.out.println("No se puede dividir por 0");
				} // Fin de if
			} // Fin de case
			case "E" -> System.out.println("Saliendo...");
			default -> System.out.println("Opción errónea");
			}
		} while (!opcion.equals("E"));

		// Cerramos el scanner
		reader.close();

	}// Fin de main

}
// Fin de clase