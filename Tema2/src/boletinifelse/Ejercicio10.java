package boletinifelse;

import java.util.Scanner;

/**
 * Este programa le pide al usuario 3 números y tenemos que comprobar si la suma
 * de dos de esos números es igual al otro número. Si es así el programa nos
 * mostrara que sí.
 */
public class Ejercicio10 {

	public static void main(String[] args) {

		// Creamos la variable num1 como int para almacenar el primer valor introducido
		// por el usuario.
		int num1;

		// Creamos la variable num2 como int para almacenar el segundo valor introducido
		// por el usuario.
		int num2;

		// Creamos la variable num3 como int para almacenar el tercer valor introducido
		// por el usuario.
		int num3;

		// Creamos el Scanner para leer los 3 números introducidos por el usuario.
		Scanner sc = new Scanner(System.in);

		// Le pedimos al usuario que introduzca el primer número y lo leemos.
		System.out.print("Introduce el primer número --> ");
		num1 = sc.nextInt();

		// Le pedimos al usuario que introduzca el segundo número y lo leemos.
		System.out.print("Introduce el segundo número --> ");
		num2 = sc.nextInt();

		// Le pedimos al usuario que introduzca el tercer número y lo leemos.
		System.out.print("Introduce el tercer número --> ");
		num3 = sc.nextInt();

		// Comprobamos todas las combinaciones de sumas de dos números posibles para ver
		// si el resultado de esa suma es igual al número restante. Y si no se da
		// ninguna de estas combianciones es que el resultado de cualquier suma nunca va
		// a dar el número restante, si se da este caso tambien se mostraría por
		// pantalla.
		if ((num1 + num2) == num3) {
			System.out.println("La suma de " + num1 + " + " + num2 + " = " + num3);
		} else if ((num1 + num3) == num2) {
			System.out.println("La suma de " + num1 + " + " + num3 + " = " + num2);
		} else if ((num2 + num1) == num3) {
			System.out.println("La suma de " + num2 + " + " + num1 + " = " + num3);
		} else if ((num2 + num3) == num1) {
			System.out.println("La suma de " + num2 + " + " + num3 + " = " + num1);
		} else if ((num3 + num1) == num2) {
			System.out.println("La suma de " + num3 + " + " + num1 + " = " + num2);
		} else if ((num3 + num2) == num1) {
			System.out.println("La suma de " + num3 + " + " + num2 + " = " + num1);
		} else {
			System.out.println("La combinación de ninguna suma da el resultado de otro número");
		}

		// Cierre de Scanner
		sc.close();

	}

}
