package boletin05dowhile;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {

		// Variable para los números
		int numero = 2;

		// Creamos el scanner
		Scanner reader = new Scanner(System.in);

		// Muestra el número mientras se pueda dividir entre 2 y de resto de 0 y sea
		// menor o igual que 200
		do {
			System.out.println(numero);
			numero++;
			numero++;
		} while (numero % 2 == 0 && numero <= 200);

		// Cerramos el scanner
		reader.close();

	} // Fin de main

}// Fin de clase