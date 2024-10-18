package boletindowhile;

/**
 * Este programa muestra por pantalla los 20 primeros números naturales.
 */
class Ejercicio1 {

	public static void main(String[] args) {

		// Creamos la variable num como int para ir almacenando e imprimiendo números.
		int num = 1;

		// Mensaje imprimiendo el la lista de números naturales.
		System.out.print("Números del 1 - 20: ");

		// Ejecutamos en primer lugar el primer número que es 1 y luego incrementamos el
		// número en 1.
		do {
			System.out.print(num + ", ");
			num++;
			// Si el número es menor igual a 20 se sigue ejecutando.
		} while (num <= 20);

	}

}
