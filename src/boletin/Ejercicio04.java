package boletin;

import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {
			
		//Declaramos la variable.
		int num;
		
		//Preparamos el scanner.
		Scanner reader = new Scanner (System.in);
		
		//Preguntamos al usuario.
		System.out.println("Introduzca un número entre 0 y 99999: ");
		num = reader.nextInt();
		
		//Declaramos el condicional.
		if (num <= 9) {
			System.out.println("El número introducido tiene una cifra. ");
		} else if (num <= 99 && num >= 10) {
			System.out.println("El número introducido tiene dos cifras. ");
		} else if (num <= 999 && num >= 100) {
			System.out.println("El número introducido tiene tres cifras. ");
		} else if (num <= 9999 && num >= 1000) {
			System.out.println("El número introducido tiene cuatro cifras. ");
		} else if (num <= 99999 && num >= 10000) {
			System.out.println("El número introducido tiene cinco cifras. ");
		}
		
		//Cerramos el scanner.
		reader.close();
		
	}

}