package boletinifelse;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {

		//Declaramos la variable.
		double num;
		
		//Preparamos el scanner.
		Scanner reader = new Scanner (System.in);
		
		//Preguntamos el número al usuario.
		System.out.println("Introduzca un número decimal: ");
		num = reader.nextDouble();
		
		//Declaramos el condicional.
		if (num > -1 && num < 1 && num != 0) {
			System.out.println("El número es casi-cero.");
		} else {
			System.out.println("El número NO es casi-cero.");
		}
		
		//Cerramos el scannner.
		reader.close();
		
	}

}