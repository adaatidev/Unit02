package boletin07bucles;

import java.util.Scanner;

public class Ejercicio07 {

	public static void main(String[] args) {

		// Escribe un programa que lea un número n e imprima una pirámide de números con
		// n filas como en la siguiente figura:
		// 1
		// 121
		// 12321
		// 1234321

		// Numero introducido para el usuario
		int num;

		// Creación del scanner
		Scanner sc = new Scanner(System.in);

		// Le preguntamos un número al usuario
		System.out.println("Introduzca un número");
		num = sc.nextInt();

		// Condicional, si el número es mayor que 0 se ejecutan los bucles, sino muestra
		// un mensaje de que el número introducido no es válido
		if (num > 0) {
			// Bucle para las filas (hacia abajo)
			for (int i = 0; i <= num; i++) {
				// Bucle que escribe hacia la derecha hasta el número céntrico
				for (int j = 1; j <= i; j++) {
					System.out.print(j);
				}
				// Bucle que termina de escribir hacia la derecha a partir del número céntrico
				for (int k = i - 1; k > 0; k--) {
					System.out.print(k);
				}
				System.out.println();
			}
		} else {
			System.out.println("El valor introducido no es válido");
		}

		// Cerramos el scanner
		sc.close();

	} // Fin main
} // Fin clase