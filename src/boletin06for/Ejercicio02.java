package boletin06for;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {

		// Variable para almacenar el número introducido por el usuario
		int numero;

		// Variable para contar los múltiplos de 3
		int contMult = 0;

		// Creamos el scanner
		Scanner reader = new Scanner(System.in);

		// Le pedimos un número al usuario
		System.out.println("Introduzca un número:");
		numero = reader.nextInt();

		//
		for (int contador = 1; contador <= numero; contador++) {
			if (contador % 3 == 0) {
				contMult++;
			} // Fin de if
		} // Fin de for

		// Mostrar la respuesta
		System.out.println("Hay " + contMult + " múltiplos de 3.");

		// Cerramos el scanner
		reader.close();

	}// Fin de main

}// Fin de clase
