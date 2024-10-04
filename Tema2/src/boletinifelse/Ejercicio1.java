package boletinifelse;

import java.util.Scanner;

/**
 * Este programa le pide al usuario un número y el programa debe de indicar si es par o impar.
 */
public class Ejercicio1 {

	public static void main(String[] args) {

		// Creamos la variable num como int para almacenar el valor introducido por el
		// usuario.
		int num;

		// Creamos el Scanner para pedir el número al usuario por teclado.
		Scanner sc = new Scanner(System.in);

		// Le pedimos al usuario el número por teclado y lo leemos.
		System.out.print("Introduce un número --> ");
		num = sc.nextInt();

		// Comprobamos mediante una condición if si el modulo del número es 0, si es así
		// entra en la condición y ejecuta que es "PAR"
		if ((num % 2) == 0) {
			System.out.println("¡El " + num + " ES PAR!");
		//En caso de que no se cumpla la condición anterior se imprime "IMPAR"
		} else {
			System.out.println("¡El " + num + " ES IMPAR!");
		}

		// Cierre de Scanner
		sc.close();
	}

}
