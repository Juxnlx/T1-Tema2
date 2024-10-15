package boletinwhile;

import java.util.Scanner;

/**
 * Este programa pide al usuario la altura de los arboles en centimetros y el
 * programa debe de mostrar cual es la altura del arbol mal alto.
 */
public class Ejercicio6 {

	public static void main(String[] args) {

		// Creamos la variable medidaArbol como int para almacenar la altura de los
		// arboles introducidos por el usuario.
		int medidaArbol = 0;

		// Creamos la variable arbolmayor como int para almacenar la altura del arbol
		// mas alto.
		int arbolMayor = 0;

		// Creamos el Scanner para leer las medidas de cada arbol.
		Scanner sc = new Scanner(System.in);

		// Creamos el while con la siguiente condición, si mediaArbol es distinto a -1,
		// no pasa.
		while (medidaArbol != -1) {

			// Le preguntamos al usuario que introduzca la medidida del arbol y la leemos.
			System.out.print("Introduce la altura del arbol en cm --> ");
			medidaArbol = sc.nextInt();

			// Comprobamos si la altura mas alta registrada es mas pequeña que la nueva
			// medida, si es así entonces a la altura mas alta se le asigna la nueva media
			// introducida por el usuario, si no se queda con la que tenia anteriormente.
			if (arbolMayor <= medidaArbol) {
				arbolMayor = medidaArbol;
			}
		}

		// Comprobamos si la altura mas alta del arbol es 0 entonces el arbol no existe.
		if (arbolMayor == 0) {
			System.out.println("Ese arbol no existe");
			// Si no, imprimimos la altura mas alta del arbol.
		} else {
			System.out.println("El arbol mas alto mide " + arbolMayor + " cm");
		}

		// Cierre de Scanner
		sc.close();
	}

}
