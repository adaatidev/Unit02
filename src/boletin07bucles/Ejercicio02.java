package boletin07bucles;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {

		// Realiza un programa que nos pida un número n y nos diga cuántos números hay
		// entre 1 y n que sean primos.

		// Número introducido por el usuario
		int numero;

		// Contador para saber cuántos primos hay
		int contador = 0;

		// Booleano para los primos
		boolean esPrimo;

		// Creamos el scanner
		Scanner sc = new Scanner(System.in);

		// Le preguntamos un número al usuario
		System.out.println("Introduce el número");
		numero = sc.nextInt();

		// Bucle que recorre los números desde el dos hasta el número introducido
		for (int i = 2; i <= numero; i++) {
			esPrimo = true;

			// Bucle que calcula si el número es primo
			for (int j = i - 1; j != 1; j--) {
				if (i % j == 0) {
					esPrimo = false;
				}
			}

			// Si el número es primo incrementamos el contador
			if (esPrimo) {
				contador++;
			}
		}

		// Mostramos la cantidad
		System.out.println("Hay " + contador + " numeros primos entre 1 y " + numero);

		// Cerramos el scanner
		sc.close();

	} // Fin de main

} // Fin de clase