package english;

import java.util.Scanner;

public class Exercise03 {

	public static void main(String[] args) {

		//Set the variable 
		int mirrorHour;
		int mirrorMinute;
		
		int realHour;
		int realMinute;
		
		//Set up the scanner.
		Scanner reader = new Scanner (System.in);
		
		System.out.println("Introduce the hour that you are seeing in the mirror: ");
		mirrorHour = reader.nextInt();
		mirrorMinute = reader.nextInt();
		
		//realHour = (mirrorMinute == 0) ? (12 - mirrorHour) : (11 - mirrorHour);
		//realMinute = (mirrorMinute == 0) ? 0 : 60 - mirrorMinute;
		
		if (realHour < 10) {
			System.out.println("0");
		}
		System.out.println(realHour + ":");
		
		if (realMinute < 10) {
			System.out.println("0");
		}
		System.out.println(realMinute);
		
		//Close the scanner.
		reader.close();
		
	}

}