package boletin07bucles;

import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {

		// Variable para las horas
		int horas;

		// Variable para los minutos
		int min;

		// Variable para los segundos
		int sec;

		// Variable de segundos a incrementar
		int secSumar;

		// Creación del scanner
		Scanner reader = new Scanner(System.in);

		// Le pedimos al usuario la hora y los segundos a incrementar
		System.out.println("Introduzca hora:");
		horas = reader.nextInt();

		System.out.println("Introduzca minutos:");
		min = reader.nextInt();

		System.out.println("Introduzca segundos:");
		sec = reader.nextInt();

		System.out.println("Cantidad de segundos a incrementar:");
		secSumar = reader.nextInt();

		for (int i = 1; i <= secSumar; i++) {
			sec++;
			if (sec == 60) {
				sec = 0;
				min++;
				if (min == 60) {
					min = 0;
					horas++;
					if (horas == 24) {
						horas = 0;
					}
				}
			}
		}

		System.out.println(horas + ":" + min + ":" + sec);

		// Cerramos el scanner
		reader.close();

	}// Fin de main

}// Fin de clase