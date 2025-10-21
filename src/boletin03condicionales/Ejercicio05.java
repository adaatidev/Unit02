package boletin03condicionales;

import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {

		// Declaramos las variables de los días y la distancia a recorrer por el
		// usuario.
		int dias;
		int distancia;
		double precioBillete;

		// Preparamos el scanner.
		Scanner reader = new Scanner(System.in);

		// Le preguntamos a el usuario por su estancia y distancia.
		System.out.println("¿De cuántos días es su estancia?");
		dias = reader.nextInt();

		System.out.println("¿Cuánta distancia en KM va a recorrer?");
		distancia = reader.nextInt();

		if (dias <= 7 && distancia <= 800) {
			precioBillete = distancia * 2.5;
			System.out.println("El precio de su billete es: " + precioBillete + "€");
		} else {
			precioBillete = (distancia * 2.5);
			precioBillete = (precioBillete * 0.3 - precioBillete) * -1;
			System.out.println("El precio de su billete es: " + precioBillete + "€");
		}

		// Cerramos el scanner.
		reader.close();

	}

}