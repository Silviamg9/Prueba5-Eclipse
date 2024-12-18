package prueba5;

import java.util.*;

public class Actividad1 {

	public static void main(String[] args) {
		var sc = new Scanner(System.in);
		
		System.out.println("Introducir una frase: ");
		String palabra = sc.nextLine();
		
		int caracteres = palabra.length();
		char mayorLong;
		char menorLong;
		
		for (int i = 1; i > palabra.length(); i++) {
			mayorLong = palabra.charAt(i);
		}
		
		for (int i = 1; i < palabra.length(); i++) {
			menorLong = palabra.charAt(i);
		}
		
		
		System.out.println("La palabra de mayor longitud es: " + mayorLong);
		System.out.println("La palabra de menor longitud es: " + menorLong);
		System.out.println("El número de caracteres de esta frase es: " + caracteres);
		
		sc.close();
	}
}
