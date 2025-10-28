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
		
		/*
		 * PRUEBA
		 * Número que voy a introducir: 888
		 * Respuesta esperada: Número capicúa
		 * Respuesta obtenida: Número capicúa
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

		// Si el número introducido por el usuario es mayor a 0 y menor que 10 no hace
		// falta poner si es capicúa o no porque es un único número.
		if (numero > 0 && numero < 10) {
			System.out.println("Es un único número.");
			// Si el número introducido por el usuario es mayor a 9 y menor que 100 entonces
			// el primer número se divide entre 10 y del segundo se hace el módulo de 10
			// para calcular si es capicúa o no.
		} else if (numero < 100 && numero > 9) {
			primerNumero = numero / 10;
			ultimoNumero = numero % 10;
			if (primerNumero == ultimoNumero) {
				System.out.println("Número capicúa.");
			} else {
				System.out.println("El número no es capicúa.");
			}
			// Si el número introducido por el usuario es mayor a 99 y menor que 1000
			// entonces el primer número se divide entre 100 para sacar el primer número y
			// para sacar el último se hace el módulo de 10 (como con el anterior, porque el
			// número de en medio no afecta a si es capicúa o no).
		} else if (numero < 1000 && numero > 99) {
			primerNumero = numero / 100;
			ultimoNumero = numero % 10;
			if (primerNumero == ultimoNumero) {
				System.out.println("Número capicúa.");
			} else {
				System.out.println("El número no es capicúa.");
			}
			// Si el número introducido por el usuario es mayor o igual que 1000 y menor o
			// igual que 9999 entonces; para sacar el primer número lo dividimos entre 1000,
			// para el segundo lo dividimos entre 100 y al resultado le hacemos módulo de
			// 10, para sacar el tercero es igual que el segundo pero en lugar de dividirlo
			// entre 100 lo dividimos entre 10, para sacar el último número le hacemos
			// módulo de 10.
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
			// Si el número es mayor que 9999 o menor que 0 aparece el siguiente mensaje.
		} else {
			System.out.println("Introduzca un número entre 0 y 9999.");
		}

		// Cerramos el scanner.
		reader.close();

	}

}