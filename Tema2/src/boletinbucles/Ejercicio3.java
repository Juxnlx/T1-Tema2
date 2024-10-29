package boletinbucles;

import java.util.Scanner;

/**
 * Este programa calcula el maximo comun divisor entre dos números que se le
 * solicitarán al usuario.
 */

//PRUEBAS
//ENTRADA: 1, 1 || RESULTADO ESPERADO: 1 || RESULTADO OBTENIDO: 1
//ENTRADA: 100, 125 || RESULTADO ESPERADO: 25 || RESULTADO OBTENIDO: 25
//ENTRADA: 200, 340 || RESULTADO ESPERADO: 20 || RESULTADO OBTENIDO: 20
//ENTRADA: 80, 75 || RESULTADO ESPERADO: 5 || RESULTADO OBTENIDO: 5
public class Ejercicio3 {

	public static void main(String[] args) {

		// Creamos la variable num1 como int para almacenar el primer número introducido
		// por el usuario.
		int num1;

		// Creamos la variable num2 como int para almacenar el segundo número
		// introducido por el usuario.
		int num2;

		// Creamos la variable numMen como int para almacenar cual de los dos números
		// introducidos por el usuario en menor.
		int numMen;

		// Creamos el Scanner para leer los dos números por teclado.
		Scanner sc = new Scanner(System.in);

		// Le pedimos al usuario que introduzca el primer número y lo leemos.
		System.out.print("Introduce el primer número --> ");
		num1 = sc.nextInt();
		
		while (num1 < 1) {
			System.out.println("El número introducido es menor que 1");
			System.out.print("Introduce el primer número --> ");
			num1 = sc.nextInt();
		}

		// Le pedimos al usuario que introduzca el segundo número y lo leemos.
		System.out.print("Introduce el segundo número --> ");
		num2 = sc.nextInt();
		
		while (num2 < 1) {
			System.out.println("El número introducido es menor que 1");
			System.out.print("Introduce el segundo número --> ");
			num2 = sc.nextInt();
		}

		// Comprobamos si el numero 1 es mayor igual que el número 2, si es así el
		// número menor es el número 2.
		if (num1 >= num2) {
			numMen = num2;

			// Si no el número menor es el 1.
		} else {
			numMen = num1;
		}

		// Con este for recorremos desde el número mas pequeño de los dos hasta 1 y en
		// cada iteración vamos restando 1. Para que comprobemos si cada número es
		// divisible por los dos números.
		for (int i = numMen; i >= 1; i--) {
			// Mediante este if comprobamos si el modulo del número 1 y 2 entre la i es 0,
			// si es así es que ese número es divisible y es el primero de todos. Para ello
			// ponemos el break para quedarnos con el primero proque lo mas seguro es que
			// tenga mas de uno en común.
			if ((num1 % i == 0) && (num2 % i == 0)) {
				// Imprimimos la i para mostrar cual es el M.C.D de num1 y num2.
				System.out.println("El M.C.D de " + num1 + " y " + num2 + " es: " + i);
				break;
			}
		}

		// Cierre de Scanner
		sc.close();
	}

}
