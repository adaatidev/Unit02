package boletinifelse;

import java.util.Scanner;

public class Ejercicio06 {

	public static void main(String[] args) {

		//Declaramos las variables.
		int num1;
		int num2;
		int num3;
		
		//Preparamos el scanner.
		Scanner reader = new Scanner (System.in);
				
		//Preguntamos al usuario.
		System.out.println("Introduzca un primer número: ");
		num1 = reader.nextInt();	
		
		System.out.println("Introduzca un segundo número: ");
		num2 = reader.nextInt();	
		
		System.out.println("Introduzca un tercer número: ");
		num3 = reader.nextInt();
			
		//Declaramos el condicional.
		if (num1 + num2 == num3) {
			System.out.println("La suma del primer y segundo número es el tercer número introducido. ");	
		} else if (num2 + num3 == num1) {
			System.out.println("La suma del segundo y tercer número es el primer número introducido. ");
		} else if (num1 + num3 == num2) {
			System.out.println("La suma del primer y tercer número es el segundo número introducido. ");
		}
		
		//Cerramos el scanner.
		reader.close();
	
	}

}