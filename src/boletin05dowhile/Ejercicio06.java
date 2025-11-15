package boletin05dowhile;

import java.util.Scanner;

public class Ejercicio06 {

	public static void main(String[] args) {

		// Variable para la respuesta del jugador 1
		String respuesta1;

		// Variable para la respuesta del jugador 1
		String respuesta2;

		// Creamos constantes para las respuestas del juego
		final String PIEDRA = "piedra";
		final String PAPEL = "papel";
		final String TIJERAS = "tijeras";

		// Variable para la elección de salir
		String eleccion;

		// Creamos el scanner.
		Scanner reader = new Scanner(System.in);

		// El bucle se repite mientras que el jugador pulse S. El bucle que está dentro
		// se ejecuta mientras que los jugadores no den una respuesta válida
		do {

			do {
				System.out.println("Jugador 1, ¿piedra, papel o tijeras?");
				respuesta1 = reader.nextLine().toUpperCase();
			} while (respuesta1.equals(PIEDRA) || respuesta1.equals(PAPEL) || respuesta1.equals(TIJERAS));

			do {
				System.out.println("Jugador 2, ¿piedra, papel o tijeras?");
				respuesta2 = reader.nextLine().toUpperCase();
			} while (respuesta2.equals(PIEDRA) || respuesta2.equals(PAPEL) || respuesta2.equals(TIJERAS));

			if (respuesta1.equals(respuesta2)) {
				System.out.println("Empate.");
			} else if (respuesta1.equals(PIEDRA) && respuesta2.equals(TIJERAS)
					|| respuesta1.equals(TIJERAS) && respuesta2.equals(PAPEL)
					|| respuesta1.equals(PAPEL) && respuesta2.equals(PIEDRA)) {
				System.out.println("¡Ha ganado el jugador 1!");
			} else {
				System.out.println("¡Ha ganado el jugador 2!");
			}

			System.out.println("Pulse S si desea volver a iniciar la partida");
			eleccion = reader.nextLine().toUpperCase();

		} while (eleccion.equals("S"));

	}// Fin de main

}// Fin de clase