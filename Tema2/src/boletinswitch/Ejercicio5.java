package boletinswitch;

import java.util.Scanner;

/**
 * Este programa le pide al usuario la letra del tipo de carnet y el programa
 * imprime el tipo de carnet correspondiente a la letra introducida.
 */
public class Ejercicio5 {

	public static void main(String[] args) {

		// Creamos la variable letraCarnet como String para almacenar la letra de tipo
		// carnet introducida por el usuario.
		String letraCarnet;

		// Creamos el Scanner para leer por teclado la letra introducida por el usuario.
		Scanner sc = new Scanner(System.in);

		// Le pedimos al usuario que introduzca la letra correspondiente al carnet de
		// conducir.
		System.out.println("Tipos disponibles: E, D, C1, C5, A, B1, B2");
		System.out.print("Introduce la letra que deseé --> ");
		letraCarnet = sc.nextLine();

		// Creamos el switch pasando por parametro la letra que le hemos pedido al
		// usuario y nos mostrara dependiendo del caso donde entre un tipo de carnet u
		// otro.
		switch (letraCarnet) {
		case "E" ->
		System.out.println("Tipo carnet --> REMOLQUES");
		case "D" ->
		System.out.println("Tipo carnet --> AUTOBUSES");
		case "C1", "C2" ->
		System.out.println("Tipo carnet --> CAMIONES");
		case "A" ->
		System.out.println("Tipo carnet --> MOTOCICLETAS");
		case "B1", "B2" ->
		System.out.println("Tipo carnet --> AUTOMÓVILES");
		default ->
		System.out.println("Categoría no contemplada");
		}
		
		//Cierre de Scanner
		sc.close();

	}

}
