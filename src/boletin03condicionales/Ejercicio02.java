package boletin03condicionales;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {

		// Declaramos la variable que va a tomar el número que introduzca el usuario.
		int numero;

		// Preparamos el scanner.
		Scanner reader = new Scanner(System.in);

		// Le preguntamos al usuario un número.
		System.out.println("Introduzca un número: ");
		numero = reader.nextInt();

		// Declaramos el condicional, si el número es positivo permanece igual y si es
		// negativo pasa a ser positivo.
		if (numero >= 0) {
			System.out.println("Valor absoluto: " + numero);
		} else {
			numero = numero * -1;
			System.out.println("Valor absoluto: " + numero);
		}

		// Cerramos el scanner.
		reader.close();

	}

}