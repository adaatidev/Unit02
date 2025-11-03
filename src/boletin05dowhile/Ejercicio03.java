package boletin05dowhile;

import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {

		// Declaramos las variables para la suma total
		int suma = 0;

		// Declaramos la variable del contador que se le va a ir sumando a la suma
		int contador = 1;

		// Declaramos la variable del número introducido por el usuario
		int numero;

		// Creamos el scanner
		Scanner reader = new Scanner(System.in);

		// Le pedimos un número al usuario
		System.out.println("Introduzca un número");
		numero = reader.nextInt();

		do {
			suma += contador;
			contador++;
		} while (contador <= numero);

		System.out.println("La suma total es: " + suma);

		// Cerramos el scanner
		reader.close();

	}// Fin de main

}// Fin de clase