package boletinifelse;

import java.util.Scanner;

/**
 * Este programa solicita al usuario tres números y los ordenamos de mayor a
 * menor.
 */
public class Ejercicio5 {

	public static void main(String[] args) {
		// Creamos la variable num1 como double para almacenar el primer número
		// introducido por el usuario.
		double num1;

		// Creamos la variable num2 como double para almacenar el segundo número
		// introducido por el usuario.
		double num2;

		// Creamos la variable num3 como double para almacenar el tercer número
		// introducido por el usuario.
		double num3;

		// Creamos el Scanner para pedir los números al usuario por teclado.
		Scanner sc = new Scanner(System.in);

		// Le pedimos al usuario el primer número por teclado y lo leemos.
		System.out.print("Introduce el primer número --> ");
		num1 = sc.nextDouble();

		// Le pedimos al usuario el segundo número por teclado y lo leemos.
		System.out.print("Introduce el segundo número --> ");
		num2 = sc.nextDouble();

		// Le pedimos al usuario el segundo número por teclado y lo leemos.
		System.out.print("Introduce el tercer número --> ");
		num3 = sc.nextDouble();

		if (num1 > num2 && num1 > num3) {
			
		} else if (num2 > num1 && num2 > num3) {
			
		} else if (num3 > num1 && num3 > num2) {
			
		}
	}

}
