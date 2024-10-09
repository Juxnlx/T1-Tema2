package boletinswitch;

import java.util.Scanner;

/**
 * Este programa nos pide un número entre 1 y 7 y nos muestra el día de la
 * semana correspondiente a ese número.
 */
public class Ejercicio2 {

	public static void main(String[] args) {

		// Creamos la variable numSemana como int para almacenar el número introducido
		// por el usuario correspondiente a un dia de la semana.
		int numSemana;

		// Creamos el Scanner para pedir el núemro por teclado al usuario.
		Scanner sc = new Scanner(System.in);

		// Le pedimos al usuario el número y lo leemos por teclado.
		System.out.print("Introduce un número entre 1 y 7 --> ");
		numSemana = sc.nextInt();

		// Pasamos como parametro el número correspondiente a un día de la semana y se
		// imprime Lunes si es 1 y así con los demas números. En caso de otro número que
		// no este controlado en los case se imprime que ese número no corresponde a
		// ningun día de la semana.
		switch (numSemana) {
		case 1 -> System.out.println("Día de la semana --> LUNES");
		case 2 -> System.out.println("Día de la semana --> MARTES");
		case 3 -> System.out.println("Día de la semana --> MIERCOLES");
		case 4 -> System.out.println("Día de la semana --> JUEVES");
		case 5 -> System.out.println("Día de la semana --> VIERNES");
		case 6 -> System.out.println("Día de la semana --> SABADO");
		case 7 -> System.out.println("Día de la semana --> DOMINGO");
		default -> System.out.println("El número introducido no corresponde a ningun día de la semana");
		}

		// Cierre de Scanner
		sc.close();

	}

}
