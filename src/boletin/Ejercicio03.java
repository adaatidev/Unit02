package boletin;

import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {

		//Declaramos las variables.
		int coefA;
		int coefB;
		int coefC;
		int discriminante;
		double solucionPositiva;
		double solucionNegativa;
		
		//Preparamos el scanner.
		Scanner reader = new Scanner (System.in);
		
		//Preguntamos al usuario y almacenamos las respuestas.
		System.out.println("Introduzca el valor del coeficiente a: ");
		coefA = reader.nextInt();
		
		System.out.println("Introduzca el valor del coeficiente b: ");
		coefB = reader.nextInt();
		
		System.out.println("Introduzca el valor del coeficiente c: ");
		coefC = reader.nextInt();
		
		//Declaramos el condicional.
		discriminante = (coefB * coefB) - 4 * coefA * coefC;
		
		if (discriminante > 0) {
			
			solucionPositiva = ((- coefB + Math.sqrt(discriminante)) /2 * coefA);
			solucionNegativa = ((- coefB - Math.sqrt(discriminante)) /2 * coefA);
			
			System.out.println("Tiene dos soluciones.");
			System.out.println("Solución positiva: " + solucionPositiva);
			System.out.println("Solución negativa: " + solucionNegativa);
			
		} else if (discriminante == 0) {
			
			solucionPositiva = ((- coefB + Math.sqrt(discriminante)) /2 * coefA);
			
			System.out.println("Tiene una solución.");
			System.out.println("Solución positiva: " + solucionPositiva);
			
		} else {
			System.out.println("No tiene ninguna solución.");
		}
		
		//Cerramos el scanner.
		reader.close();
		
	}

}