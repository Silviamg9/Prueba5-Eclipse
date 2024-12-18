package prueba5;

import java.util.*;

public class Actividad1 {

	public static void main(String[] args) {
		var sc = new Scanner(System.in);
		
		System.out.println("Introducir una frase: ");
		String frase = sc.nextLine().trim();
		
		int numPalabras = 0;
        String palabraMayor = "";
        String palabraMenor = null;
        String palabraActual = "";

        for (int i = 0; i < frase.length(); i++) {
            char c = frase.charAt(i);

            if (c == ' ') {
                if (palabraActual.length() > 0) {
                    numPalabras++;

                    if (palabraActual.length() > palabraMayor.length()) {
                        palabraMayor = palabraActual;
                    }
                    if (palabraMenor == null || palabraActual.length() < palabraMenor.length()) {
                        palabraMenor = palabraActual;
                    }

                    palabraActual = "";
                }
            } else {
                palabraActual += c;
            }
        }

        if (palabraActual.length() > 0) {
            numPalabras++;

            if (palabraActual.length() > palabraMayor.length()) {
                palabraMayor = palabraActual;
            }
            if (palabraMenor == null || palabraActual.length() < palabraMenor.length()) {
                palabraMenor = palabraActual;
            }
        }
        
        System.out.println("Número de palabras de la frase es " + numPalabras);
        System.out.println("La palabra de mayor longitud es " + palabraMayor + "' con " + palabraMayor.length() + " caracteres.");
        System.out.println("La palabra de menor longitud es " + palabraMenor + "' con " + palabraMenor.length() + " caracteres.");
		
		sc.close();
	}
}
