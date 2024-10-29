package bolentinjames;

import java.util.Scanner;

public class Exercise5 {

	public static void main(String[] args) {

		int hour;

		int minutes;
		
		final int HOUR_CONSTANT = 11;
		final int MINUTES_CONSTANT = 60;

		int hourFinal;
		int minutesFinal;
		
		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("Introduce the hour --> ");
			hour = sc.nextInt();
		} while (hour < 1 || hour > 12);

		do {
			System.out.println("Introduce the minutes --> ");
			minutes  = sc.nextInt();
		} while (minutes < 1 || minutes > 60);
		
		hourFinal = HOUR_CONSTANT - hour;
		minutesFinal = MINUTES_CONSTANT - minutes;
		
		
		System.out.println(hourFinal < 10 ?  "0" + hourFinal +  ":" + minutesFinal + hourFinal : hourFinal+ ":" + minutesFinal);
		
		sc.close();	}

}
