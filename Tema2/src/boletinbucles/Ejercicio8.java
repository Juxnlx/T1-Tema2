package boletinbucles;

import java.util.Scanner;

/**
 * Este programa le ira solicitando números al usuario y si son mayores que el
 * anterior perfecto pero si es menor saltaraun error. Finalmente nos mostrará
 * el total de números introducidos y el número de fallos.
 */
public class Ejercicio8 {

	public static void main(String[] args) {

		// Creamos la variable num como int para almacenar el número introducido por el
		// usuario.
		int num;

		// Creamos la variable numAnt como int para almacenar el número anterior
		// introducido por el usuario
		int numAnt = 0;

		// Creamos la variable numFallos como int para contabilizar el número de fallos.
		int numFallos = 0;

		// Creamos la variable numIntrod como int para contabilizar los números
		// introducidos.
		int numIntrod = 0;

		// Creamos el Scanner para leer el número del usuario
		Scanner sc = new Scanner(System.in);

		// Le pedimos al usuario que introduzca un número inicial y lo leemos
		System.out.print("Dime un número inicial: ");
		num = sc.nextInt();

		do {
			
			
			if (num < numAnt) {
				System.out.println("Fallo es menor.");
				numFallos++;
			}
			numAnt = num;
			numIntrod++;
			
			// Le pedimos al usuario que introduzca un número y lo leemos
			System.out.print("Dime un número: ");
			num = sc.nextInt();
		} while (num != 0);

		System.out.println("Total de números introducidos: " + numIntrod);
		System.out.println("Números fallados: " + numFallos);

		// Cierre de Scanner
		sc.close();
	}

}
