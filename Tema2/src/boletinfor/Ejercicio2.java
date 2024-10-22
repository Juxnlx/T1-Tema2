package boletinfor;

import java.util.Scanner;

/**
 * Este programa nos muestra solo los multiplos de 3 hasta el número introducido
 * por el usuario.
 */
public class Ejercicio2 {

	public static void main(String[] args) {
		// Creamos la variable numFinal como int para almacenar el número introducido
		// por el usuario hasta donde se desea llegar.
		int numFinal;

		// Creamos el Scanner para leer el número introducido por el usuario por teclado
		Scanner sc = new Scanner(System.in);

		// Le pedimos al usuario que introduzca un número y lo leemos
		System.out.print("Introduce el número hasta donde quieres llegar --> ");
		numFinal = sc.nextInt();

		// Imprimimos un titulo para lo que se va a mostrar a continuación.
		System.out.println();
		System.out.println("Numeros multiplos de 3 del 1 hasta el " + numFinal + ":");

		// Creamos el for para imprimir los números hasta el introducido por el usuario,
		// inicializamos el contador en 0 la condición debe de ser menor o igual al
		// número del usuario y en cada interación incrementamos 3 y asi sabemos los
		// multiplos de 3 contando de 3 en 3.
		for (int i = 0; i <= numFinal; i += 3) {

			// Vamos imprimiendo los números de 3 en 3.
			System.out.print(i + ", ");
		}

		// Cierre de Scanner
		sc.close();

	}

}
