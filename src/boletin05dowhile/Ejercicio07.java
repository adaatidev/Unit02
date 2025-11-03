package boletin05dowhile;

import java.util.Scanner;

public class Ejercicio07 {

	public static void main(String[] args) {

		// Variable para el primer número
		int num1;

		// Variable para el segundo número
		int num2;

		// Variable para la opción del menú
		String respuesta;

		// Variable para la suma
		int suma;

		// Variable para la resta
		int resta;

		// Variable para la multiplicación
		int multiplicacion;

		// Variable para la división
		double division;

		// Creamos el scanner
		Scanner reader = new Scanner(System.in);

		// Pedimos al usuario dos números
		System.out.println("Introduzca dos números");
		num1 = reader.nextInt();
		num2 = reader.nextInt();

		// Mostramos el menú
		System.out.println("¿Qué operación desea realizar?");
		System.out.println("A. SUMAR LOS NÚMEROS");
		System.out.println("B. RESTAR LOS NÚMEROS");
		System.out.println("C. MULTIPLICAR LOS NÚMEROS");
		System.out.println("D. DIVIDIR LOS NÚMEROS");
		System.out.println("E. SALIR");
		respuesta = reader.next();

		do {
			if (respuesta.equals("A")) {
				suma = num1 + num2;
				System.out.println(num1 + "+" + num2 + "=" + suma);
			} else if (respuesta.equals("B")) {
				resta = num1 - num2;
				System.out.println(num1 + "-" + num2 + "=" + resta);
			} else if (respuesta.equals("C")) {
				multiplicacion = num1 * num2;
				System.out.println(num1 + "*" + num2 + "=" + multiplicacion);
			} else if (respuesta.equals("D") && num2 != 0) {
				division = num1 / num2;
				System.out.println(num1 + "/" + num2 + "=" + division);
			} else if (respuesta.equals("D") && num2 == 0) {
				System.out.println("Error, no se puede dividir");
			} else {
				System.out.println(" ");
			}

			System.out.println("E. SALIR");
			respuesta = reader.next();

		} while (respuesta.equals("E"));

		// Cerramos el scanner
		reader.close();

	}// Fin de main

}// Fin de clase