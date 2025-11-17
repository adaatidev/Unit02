package boletin07bucles;

import java.util.Scanner;

public class Ejercicio07 {

	public static void main(String[] args) {

		// Escribe un programa que lea un número n e imprima una pirámide de números con
		// n filas como en la siguiente figura:
		// 1
		// 121
		// 12321
		// 1234321

		// Numero introducido para el usuario
		int num;
		
		// Creación del scanner
		Scanner sc = new Scanner(System.in);
		
		// Le preguntamos un número al usuario
		System.out.println("Introduzca un número");
		num = sc.nextInt();
		
		if (num > 0) {
			for (int i = 1; i <= num; i++) {
				
			}
		} else {
			System.out.println("El valor introducido no es válido");
		}
		
		//Cerramos el scanner
		sc.close();
		
	} // Fin main
} // Fin clase