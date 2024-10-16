package bolentinjames;

import java.util.Scanner;

public class Exercise2 {

	public static void main(String[] args) {
		
		int num;
		
		int contador = 1;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce un number --> ");
		num = sc.nextInt();
		System.out.println();
		System.out.println("La tabla del " + num + " es: ");
		
		while (contador <= 10) {
			System.out.println(contador*num);
			contador++;
		}

		sc.close();
	}

}
