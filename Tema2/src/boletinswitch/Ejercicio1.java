package boletinswitch;

import java.util.Scanner;

/**
 * Este programa pide la nota al usuario y muestra la calificación del examen
 * como una cadena.
 */
public class Ejercicio1 {

	public static void main(String[] args) {

		// Creamos la variable nota como int para almacenar la nota introducida por el
		// usuario.
		int nota;

		// Creamos el Scanner para leer la nota introducida por el esuario por teclado.
		Scanner sc = new Scanner(System.in);

		// Le pedimos al usuario que introduzca la nota y la leemos por teclado.
		System.out.print("Introduce la nota --> ");
		nota = sc.nextInt();

		// Pasamos nuestra variable nota como parametro y dependiendo de la nota
		// introducida se ejecutara un case u otro y se mostrará un mensaje u otro.
		switch (nota) {
		case 0, 1, 2, 3, 4 -> System.out.println("Resultado nota: ¡INSUFICIENTE!");
		case 5 -> System.out.println("Resultado nota: ¡SUFICIENTE!");
		case 6 -> System.out.println("Resultado nota: ¡BIEN!");
		case 7, 8 -> System.out.println("Resultado nota: ¡NOTABLE!");
		case 9, 10 -> System.out.println("Resultado nota: ¡SOBRESALIENTE!");
		default -> System.out.println("La nota introducida no es valida.");
		}

		// Cierre de Scanner
		sc.close();
	}

}
