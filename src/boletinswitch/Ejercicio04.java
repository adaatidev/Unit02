package boletinswitch;

import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {

		// Declaramos las variables para las tiradas.
		String tirada1;
		String tirada2;

		// Declaramos las variables enteras de las tiradas.
		int tirada1n = 0;
		int tirada2n = 0;

		// Preparamos el scanner.
		Scanner reader = new Scanner(System.in);

		// Le preguntamos al usuario cuánto ha sacado en cada tirada.
		System.out.println("INGRESE EL VALOR EN FORMATO CADENA ¿Cuánto ha sacado en la primera tirada?");
		tirada1 = reader.nextLine();

		System.out.println("INGRESE EL VALOR EN FORMATO CADENA ¿Cuánto ha sacado en la segunda tirada?");
		tirada2 = reader.nextLine();

		// Preparamos el condicional.
		switch (tirada1) {
		// Si la respuesta es uno, el valor de la variable de la primera tirada cambiará
		// a 1.
		case "uno" -> tirada1n = 1;
		// Si la respuesta es dos, el valor de la variable de la primera tirada cambiará
		// a 1.
		case "dos" -> tirada1n = 2;
		// Si la respuesta es tres, el valor de la variable de la primera tirada
		// cambiará a 1.
		case "tres" -> tirada1n = 3;
		// Si la respuesta es cuatro, el valor de la variable de la primera tirada
		// cambiará a 1.
		case "cuatro" -> tirada1n = 4;
		// Si la respuesta es cinco, el valor de la variable de la primera tirada
		// cambiará a 1.
		case "cinco" -> tirada1n = 5;
		// Si la respuesta es seis, el valor de la variable de la primera tirada
		// cambiará a 1.
		case "seis" -> tirada1n = 6;
		// Si la respuesta no está entre el 1 y el 6 mostrará el siguiente mensaje.
		default -> System.out.println("La tirada no puede ser mayor que 6 ni menor que 1.");
		}

		// Realizamos el mismo proceso que en la tirada 1.
		switch (tirada2) {
		case "uno" -> tirada2n = 1;
		case "dos" -> tirada2n = 2;
		case "tres" -> tirada2n = 3;
		case "cuatro" -> tirada2n = 4;
		case "cinco" -> tirada2n = 5;
		case "seis" -> tirada2n = 6;
		default -> System.out.println("La tirada no puede ser mayor que 6 ni menor que 1.");
		}

		// Muestra el resultado, las sumas de las tiradas.
		System.out.println("La suma de ambas tiradas es: " + (tirada1n + tirada2n));

		// Cerramos el scanner.
		reader.close();

	}

}