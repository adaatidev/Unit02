package boletin03condicionales;

import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {

		//Declaramos la variable para el número del DNI.
		int numeroDNI;
		
		//Preparamos el scanner.
		Scanner reader = new Scanner (System.in);
		
		//Le preguntamos el DNI al usuario.
		System.out.println("Introduzca su número de DNI para recibir su letra: ");
		numeroDNI = reader.nextInt();
		
		
		
		//Cerramos el scanner.
		reader.close();
		
	}

}