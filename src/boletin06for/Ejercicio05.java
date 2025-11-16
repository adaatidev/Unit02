package boletin06for;

import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {

		// Pedir un número y calcular su factorial. Por ejemplo, el factorial de 5 se
		// denota 5! y es igual a 5x4x3x2x1 = 120.

		// Variable donde almacenar el factorial
		long factorial = 1;

		// Número que se le pide al usuario
		int numero;

		// Creamos el scanner
		Scanner reader = new Scanner(System.in);

		// Pedimos un número al usuario
		System.out.println("Introduzca un número");
		numero = reader.nextInt();

		for (int cont = numero; cont >= 1; cont--) {
			// 5*4*3*2*1
			System.out.print(cont);
			if (cont != 1) {
				// Solo se pone el * a la derecha si no es 1
				System.out.print("*");
			} // Fin de if
			// Cálculo del factorial
			factorial *= cont;
		} // Fin de for

		// Imprimimos el factorial
		System.out.print("= " + factorial);

		// Cerramos el scanner
		reader.close();

	}// Fin de main

}// Fin de clase