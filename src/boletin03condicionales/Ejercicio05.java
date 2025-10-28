package boletin03condicionales;

import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {

		/*
		 * Determinar el precio de un billete de tren, conociendo la distancia a
		 * recorrer, y sabiendo que si el número de días de estancia es superior a 7 y
		 * la distancia superior a 800 km el billete tiene una reducción del 30%. El
		 * precio por kilómetro es de 2,5€. La distancia a recorrer y el número de días
		 * de estancia los debes solicitar al usuario por teclado.
		 */

		/*
		 * PRUEBA Días que voy a introducir: 8 Distancia que voy a introducir: 888
		 * Respuesta esperada (precio del billete): 1554€ Respuesta obtenida: 1554€
		 */

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

		// Declaramos la condición, si los días son menor o igual que 7 y la distancia
		// menor o igual que 800km no recibe ningún descuento en el billete, si no
		// recibe un descuento de un 30%
		if (dias <= 7 && distancia <= 800) {
			precioBillete = distancia * 2.5;
			System.out.println("El precio de su billete es: " + precioBillete + "€");
		} else {
			precioBillete = (double) (distancia * 2.5);
			precioBillete = (precioBillete * 0.3 - precioBillete) * -1;
			System.out.println("El precio de su billete es: " + precioBillete + "€");
		}

		// Cerramos el scanner.
		reader.close();

	}

}