package boletinifelse;

import java.util.Scanner;

//Le pedimos al usuario un número decimal y calculamos si el número introducido por el usuario es casi 0 o no. 
public class Ejercicio3 {

	public static void main(String[] args) {

		// Ceamos la variable num como double para almacenar el número decimal
		// introducido por el usuario.
		double num;

		// Creamos el Scanner para pedir el número decimal al usuario por teclado.
		Scanner sc = new Scanner(System.in);

		// Le pedimos al usuario el número por teclado y lo leemos.
		System.out.print("Introduce el primer número --> ");
		num = sc.nextDouble();

		// Comprobamos si el número es mayor que -1, menor que 1 y distinto de 0, si es
		// así imprimimos que el número es casi 0.
		if ((num > -1) && (num < 1) && (num != 0)) {
			System.out.println("El número " + num + " es casi 0.");
			// Si no se cumple la condición anterior entonces imprime que el número no es
			// casi 0.
		} else {
			System.out.println("El número " + num + " no es casi 0.");
		}

		// Cierre de Scanner
		sc.close();
	}

}
