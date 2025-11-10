package boletin06for;

import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {

		// Creamos la variable para el número introducido por el usuario
		int numero = 0;

		// Constante de cantidad de números introducidos
		final int CANTIDAD = 10;
		
		// Creamos la variable para la media
		int media = 0;

		// Creamos el scanner
		Scanner reader = new Scanner(System.in);

		//Le pedimos un número al usuario
		System.out.println("Introduzca un número");
		numero = reader.nextInt();
		
		for (int contador = 1; contador < 10; contador++) {
			numero += numero;
			System.out.println("Introduzca un número");
			numero = reader.nextInt();
		}

		media = numero / CANTIDAD;
		
		System.out.println("La media de los números introducidos es " + media);
		
		// Cerramos el scanner
		reader.close();

	}// Fin de main

}// Fin de clase