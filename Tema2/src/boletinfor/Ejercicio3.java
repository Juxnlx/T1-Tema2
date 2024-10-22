package boletinfor;

import java.util.Scanner;

/**
 * Este programa nos muestra la media de 10 números que se le pediran al usuario
 * por teclado.
 */
public class Ejercicio3 {

	public static void main(String[] args) {

		// Creamos la variable num como int para ir almacenando temporalmente los
		// números que vaya introduciendo el usuario.
		int num;

		// Creamos la variable sumaNumeros como int para almacenar el valor de la suma
		// de todos los números introducidos por el usuario.
		int sumaNumeros = 0;

		// Creamos el Scanner para leer los 10 números introducidos por el usuario por
		// teclado.
		Scanner sc = new Scanner(System.in);

		for (int i = 1; i <= 10; i++) {
			// Le vamos solicitando 10 veces al usuario un números y lo leemos
			System.out.println("Introduce un número --> ");
			num = sc.nextInt();

			// Le vamos asignando a nuestra variable sumaNumeros la suma de todos los
			// números que vayamos introduciendo.
			sumaNumeros += num;
		}

		// Imprimimos un mensaje mostrando la media de todos los números introducidos
		// por el usuario. También, tenemos que hacer un cast a float para que nos
		// imprima tambien la parte decimal.
		System.out.println("La media de todos estos números es: " + (float) sumaNumeros / 10);

		// Cierre de Scanner
		sc.close();
	}

}
