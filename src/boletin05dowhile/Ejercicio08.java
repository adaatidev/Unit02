package boletin05dowhile;

import java.util.Scanner;

public class Ejercicio08 {

	public static void main(String[] args) {

		// Variable de la primera tirada
		String tirada1L = "";

		// Variable de la segunda tirada
		String tirada2L = "";

		// Variable de la primera tirada
		int tirada1N = 0;

		// Variable de la segunda tirada
		int tirada2N = 0;

		// Variable para la suma de las tiradas
		int suma;

		// Creamos una constante para cada número
		final String UNO = "uno";
		final String DOS = "dos";
		final String TRES = "tres";
		final String CUATRO = "cuatro";
		final String CINCO = "cinco";
		final String SEIS = "seis";

		// Creamos el scanner
		Scanner reader = new Scanner(System.in);

		do {
			System.out.println("Introduzca el valor de la primera tirada en formato cadena");
			tirada1L = reader.next().toLowerCase();
		} while (!tirada1L.equals(UNO) && !tirada1L.equals(DOS) && !tirada1L.equals(TRES) && !tirada1L.equals(CUATRO)
				&& !tirada1L.equals(CINCO) && !tirada1L.equals(SEIS));

		do {
			System.out.println("Introduzca el valor de la segunda tirada en formato cadena");
			tirada2L = reader.next().toLowerCase();
		} while (!tirada2L.equals(UNO) && !tirada2L.equals(DOS) && !tirada2L.equals(TRES) && !tirada2L.equals(CUATRO)
				&& !tirada2L.equals(CINCO) && !tirada2L.equals(SEIS));

		switch (tirada1L) {
		case "uno" -> tirada1N = 1;
		case "dos" -> tirada1N = 2;
		case "tres" -> tirada1N = 3;
		case "cuatro" -> tirada1N = 4;
		case "cinco" -> tirada1N = 5;
		case "seis" -> tirada1N = 6;
		default -> System.out.println("La tirada no puede ser mayor que 6 ni menor que 1.");
		}

		switch (tirada2L) {
		case "uno" -> tirada2N = 1;
		case "dos" -> tirada2N = 2;
		case "tres" -> tirada2N = 3;
		case "cuatro" -> tirada2N = 4;
		case "cinco" -> tirada2N = 5;
		case "seis" -> tirada2N = 6;
		default -> System.out.println("La tirada no puede ser mayor que 6 ni menor que 1.");
		}

		// Mostramos la suma de las tiradas
		suma = tirada1N + tirada2N;
		System.out.println("La suma de ambas tiradas es: " + suma);

		// Cerramos el scanner
		reader.close();

	}// Fin de main

}// Fin de clase
