package boletin05dowhile;

import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {

		// Variable para los números naturales
		int numero = 1;

		// Creamos el scanner
		Scanner reader = new Scanner(System.in);

		// Muestra el número mientras sea menor o igual que 20
		do {
			System.out.println(numero);
			numero++;
		} while (numero <= 20);

		// Cerramos el scanner
		reader.close();

	} // Fin de main

} // Fin de clase