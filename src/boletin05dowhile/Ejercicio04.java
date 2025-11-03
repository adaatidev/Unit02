package boletin05dowhile;

import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {

		// Número introducido por el usuario
		int numero;

		// Multiplicación
		int multiplicacion = 1;

		// Solución
		int solucion;

		// Creamos el scanner
		Scanner reader = new Scanner(System.in);

		// Le pedimos al usuario un número
		System.out.println("Introduzca un número");
		numero = reader.nextInt();

		// El bucle se ejecutará mientras que la variable de la multiplicación sea menor
		// o igual que 10
		do {
			solucion = numero * multiplicacion;
			System.out.println(numero + "x" + multiplicacion + "=" + solucion);
			multiplicacion++;
		} while (multiplicacion <= 10);

		// Cerramos el scanner
		reader.close();

	}// Fin de main

}// Fin de clase
