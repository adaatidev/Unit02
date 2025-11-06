package boletin06for;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {

		// Variable para almacenar el número introducido por el usuario
		int num;

		// Creamos el scanner
		Scanner reader = new Scanner(System.in);

		// Le pedimos un número al usuario
		System.out.println("Introduzca un número:");
		num = reader.nextInt();

		//
		for (int cont = 1; cont <= num; cont += 3) {
			System.out.println(cont);
		}

		// Cerramos el scanner
		reader.close();

	}

}
