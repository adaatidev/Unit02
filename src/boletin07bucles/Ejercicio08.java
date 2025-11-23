package boletin07bucles;

import java.util.Scanner;

public class Ejercicio08 {

	public static void main(String[] args) {

		// Realiza un programa que lea y acepte únicamente aquellos que sean mayores que
		// el último dado. La introducción de números finaliza con la introducción de un
		// 0. Al final se mostrará:
		// a. El total de números introducidos, excluido el 0.
		// b. El total de números fallados.

		// Variable para el número inicial introducido
		int numeroInicial;

		// Variable para el número introducido
		int numero;

		// Variable para el número de fallos
		int fallos = 0;

		// Variable para la cantidad de números introducidos
		int cantidad = 0;

		// Creamos el scanner
		Scanner sc = new Scanner(System.in);

		// Le pedimos al usuario un número
		System.out.println("Dime un número inicial");
		numeroInicial = sc.nextInt();

		// El bucle se ejecuta mientras que el número inicial sea distinto de 0
		while (numeroInicial != 0) {
			System.out.println("Dime un número: ");
			numero = sc.nextInt();
			cantidad++;
			if (numero < numeroInicial && numero != 0) {
				fallos++;
				System.out.println("Fallo, es menor");
			}
			numeroInicial = numero;
		}

		// Mostramos la solución
		System.out.println("Cantidad de números introducidos: " + cantidad);
		System.out.println("Cantidad de fallos: " + fallos);

		// Cerramos el scanner
		sc.close();

	} // Fin main
} // Fin clase