package boletin07bucles;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {

		// Realiza un programa que nos pida un número n y nos diga cuántos números hay
		// entre 1 y n que sean primos.

		// Contador para saber cuántos primos hay
		int cuentaPrimos = 0;

		// Número introducido por el usuario
		int num;

		// Variable para el while que comprueba si el número es primo
		int divisor;

		// Variable para indicar si un número es primo
		boolean esPrimo;

		// Scanner para leer del teclado
		Scanner sc = new Scanner(System.in);

		// Le pedimos un número al usuario
		System.out.println("Introduce un número");
		num = sc.nextInt();

		// Recorremos todos los números del 2 hasta num
		for (int cont = 2; cont <= num; cont++) {
			// Inicializamos el divisor a 2
			divisor = 2;

			// volvemos a poner esPrimo a true
			esPrimo = true;

			// comprobamos si cont es primo
			while (divisor < cont && esPrimo) {
				if (cont % divisor == 0) {
					esPrimo = false;
				}
				divisor++;
			} // fin while

			// Miramos si el número es primo
			if (esPrimo) {
				cuentaPrimos++;
			} // fin if esPrimo

		} // fin for

		// Imprimimos cuántos primos hay
		System.out.println("Hay " + cuentaPrimos + " números primos");

		// Cerramos scanner
		sc.close();

	} // Fin main

} // Fin clase