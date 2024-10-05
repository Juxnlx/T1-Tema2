package boletinifelse;

import java.util.Scanner;

/**
 * Este programa pide al usuario un número por teclado entre 0 y 99999 y el
 * programa debe de calcular cuantas cifras tiene ese número introducido por el
 * usuaio.
 */
public class Ejercicio7 {

	public static void main(String[] args) {

		// Creamos la variable num como int para almacenar el valor introducido por el
		// usuario.
		int num;

		// Creamos el Scanner para poder leer el número del usuario por teclado.
		Scanner sc = new Scanner(System.in);

		// Le pedimos al usuario que introduzca un número y lo leemos.
		System.out.print("Introduce un número entre 0 y 99999 --> ");
		num = sc.nextInt();

		// Comprobamos mediante el condicional if si el número se encuentra entre el 0 y
		// el 9. Si es así, imprimimos que el número introducido tiene una cifra y asi
		// con los demas mediante un else-if.
		if (num >= 0 && num < 10) {
			System.out.println("El número introducido es de 1 cifra.");
		} else if (num >= 10 && num < 100) {
			System.out.println("El número introducido es de 2 cifras");
		} else if (num >= 100 && num < 1000) {
			System.out.println("El número introducido es de 3 cifras");
		} else if (num >= 1000 && num < 10000) {
			System.out.println("El número introducido es de 4 cifras");
		} else if (num >= 10000 && num < 100000) {
			System.out.println("El número introducido es de 5 cifras");
			// Con este else comprobamos si el el número introducido por el usuario no esta
			// comprendido entre 0 y 99999, si es así, imprimimos que el número introducido
			// no es valido.
		} else {
			System.out.println("El número introducido no es valido");
		}

		// Cierre de Scanner
		sc.close();
	}

}
