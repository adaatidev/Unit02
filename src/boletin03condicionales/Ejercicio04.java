package boletin03condicionales;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {

		/*
		 * Realiza el “juego de la suma”, que consiste en que aparezcan dos números
		 * aleatorios (comprendidos entre 1 y 99) y el usuario tiene que sumarlos. La
		 * aplicación le pedirá al usuario que introduzca el resultado de la suma. La
		 * aplicación le indicará si el resultado es correcto o no.
		 */

		// Preparamos el random.
		Random rnd = new Random();

		// Declaramos las variables de los números, le asignamos el random y el
		// intervalo de números que va a tener.
		int numero1 = rnd.nextInt(1, 100);
		int numero2 = rnd.nextInt(1, 100);

		// Declaramos las respuestas, tanto la que da el usuario y la correcta.
		int resultadoUsuario = 0;
		int resultadoCorrecto = 0;

		// Preparamos el scanner.
		Scanner reader = new Scanner(System.in);

		// Le indicamos al usuario lo que debe hacer.
		System.out.println("Sume los siguientes números e introduzca su solución.");
		System.out.println(numero1 + "+" + numero2);
		System.out.println("Introduzca aquí la solución: ");
		resultadoUsuario = reader.nextInt();

		/* Declaramos el condicional (si la respuesta introducida por el usuario es
		* igual que la respuesta correcta), si la suma está bien muestra que está bien,
		* si está mal muestra que está mal y el resultado correcto.
		*/ 
		if (resultadoUsuario == resultadoCorrecto) {
			System.out.println("¡La solución es correcta!");
		} else {
			System.out.println("La solución no es correcta, haber estudiado...");
		}

		// Cerramos el scanner.
		reader.close();

	}

}