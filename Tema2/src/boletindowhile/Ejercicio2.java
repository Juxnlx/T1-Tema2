package boletindowhile;

//Este programa muestra los números pares entre el 1 y 200
public class Ejercicio2 {

	public static void main(String[] args) {

		// Creamos la variable num como int para ir almacenando e imprimiendo números.
		// La inicializamos en 2 porque es el primer núemro par.
		int num = 2;

		// Mensaje imprimiendo la lista de números pares hasta el 200.
		System.out.println("Números pares 1 - 200: ");

		do {
			// Comprobamos si el número es par, si es así imprimimos el número.
			if (num % 2 == 0) {
				System.out.print(num + ", ");
			}
			// Incrementamos el número en 1.
			num++;

			// Comprobamos si el número es menor igual que 200.
		} while (num <= 200);

	}

}
