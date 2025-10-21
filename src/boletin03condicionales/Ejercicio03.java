package boletin03condicionales;

import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {

		// Declaramos la variable para el número del DNI.
		int numeroDNI;
		int letra;
		char letraDNI = 0;

		// Preparamos el scanner.
		Scanner reader = new Scanner(System.in);

		// Le preguntamos el DNI al usuario.
		System.out.println("Introduzca su número de DNI para recibir su letra: ");
		numeroDNI = reader.nextInt();

		letra = numeroDNI % 23;

		switch (letra) {
		case 0:
			letraDNI = 'T';
			break;
		case 1:
			letraDNI = 'R';
			break;
		case 2:
			letraDNI = 'W';
			break;
		case 3:
			letraDNI = 'A';
			break;
		case 4:
			letraDNI = 'G';
			break;
		case 5:
			letraDNI = 'M';
			break;
		case 6:
			letraDNI = 'Y';
			break;
		case 7:
			letraDNI = 'F';
			break;
		case 8:
			letraDNI = 'P';
			break;
		case 9:
			letraDNI = 'D';
			break;
		case 10:
			letraDNI = 'X';
			break;
		case 11:
			letraDNI = 'B';
			break;
		case 12:
			letraDNI = 'N';
			break;
		case 13:
			letraDNI = 'J';
			break;
		case 14:
			letraDNI = 'Z';
			break;
		case 15:
			letraDNI = 'S';
			break;
		case 16:
			letraDNI = 'Q';
			break;
		case 17:
			letraDNI = 'V';
			break;
		case 18:
			letraDNI = 'H';
			break;
		case 19:
			letraDNI = 'L';
			break;
		case 20:
			letraDNI = 'C';
			break;
		case 21:
			letraDNI = 'K';
			break;
		case 22:
			letraDNI = 'E';
			break;
		}

		System.out.println("Su DNI es: " + numeroDNI + letraDNI);
		
		// Cerramos el scanner.
		reader.close();

	}

}