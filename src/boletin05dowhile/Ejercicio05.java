package boletin05dowhile;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {

		Random rand = new Random();

		// Variable para el número mínimo
		int min = 1;

		// Variable para el número máximo
		int max = 101;

		// Número introducido por el usuario
		int numero;

		// Variable para el número aleatorio del ordenador
		int numAleatorio;
		
		//Variable para la respuesta del usuario
		String respuesta = "";

		// Creamos el scanner
		Scanner reader = new Scanner(System.in);

		// Le pedimos al usuario un número
		System.out.println("Introduzca un número");
		numero = reader.nextInt();
		
		do {
			numAleatorio = rand.nextInt(min, max);
			System.out.println("¿Es " + numAleatorio + "?");
			respuesta = reader.next();
			
			if (respuesta.equals("menor")) {
				max = numAleatorio;
			
			} else if (respuesta.equals("mayor")) {
				min = numAleatorio + 1;
				
			} else {
				System.out.println("Has acertado");
			}
			
		}while(!respuesta.equals("iguales"));

	// Cerramos el scanner
	reader.close();

}// Fin de main

}// Fin de clase