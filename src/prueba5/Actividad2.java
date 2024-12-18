package prueba5;

import java.util.*;

public class Actividad2 {

	public static void main(String[] args) {
		var sc = new Scanner(System.in);
		
		int entradasPrincipal = 1000;
        int entradasPlatea = 200;
        int entradasVip = 25;

        int opcion;

        do {
            System.out.println("\n--- Menú ConcertSala ---");
            System.out.println("1. Mostrar número de entradas libres");
            System.out.println("2. Vender entradas");
            System.out.println("3. Salir");
            System.out.print("Elige una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("\nEntradas disponibles:");
                    System.out.println("Zona Principal: " + entradasPrincipal);
                    System.out.println("Zona Platea: " + entradasPlatea);
                    System.out.println("Zona VIP: " + entradasVip);
                    break;

                case 2:
                    System.out.println("\n¿Para qué zona quieres las entradas?");
                    System.out.println("1. Principal");
                    System.out.println("2. Platea");
                    System.out.println("3. VIP");
                    System.out.print("Elige una zona: ");
                    int zona = sc.nextInt();

                    System.out.print("¿Cuántas entradas quieres? ");
                    int cantidad = sc.nextInt();

                    if (zona == 1) {
                        if (cantidad <= entradasPrincipal) {
                            entradasPrincipal -= cantidad;
                            System.out.println("¡Venta realizada! Quedan " + entradasPrincipal + " entradas en la zona Principal.");
                        } else {
                            System.out.println("No hay suficientes entradas disponibles en la zona Principal.");
                        }
                    } else if (zona == 2) {
                        if (cantidad <= entradasPlatea) {
                            entradasPlatea -= cantidad;
                            System.out.println("¡Venta realizada! Quedan " + entradasPlatea + " entradas en la zona Platea.");
                        } else {
                            System.out.println("No hay suficientes entradas disponibles en la zona Platea.");
                        }
                    } else if (zona == 3) {
                        if (cantidad <= entradasVip) {
                            entradasVip -= cantidad;
                            System.out.println("¡Venta realizada! Quedan " + entradasVip + " entradas en la zona VIP.");
                        } else {
                            System.out.println("No hay suficientes entradas disponibles en la zona VIP.");
                        }
                    } else {
                        System.out.println("Zona no válida.");
                    }
                    break;

                case 3:
                    System.out.println("¡Gracias por usar el sistema de ConcertSala!");
                    break;

                default:
                    System.out.println("Opción no válida. Intenta de nuevo.");
                    break;
            }
        } while (opcion != 3);

        sc.close();
	}
}
