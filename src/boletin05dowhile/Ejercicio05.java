package boletin05dowhile;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {

		// Creamos el random
		Random rand = new Random();

		// Variable para el número mínimo
		int min = 1;

		// Variable para el número máximo
		int max = 101;

		// Variable para el número aleatorio del ordenador
		int numAleatorio;

		// Variable para la respuesta del usuario
		String respuesta = "";

		// Creamos el scanner
		Scanner reader = new Scanner(System.in);

		// El bucle se ejecuta mientras que la respuesta del usuario no sea iguales.
		// Aparece un número por pantalla, el usuario indica si es mayor o menor y
		// restablece los valores del mínimo y máximo
		do {
			numAleatorio = rand.nextInt(min, max);
			System.out.println("¿Es " + numAleatorio + "?");
			respuesta = reader.next();

			if (respuesta.equals("menor")) {
				max = numAleatorio;

			} else if (respuesta.equals("mayor")) {
				min = numAleatorio + 1;

			} else {
				System.out.println("¡He acertado!");
			}

		} while (!respuesta.equals("iguales"));

		// Cerramos el scanner
		reader.close();

	}// Fin de main

}// Fin de clase