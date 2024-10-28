package boletinbucles;

import java.util.Scanner;

/**
 * Este programa solicita por teclado un número mayor que 0 y el programa nos
 * devuelve si el número introducido es capicua o no.
 */
public class Ejercicio10 {

	public static void main(String[] args) {

		// Creamos la variable num como int para almacenar el número introducido por el
		// usuario.
		int num;

		// Creamos la variable numCopia como int para almacenar el número introducido
		// por el usuario pero a la inversa.
		int numCopia = 0;

		// Creamos la variable esCapicua como boolean para nombrar si el número es
		// capicua o no con un true o false.
		boolean esCapicua;
		
		int multiplicador = 0;
		
		int peo = 0;

		// Creamos el Scanner para leer el número introducido por el usuario.
		Scanner sc = new Scanner(System.in);

		// Creamos un bucle do-while para volver a preguntar el número si el introducido
		// es menor que 0.
		do {
			// Le pedimos al usuario que introduzca el número y lo leemos
			System.out.println("Introduce un número --> ");
			num = sc.nextInt();
			// Comprobamos si el número es menor o igual a 0, si es así entramos en el bucle
			// y volvemos a preguntar el número.
		} while (num <= 0);
			
		while(num != 0) {
			for (int i = 1; i <= num; i*=10) {
				
				multiplicador = i;
			}
			peo = num%10;
			numCopia += peo*multiplicador;
			num/= 10;
		}
		
		System.out.println(numCopia);
		
			if (numCopia == num) {
				esCapicua = true;
			} else {
				esCapicua = false;
			}
			
		
		System.out.println(esCapicua);
	}

}
