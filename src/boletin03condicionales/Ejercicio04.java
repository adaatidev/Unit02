package boletin03condicionales;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {

		Random rnd = new Random();
		
		// Declaramos las variables de ambos números y de los resultados.
		int numero1 = rnd.nextInt(1,100);
		int numero2 = rnd.nextInt(1,100);
		int resultadoUsuario = 0;
		int resultadoCorrecto = 0;

		// Preparamos el scanner.
		Scanner reader = new Scanner(System.in);

		// Le indicamos al usuario lo que debe hacer.
		System.out.println("Sume los siguientes números e introduzca su solución.");
		System.out.println(numero1 + "+" +  numero2);
		System.out.println("Introduzca aquí la solución: ");
		resultadoUsuario = reader.nextInt();

		// Declaramos el condicional, si la suma está bien muestra que está bien, si
		// está mal muestra que está mal y el resultado correcto.
		if (resultadoUsuario == resultadoCorrecto) {
			System.out.println("¡La solución es correcta!");
		} else {
			System.out.println("La solución no es correcta, haber estudiado.");
		}

		// Cerramos el scanner.
		reader.close();

	}

}