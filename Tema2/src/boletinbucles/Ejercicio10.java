package boletinbucles;

import java.util.Scanner;

/**
 * Este programa solicita por teclado un número mayor que 0 y el programa nos
 * devuelve si el número introducido es capicua o no.
 */

//PRUEBAS
//ENTRADA: -1 || RESULTADO ESPERADO: "Lo siento el número introducido no es valido" || RESULTADO OBTENIDO: "Lo siento el número introducido no es valido"
//ENTRADA: 0 || RESULTADO ESPERADO: "¡Es capicúa!" || RESULTADO OBTENIDO: "¡Es capicúa!"
//ENTRADA: 54 || RESULTADO ESPERADO: "¡No es capicúa!" || RESULTADO OBTENIDO: "¡No es capicúa!"
//ENTRADA: 99 || RESULTADO ESPERADO: "¡Es capicúa!" || RESULTADO OBTENIDO: "¡Es capicúa!"
//ENTRADA: 100 || RESULTADO ESPERADO: "¡No es capicúa!" || RESULTADO OBTENIDO: "¡No es capicúa!"
//ENTRADA: 545 || RESULTADO ESPERADO: "¡Es capicúa!" || RESULTADO OBTENIDO: "¡Es capicúa!"
//ENTRADA: 999 || RESULTADO ESPERADO: "¡Es capicúa!" || RESULTADO OBTENIDO: "¡Es capicúa!"
//ENTRADA: 1000 || RESULTADO ESPERADO: "¡No es capicúa!" || RESULTADO OBTENIDO: "¡No es capicúa!"
//ENTRADA: 5445 || RESULTADO ESPERADO: "¡Es capicúa!" || RESULTADO OBTENIDO: "¡Es capicúa!"
//ENTRADA: 5454 || RESULTADO ESPERADO: "¡No es capicúa!" || RESULTADO OBTENIDO: "¡No es capicúa!"
//ENTRADA: 5678 || RESULTADO ESPERADO: "¡No es capicúa!" || RESULTADO OBTENIDO: "¡No es capicúa!"
//ENTRADA: 9999 || RESULTADO ESPERADO: "¡Es capicúa!" || RESULTADO OBTENIDO: "¡Es capicúa!"
//ENTRADA: 9102019 || RESULTADO ESPERADO: "¡Es capicúa!" || RESULTADO OBTENIDO: "¡Es capicúa!"
public class Ejercicio10 {

	public static void main(String[] args) {

		// Creamos la variable num como int para almacenar el número introducido por el
		// usuario.
		int num;

		// Creamos la variable numCopia como int para almacenar una copia una copia del
		// número introducido por el usuario, para no modificar la introducida por el
		// usuario.
		int numCopia = 0;

		// Creamos la variable numInversa como int para almacenar el número introducido
		// por el usuario pero leido de derecha a izquierda.
		int numInversa = 0;

		// Creamos la variable divisor para ir almacenando el divisor por el que debemos
		// de multiplicar luego nuestro ultimo digito del número.
		int divisor = 0;

		// Creamos la variable finalCifraNum como int para almacenar la ultima cifra del
		// número.
		int finalCifraNum = 0;

		// Creamos el Scanner para leer el número introducido por el usuario.
		Scanner sc = new Scanner(System.in);

		// Le pedimos al usuario que introduzca el número y lo leemos por primera vez.
		System.out.println("Introduce un número --> ");
		num = sc.nextInt();

		// Creamos un bucle while para comprobar si el número introducido por el usuario
		// es menor o igual que 0.
		while (num < 0) {
			// Mostramos un mensaje de que el número introducido no es valido.
			System.out.println("Lo siento el número introducido no es valido");
			// Le pedimos al usuario que introduzca el número y lo leemos
			System.out.println("Introduce un número --> ");
			num = sc.nextInt();
		}

		// El primer paso es asignar a la variable nunCopia el valor del número para no
		// modificar el valor introducido por el usuario.
		numCopia = num;

		// Comprobamos si la copia del número es distinto de 0, si es así entramos en el
		// bucle. Esto lo hacemos porque iremos quitando la ultima cifra al número hasta
		// quedarse a 0.
		while (numCopia != 0) {
			// Este for nos devuelve el divisor mas alto posible segun el número
			// introducido, por ejemplo en el caso de 7894 nos devuelve 1000. Porque el
			// incremneto va de 10, 100, 100, etc.
			for (int i = 1; i <= numCopia; i *= 10) {
				// Asignamos a la variable "divisor" el divisor mas alto posible sin sobrepasar
				// nuestro número.
				divisor = i;
			}
			// En la variable finalCifraNum almacenaremos la ultima cifra del número, para
			// luego colocarla la primera. La ultima cifra la conseguimos con el modulo de
			// 10.
			finalCifraNum = numCopia % 10;

			// En la variable numInversa vamos concatenando en cada vuelta esa ultima cifra
			// calculada anteriormente y la multiplicamos por el divisor que hemos calculado
			// anteriormente. Esto lo hacemos para que esa ultima cifra pase a ser la
			// primera.
			numInversa += finalCifraNum * divisor;

			// Por ultimo la copia del número introducido por el usuario la vamos dividiendo
			// entre 10 para quedarnos con el número pero si la ultima cifra porque ya la
			// hemos usado anteriormente.
			numCopia /= 10;
		}

		// Ya solo nos queda comprobar si el número a la inversa es igual al número
		// introducido por el usuario.
		if (numInversa == num) {
			// Mostramos un mensaje felicitando al usuario de que el número introducido es
			// capicua.
			System.out.println("¡ENHORABUENA! El número " + num + " es CAPICÚA");
			// Si no
		} else {
			// Mostramos un mensaje diciendo que el número introducido por el usuario no es
			// capicúa.
			System.out.println("¡LO SIENTO! El número " + num + " NO ES CAPICÚA");
		}

		// Cierre de Scanner.
		sc.close();
	}

}
