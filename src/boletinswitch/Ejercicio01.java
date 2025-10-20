package boletinswitch;

import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {

		// Declaramos la variable para la nota introducida por el usuario.
		int nota;

		// Preparamos el scanner.
		Scanner reader = new Scanner(System.in);

		// Preguntamos al usuario por su nota.
		System.out.println("¿Qué nota has sacado? ");
		nota = reader.nextInt();

		// Preparamos el condicional.
		switch (nota) {
		// Si la nota está entre el 0 y el 4 mostrará insuficiente.
		case 0, 1, 2, 3, 4 -> System.out.println("Insuficiente.");
		// Si la nota está es 5 mostrará suficiente.
		case 5 -> System.out.println("Suficiente.");
		// Si la nota está es 6 mostrará bien.
		case 6 -> System.out.println("Bien.");
		// Si la nota es 7 u 8 mostrará notable.
		case 7, 8 -> System.out.println("Notable.");
		// Si la nota es 9 ó 10 mostrará sobresaliente.
		case 9, 10 -> System.out.println("Sobresaliente.");
		// Si el número introducido no está entre el 0 y el 10 mostrará el siguiente
		// mensaje.
		default -> System.out.println("La nota debe estar comprendida entre 0 y 10.");
		}

		// Cerramos el scanner.
		reader.close();

	}

}