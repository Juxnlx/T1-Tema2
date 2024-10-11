package bolentincondicionalesifyswitch;

import java.util.Scanner;

/**
 * Este programa le pide un número al usuario y el programa muestra el valor
 * absoluto.
 */

// PRUEBAS
// ENTRADA: 0 || RESULTADO ESPERADO: 0|| RESULTADO OBTENIDO: 0
// ENTRADA: -1 || RESULTADO ESPERADO: 1|| RESULTADO OBTENIDO: 1
// ENTRADA: 1 || RESULTADO ESPERADO: -1|| RESULTADO OBTENIDO: -1

public class Ejercicio2 {

	public static void main(String[] args) {

		// Creamos la variable num com int para almacenar el número introducido por el
		// usuario.
		int num;

		// Creamos el Scanner para leer por teclado el número introducido por el
		// usuario.
		Scanner sc = new Scanner(System.in);

		// Le pedimos al uasuario que introduzca un número y lo leemos por teclado
		System.out.print("Introduce un número --> ");
		num = sc.nextInt();

		// Comprobamos si el número es negativo, si es así lo multiplicamos por -1 para
		// pasarlo a positivo. Si la condición no se cumple y por lo tanto el número es
		// positivo se muestra tal cual.
		num = num < 0 ? -1 * num : num;

		// Mostramos el valor absoluto del número introducido por el usuario.
		System.out.println();
		System.out.println(num);

		// Cierre de Scanner
		sc.close();
	}

}
