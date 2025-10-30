package boletin02switch;

import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {

		// Declaramos las variables para los números introducidos por el usuario.
		int num1;
		int num2;

		// Declaramos la variable de la respuesta
		String answer;

		// Declaramos las variables para las operaciones.
		int a;
		int b;
		int c;

		// Preparamos el scanner.
		Scanner reader = new Scanner(System.in);

		// Preguntamos al usuario por dos número para realizar las operaciones.
		System.out.println("Introduzca un primer número: ");
		num1 = reader.nextInt();

		System.out.println("Introduzca un segundo número: ");
		num2 = reader.nextInt();
		reader.nextLine(); // Depura el código

		// Le preguntamos al usuario qué operación quiere que se muestre.
		System.out.println("A. SUMAR LOS NÚMEROS");
		System.out.println("B. RESTAR LOS NÚMEROS");
		System.out.println("C. MULTIPLICAR LOS NÚMEROS");
		System.out.println("D. DIVIDIR LOS NÚMEROS");
		answer = reader.next();

		// Preparamos las operaciones.
		a = num1 + num2;
		b = num1 - num2;
		c = num1 * num2;
		
		// Preparamos el condicional.
		switch (answer) {
		// Si la respuesta del usuario es suma, mostrará la suma de los números que ha
		// introducido.
		case "a" -> System.out.println("Suma de los números introducidos: " + a);
		// Si la respuesta del usuario es resta, mostrará la resta de los números que ha
		// introducido.
		case "b" -> System.out.println("Resta de los números introducidos: " + b);
		// Si la respuesta del usuario es multiplicación, mostrará la multiplicación de
		// los números que ha introducido.
		case "c" -> System.out.println("Multiplicación de los números introducidos: " + c);
		// Si la respuesta del usuario es división, mostrará la división de los números
		// que ha introducido.
		case "d"-> { if (num2 != 0) {
			System.out.println("División de los números introducidos: " + (num1 / num2));
			
		} else {
			System.out.println("No se puede dividir.");
		} 
		}
		// Si la respuesta del usuario no es ninguna de las anteriores mostrará el
		// siguiente mensaje.
		default -> System.out.println("Debe introducir la letra de una operación nombrada.");
		}

		// Cerramos el scanner.
		reader.close();

	}

}