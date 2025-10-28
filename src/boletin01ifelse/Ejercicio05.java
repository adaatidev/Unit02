package boletin01ifelse;

import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {

		// Declaramos las variables de las respuestas de los usuarios.
		String respuesta1;
		String respuesta2;

		// Preparamos el scanner.
		Scanner reader = new Scanner(System.in);

		// Preguntamos a los usuarios.
		System.out.println("Jugador1, ¿piedra, papel o tijeras? ");
		respuesta1 = reader.nextLine();

		System.out.println("Jugador2, ¿piedra, papel o tijeras? ");
		respuesta2 = reader.nextLine();

		// Declaramos el condicional.
		if (respuesta1.equals(respuesta2)) {
			System.out.println("Empate.");
		} else if (respuesta1.equals("piedra") && respuesta2.equals("tijeras")
				|| respuesta1.equals("tijeras") && respuesta2.equals("papel")
				|| respuesta1.equals("papel") && respuesta2.equals("piedra")) {
			System.out.println("¡Ha ganado el jugador 1!");
		} else {
			System.out.println("¡Ha ganado el jugador 2!");
		}

		// Cerramos el scanner.
		reader.close();

	}

}