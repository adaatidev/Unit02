package boletin07bucles;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {

		// Realiza un programa que nos diga si un número introducido por teclado es
		// capicúa o no. El número debe ser mayor o igual que 0.

		// Número introducido por el usuario
		int num;
		
		// Creamos el scanner
		Scanner sc = new Scanner(System.in);
		
		// Le preguntamos un número al usuario
		System.out.println("Introduzca un número");
		num = sc.nextInt();
		
		if (num > 0) {
			
		} else {
			System.out.println("El valor introducido no es válido");
		}
		
		// Cerramos el scanner
		sc.close();
		
	} // Fin main
} // Fin clase