package boletin07bucles;

import java.util.Scanner;

public class Ejercicio06 {

	public static void main(String[] args) {

		// Solicita al usuario un número n y dibuja un triángulo de base y altura n. Por
		// ejemplo para n=4 debe dibujar lo siguiente:
		//    *
		//   * *
		//  * * *
		// * * * *

		// Número introducido por el usuario
		int num;

		// Creamos el scanner
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduzca un número");
		num = sc.nextInt();

		// Si el número introducido es mayor o igual que 1 se ejecuta el código, sino,
		// imprime que el valor no es válido
		if (num >= 1) {
			//
			for (int i = 1; i <= num; i++) {
				//
				for (int j = 1; j <= num; j++) {
					//
					if (j <= num - i) {
						System.out.print(" ");
					} else {
						System.out.print("* ");
					}
				} // Fin for
				System.out.println();
			} // Fin for
		} else {
			System.out.println("El valor introducido no es válido");
		} // Fin if

		// Cerramos el scanner
		sc.close();

	} // Fin main
} // Fin clase