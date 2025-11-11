package boletin06for;

import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {

		// Creamos la variable para el número introducido por el usuario
		int numero = 0;

		// Creamos la variable para el número almacenado
		int numeroTotal = 0;

		// Creamos la variable para la media
		double media = 0;

		// Creamos el scanner
		Scanner reader = new Scanner(System.in);

		// El contador empieza a 1, mientras que sea menor o igual que 10, cuando
		// termine se incrementa 1
		for (int contador = 1; contador <= 10; contador++) {
			System.out.println("Introduzca un número");
			numero = reader.nextInt();
			numeroTotal = numero + numeroTotal;
		}

		// Calculamos la media
		media = numeroTotal / 10.0;

		// Mostramos la media
		System.out.println("La media de los números introducidos es " + media);

		// Cerramos el scanner
		reader.close();

	}// Fin de main

}// Fin de clase