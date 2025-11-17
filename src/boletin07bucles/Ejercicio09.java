package boletin07bucles;

import java.util.Scanner;

public class Ejercicio09 {

	public static void main(String[] args) {

		// Realiza un programa que nos diga cuántos dígitos tiene un número introducido
		// por teclado. El número introducido debe ser mayor que 0.

		// Número introducido por el usuario
		int num;

		// Contador para dígitos
		int contador = 0;

		// Creamos el scanner
		Scanner sc = new Scanner(System.in);

		// Pedimos un número al usuario
		System.out.println("Introduzca un número");
		num = sc.nextInt();

		// Condicional que ejecuta el bucle si el valor introducido es mayor que 0
		if (num > 0) {
			// Mientras que el número introducido sea mayor que 0 se seguirá dividiendo
			// entre 10 e incrementando el contador
			while (num > 0) {
				num /= 10;
				contador++;
			}
		} else {
			System.out.println("El valor introducido no es válido");
		}

		// Mostramos el resultado
		System.out.println("El número introducido tiene " + contador + " dígitos");

		// Cerramos el scanner
		sc.close();

	} // Fin main
} // Fin clase