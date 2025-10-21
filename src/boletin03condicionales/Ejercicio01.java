package boletin03condicionales;

import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {

		//Declaramos la variable en la que se almacena el número que introduce el usuario.
		int numero;
		
		//Declaramos las variables para las operaciones que vamos a realizar para comparar los números.
		int primerNumero;
		int ultimoNumero;
		
		//Preparamos el scanner.
		Scanner reader = new Scanner (System.in);
		
		//Le preguntamos al usuario por un número comprendido entre 0 y 9999.
		System.out.println("Introduzca un número comprendido entre 0 y 9999: ");
		numero = reader.nextInt();
		
		//Realizamos las operaciones.
		primerNumero = numero / 10;
		ultimoNumero = numero % 10;
		
		
		if (numero < 10 && numero > 0) {
			System.out.println("Es un único número.");
		} else if (numero < 100 && numero > 9) {
			System.out.println("");
		} else if (numero < 1000 && numero > 99){
			System.out.println("");
		} else if (numero < 10000 && numero <= 9999) {
			System.out.println("");
		} else {
			System.out.println("Introduzca un número entre 0 y 9999.");
		}
		
		
		
		//Cerramos el scanner.
		reader.close();
		
	}

}