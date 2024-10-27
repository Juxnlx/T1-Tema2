package boletinbucles;

import java.util.Scanner;

/**
 * Este programa calcula el maximo comun divisor entre dos números que se le
 * solicitarán al usuario.
 */
public class Ejercicio3 {

	public static void main(String[] args) {

		// Creamos la variable num1 como int para almacenar el número introducido
		// por el usuario.
		int num1;

		// Creamos la variable num2 como int para almacenar el segundo número
		// introducido por el usuario.
		int num2;

		// Creamos la variable numMay como int para alamcenar cual de los dos números
		// introducidos por el usuario en mayor.
		int numMay;

		// Creamos la variable maxD como int para alamcenar el M.C.D de estos dos
		// números.
		int maxD;

		// Creamos el Scanner para leer los dos números por teclado.
		Scanner sc = new Scanner(System.in);

		// Le pedimos al usuario que introduzca el primer número y lo leemos.
		System.out.print("Introduce el primer número --> ");
		num1 = sc.nextInt();

		// Le pedimos al usuario que introduzca el segundo número y lo leemos.
		System.out.print("Introduce el segundo número --> ");
		num2 = sc.nextInt();

		if (num1 <= num2) {
			numMay = num2;
		} else {
			numMay = num1;
		}

		for (int i = 2; numMay >= 0; i--) {

		}

	}

}
