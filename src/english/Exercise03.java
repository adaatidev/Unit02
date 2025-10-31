package english;

import java.util.Scanner;

public class Exercise03 {

	public static void main(String[] args) {

		// Set the variables for the mirror and the real hours.
		int mirrorHour;
		int mirrorMinute;
		int realHour;
		int realMinute;

		// Set up the scanner.
		Scanner reader = new Scanner(System.in);

		// Ask the user about the hour he is seeing in the mirror.
		System.out.println("Introduce the hour that you are seeing in the mirror: ");
		mirrorHour = reader.nextInt();
		mirrorMinute = reader.nextInt();

		// If hour==12 I change it to 0 to operate later
		mirrorHour = (mirrorHour == 12) ? 0 : mirrorHour;

		// Hour oclock
		if (mirrorMinute == 0) {
			realHour = 12 - mirrorHour;
		} else {
			realHour = 11 - mirrorHour;
		}

		// Set the conditional, if the real hour is 0 the hour shown is 12 if not it
		// will as realHour
		realHour = (realHour == 0) ? 12 : realHour;

		// If the mirror minute is 0 it will show 0, it not 60 - the mirror minutes
		realMinute = (mirrorMinute == 0) ? 0 : (60 - mirrorMinute);

		if (realHour < 10) {
			System.out.println("0");
		}

		System.out.println(realHour + ":");

		if (realMinute < 10) {
			System.out.println("0");
		}

		System.out.println(realMinute);

		// Close the scanner.
		reader.close();

	}

}