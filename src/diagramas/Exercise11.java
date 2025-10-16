package diagramas;

import java.util.Scanner;

public class Exercise11 {

	public static void main(String[] args) {

		//Declaramos las variables y las constantes.
		String nombre;
		int numHoras;
		double tarifaHora;
		double salBruto;
		double salNeto;
		double tasas = 0;
		
		//Preparamos el scanner.
		Scanner reader = new Scanner(System.in);
		
		//Hacemos las preguntas al usuario.
		System.out.println("Introduzca el nombre del empleado: ");
		nombre = reader.nextLine();
		
		System.out.println("Indtroduzca el número de horas trabajadas: ");
		numHoras = reader.nextInt();
		
		System.out.println("Introduzca la tarifa por hora: ");
		tarifaHora = reader.nextDouble();
		
		//Realizamos los condicionales.
		if(numHoras <= 35) {
			salBruto = numHoras * tarifaHora;
		} else {
			salBruto = 35 * tarifaHora + (numHoras-35) * tarifaHora * 1.5;
		}
		
		if (salBruto <= 500) {
			salNeto = salBruto;
		} else if (salBruto <= 900){
			tasas = salBruto * 0.25;
			salNeto = salBruto - tasas;
		} else {
			tasas = salBruto * 0.45;
			salNeto = salBruto - tasas;
		}
		
		//Mostramos las respuestas.
		System.out.print("Resumen de: " + nombre);
		System.out.print("Salario Bruto: " + salBruto);
		System.out.print("Tasas: " + tasas);
		System.out.print("Salario Neto: " + salNeto);
	
		//Cerramos el scanner.
		reader.close();
		
	}

}