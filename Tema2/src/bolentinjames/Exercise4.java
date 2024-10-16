package bolentinjames;

import java.util.Random;
import java.util.Scanner;

public class Exercise4 {

	public static void main(String[] args) {
		
		int numRamdom;
		
		int numUser;
		
		Scanner sc = new Scanner(System.in);
		
		Random rand = new Random();
		
		numRamdom = rand.nextInt(1, 101);
		
		System.out.println("Introduce un numero --> ");
		numUser = sc.nextInt();
		
		while (numRamdom != numUser) {
			if (numUser > numRamdom) {
				System.out.println("Introduce un número mas bajo");
				System.out.println();
			} else {
				System.out.println("Introduce un número mas alto ");
				System.out.println();
			}
			
			System.out.println("Introduce un numero --> ");
			numUser = sc.nextInt();
		}

		System.out.println("¡Felicidades!");
		sc.close();
	}

}
