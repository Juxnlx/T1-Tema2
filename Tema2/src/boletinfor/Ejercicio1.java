package boletinfor;

import java.util.Scanner;

/**
 * Este programa pide un número por teclado y el programa devuelve todos los
 * números del 1 al introducido por el usuario.
 */
public class Ejercicio1 {

	public static void main(String[] args) {

		// Creamos la variable numFinal como int para almacenar el número introducido
		// por el usuario hasta donde se desea llegar.
		int numFinal;

		// Creamos el Scanner para leer el número introducido por el usuario por teclado
		Scanner sc = new Scanner(System.in);

		// Le pedimos al usuario que introduzca un número y lo leemos
		System.out.print("Introduce el número hasta donde quieres contar --> ");
		numFinal = sc.nextInt();

		// Imprimimos un titulo para lo que se va a mostrar a continuación.
		System.out.println();
		System.out.println("Numeros del 1 hasta el " + numFinal + ":");

		// Creamos el for para imprimir los números hasta el introducido por el usuario,
		// inicializamos el contador en 1 la condición debe de ser menor o igual al
		// número del usuario y en cada interación incrementamos en 1.
		for (int i = 1; i <= numFinal; i++) {

			// Vamos imprimiendo los números 1 a 1.
			System.out.print(i + ", ");
		}

		// Cierre de Scanner
		sc.close();
	}

}
