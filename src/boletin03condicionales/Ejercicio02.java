package boletin03condicionales;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {

		/*
		 * Utiliza un operador ternario para calcular el valor absoluto de un número que
		 * se solicita al usuario por teclado.
		 */
		
		/*
		 * PRUEBA
		 * Número introducido: -8
		 * Respuesta esperada: 8
		 * Respuesta obtenida: 8
		 */

		// Declaramos la variable que va a tomar el número que introduzca el usuario.
		int numero;
		int valorAbsoluto;

		// Preparamos el scanner.
		Scanner reader = new Scanner(System.in);

		// Le preguntamos al usuario un número.
		System.out.println("Introduzca un número: ");
		numero = reader.nextInt();

		// Declaramos el condicional, si el número es positivo permanece igual y si es
		// negativo pasa a ser positivo.
		valorAbsoluto = numero >= 0 ? numero : numero * -1;
		System.out.println("Su valor absoluto es: " + valorAbsoluto);
		
		// Cerramos el scanner.
		reader.close();

	}

}