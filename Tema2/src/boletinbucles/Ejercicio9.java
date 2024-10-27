package boletinbucles;

import java.util.Scanner;

/**
 * Este programa nos solicita un número por teclado mayor que 0 y el programa
 * nos muestra cuantas cifras tiene ese número.
 */
public class Ejercicio9 {

	public static void main(String[] args) {

		// Creamos la variable num como int para almacenar el número introducido por el
		// usuario del que queremos saber su número de cifras
		int num;

		// Creamos la variable contCifras como int para alamacenar las cifras del número
		// introducido por el usuario.
		int contCifras = 0;

		// Creamos el Scanner para leer el número introducido por el usuario
		Scanner sc = new Scanner(System.in);

		do {
			// Le pedimos al usuario que introduzca un número y lo leemos
			System.out.print("Introduce un número --> ");
			num = sc.nextInt();
			// Comprobamos si el numero es menor o igual a 0, si es así volvemos a pedir un
			// número.
		} while (num <= 0);

		// Comprobamos si el modulo del número entre la i es igual que el número, si es
		// así incrementamos el contCifras en 1 y en la siguiente interación vamos
		// multiplicando el número por 10 y asi vamos probando con 10, 100, 1000, etc.
		for (int i = 1; num % i != num; i *= 10) {
			contCifras++;
		}

		// Imprimimos el número de cifras del número introducido por el usuario.
		System.out.println("Número de cifras de " + num + ": " + contCifras);
		
		//Cierre de Scanner 
		sc.close();
	}

}
