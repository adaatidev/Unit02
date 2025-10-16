package diagramas;

import java.util.Scanner;

public class Exercise09 {

	public static void main(String[] args) {

		//Set the variable.
		int nota;
		
		//Set up the scanner.
		Scanner reader = new Scanner (System.in);
		
		//Ask the question.
		System.out.println("Introduzca su nota: ");
		nota = reader.nextInt();
		
		//Set the variable.
		if (nota>=0 && nota<3) {
			System.out.println("Muy deficiente.");
		} else if (nota>=3 && nota<5) {
			System.out.println("Insuficiente");
		} else if (nota>=5 && nota<7) {
			System.out.println("Bien");
		} else if (nota>=7 && nota<9) {
			System.out.println("Notable");
		} else if (nota>=9 && nota<=10) {
			System.out.println("Sobresaliente");
		} else {
			System.out.println("La nota tiene que estar entre 0 y 10.");
		}
			
		//Close the scanner.
		reader.close();
		
	}

}