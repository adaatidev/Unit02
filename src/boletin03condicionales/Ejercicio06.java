package boletin03condicionales;

import java.util.Scanner;

public class Ejercicio06 {

	public static void main(String[] args) {

		//Declaramos las variables para el mes, el año y para saber si es bisiesto.
		int mes = 0;
		int ano = 0;
		boolean bisiesto;
		
		//Preparamos el scanner.
		Scanner reader = new Scanner (System.in);
		
		//Le preguntamos al usuario sobre un mes y un año.
		System.out.println("Introduzca un número de mes: ");
		mes = reader.nextInt();
		
		System.out.println("Introduzca un año: ");
		ano = reader.nextInt();
		
		//Calculamos si el año es bisiesto o no. Si al dividirlo entre 4 el resultado es entero es bisiesto, sino no.
		bisiesto = ano % 4 != 0;
		
		if (bisiesto && mes <= 7 && mes >= 1) {
			System.out.println("El año no es bisiesto.");
		} else if (bisiesto && mes <= 7 && mes >= 1) {
			System.out.println("El año no es bisiesto.");
		} else if (bisiesto && mes == 2) {
			System.out.println("El año es bisiesto.");
			System.out.println("El mes que has elegido tiene 29 días.");
		} else {
			System.out.println("El mes debe ser del 1 al 7.");
		}
		
		if (mes % 2 == 0 && mes != 2) {
			System.out.println("El mes tiene 30 días.");
		} else if (mes % 2 != 0) {
			System.out.println("El mes tiene 31 días.");
		} else if (bisiesto) {
			System.out.println("Tiene 29 días");
		} else {
			System.out.println("Tiene 28 días");
		}
		
		//Cerramos el scanner.
		reader.close();
		
	}

}