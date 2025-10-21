package boletin03condicionales;

import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {

		/*
		 * Escribe una aplicación que solicite al usuario un número comprendido entre 0
		 * y 9999. La aplicación tendrá que indicar si el número introducido es capicúa.
		 * Un número es capicúa si se lee igual de izquierda a derecha que de derecha a
		 * izquierda.
		 */

		// Declaramos la variable en la que se almacena el número que introduce el
		// usuario.
		int numero;

		// Declaramos las variables para las operaciones que vamos a realizar para
		// comparar los números.
		int primerNumero;
		int segundoNumero;
		int tercerNumero;
		int ultimoNumero;
		
		// Preparamos el scanner.
		Scanner reader = new Scanner(System.in);

		// Le preguntamos al usuario por un número comprendido entre 0 y 9999.
		System.out.println("Introduzca un número comprendido entre 0 y 9999: ");
		numero = reader.nextInt();

		if (numero > 0 && numero < 10) {
			System.out.println("Es un único número.");
		} else if (numero < 100 && numero > 9) {
			primerNumero = numero / 10;
			ultimoNumero = numero % 10;
			if (primerNumero == ultimoNumero) {
				System.out.println("Número capicúa.");
			} else {
				System.out.println("El número no es capicúa.");
			}
		} else if (numero < 1000 && numero > 99) {
			primerNumero = numero / 100;
			ultimoNumero = numero % 10;
			if (primerNumero == ultimoNumero) {
				System.out.println("Número capicúa.");
			} else {
				System.out.println("El número no es capicúa.");
			}
		} else if (numero >= 1000 && numero <= 9999) {
			primerNumero = numero / 1000;
			segundoNumero = (numero / 100) % 10;
			tercerNumero = (numero / 10) % 10;
			ultimoNumero = numero % 10;
			if (primerNumero == ultimoNumero && segundoNumero == tercerNumero) {
				System.out.println("El número es capicúa.");
			} else {
				System.out.println("El número no es capicúa.");
			}
		} else {
			System.out.println("Introduzca un número entre 0 y 9999.");
		}

		// Cerramos el scanner.
		reader.close();

	}

}