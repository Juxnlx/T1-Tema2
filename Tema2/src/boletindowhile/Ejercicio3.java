package boletindowhile;

import java.util.Scanner;

/**
 * Este programa nos devuelve la suma de todos los números hasta el número que
 * introduzcamos por teclado.
 */
public class Ejercicio3 {

	public static void main(String[] args) {

		// Creamos la variable num como int que sera el número introducido por e usuario
		// y hasta donde hay que sumar.
		int numUsuario;

		// Creamos la variable num como int para ir alamacenando los número que se van
		// sumando hasta llegar al número introducido por el usuario. Lo incrementamos
		// en 1 porque la suma va a empezar en 1.
		int num = 1;

		// Creamos la variable resultSuma como int para almacenar el valor de la suma de
		// todos los números hasta el introducido por el usuario.
		int resultSuma = 0;

		// Creamos el Scanner para leer el número tope al usuario.
		Scanner sc = new Scanner(System.in);

		// Le pedimos al usuario que introduzca el número hasta donde queremos que
		// llegue la suma
		System.out.print("Introduce el número hasta donde desea sumar --> ");
		numUsuario = sc.nextInt();

		do {
			// A la suma le vamos sumando el número.
			resultSuma += num;
			// Al número num le incrementamos 1 en cada vuelta.
			num++;
			// Comprobamos si el número que se va incrementando es menor o igual al
			// introducido por el usuario que es el número tope.
		} while (num <= numUsuario);

		//Imprimimos el resultado de la suma
		System.out.println("Resultado de la suma es --> " + resultSuma);
		
		//Cierre de Scanner
		sc.close();
	}

}
