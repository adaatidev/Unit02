package boletin04while;

import java.util.Scanner;

public class Ejercicio06 {

	public static void main(String[] args) {

		/*
		 * Un centro de investigación de la flora urbana necesita una aplicación que
		 * muestre cuál es el árbol más alto. Para ello se introducirá por teclado la
		 * altura (en centímetros) de cada árbol (terminando la introducción de datos
		 * cuando se utilice -1 como altura). La aplicación debe devolver la altura del
		 * árbol más alto.
		 * 
		 */

		// Declaramos las variables para las alturas y en la que vamos a almacenar el
		// más alto.
		double altura = 0;
		double alturaMax = 0;

		// Preparamos el scanner.
		Scanner reader = new Scanner(System.in);

		// Pedimos una altura
		System.out.println("Introduzca una altura");
		altura = reader.nextDouble();

		while (altura >= 0) {
			// Declaramos un condicional, si la altura es mayor la altura máxima coge su
			// valor.
			if (altura > alturaMax) {
				alturaMax = altura;
			} // Fin if

			// Pedimos una altura
			System.out.println("Introduzca una altura");
			altura = reader.nextDouble();
		} // Fin while

		// Mostramos el resultado.
		System.out.println("El árbol más alto mide: " + alturaMax);

		// Cerramos el scanner.
		reader.close();

	}// Fin main

}// Fin clase