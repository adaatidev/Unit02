package boletin;

import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {

		//Declaramos la variable.
		int num;
		
		//Preparamos el scanner.
		Scanner reader = new Scanner (System.in);
		
		//Realizamos la pregunta al usuario.
		System.out.println("Introduzca un número: ");
		num = reader.nextInt();
		
		//Realizamos el condicional.
		if (num % 2 == 0) {
			System.out.println("El número introducido es par.");
		} else {
			System.out.println("El número introducido es impar.");
		}
		
		//Cerramos el scanner.
		reader.close();
		
	}

}