package diagramas;

import java.util.Scanner;

public class Exercise10 {

	public static void main(String[] args) {

		//Set the variables.
		int hora;
		int min;
		int seg;
		
		//Set up the scanner.
		Scanner reader = new Scanner (System.in);
		
		//Ask the questions and read the answers.
		System.out.println("Introduzca número de horas: ");
		hora = reader.nextInt();
		
		System.out.println("Introduzca número de minutos: ");
		min = reader.nextInt();
		
		System.out.println("Introduzca número de segundos: ");
		seg = reader.nextInt();
		
		//Set the conditional.
		if (seg < 59) {
			seg++;
		} else {
			seg = 0;
			if (min < 59) {
				min++;
			} else {
				min = 0;
				if (hora < 23) {
					hora++;
				} else {
					hora = 0;
					
				}
			}
		}
		
		//Show the answer.
		System.out.println(hora + ":" + min + ":" +seg);
		
		//Close the scanner.
		reader.close();
		
	}
}