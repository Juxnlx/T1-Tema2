package boletinfor;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {

		int num;
		
		boolean solucion = false;

		Scanner sc = new Scanner(System.in);

		System.out.print("Introduce un número --> ");
		num = sc.nextInt();

		for (int i = 2; i < num; i++) {
			
			if (num % i == 0) {
				solucion = false;
				break;
			} else {
				solucion = true;
			}
		}

		if (solucion) {
			System.out.println("El " + num + " es primo ");
		} else {
			System.out.println("El " + num + " no es primo ");
		}
	}

}
