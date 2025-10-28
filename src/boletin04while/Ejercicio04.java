package boletin04while;

import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {

		/*
		 * Escribe un algoritmo que pida al usuario 10 números enteros (pueden ser
		 * positivos, negativos o cero). Cuando acabe de insertar los números, el
		 * algoritmo debe mostrar la suma de los números positivos, la media de los
		 * números negativos y el número de ceros que ha introducido el usuario.
		 * 
		 */

		// Declaramos las variables para un número, un contador de números, la suma de positivos, la suma de negativos, el contador de negativos y el contador de ceros.
		int numero;
		int contador;
		int sumaPositivos;
		int sumaNegativos;
		int contadorNegativos;
		int contadorCeros;

		// Preparamos el scanner.
		Scanner reader = new Scanner(System.in);
		
		while (contador < 10) {
			//Pedimos un número.
			System.out.println("Introduzca un número");
			numero = reader.nextInt();
			//Sumamos al contador
			contador++;
			if (numero > 0) {
				sumaPositivo                                                                                                                                                                                                                                                                                                                                                                                                                                 
			}
		}

		// Cerramos el scanner.
		reader.close();

	}

}