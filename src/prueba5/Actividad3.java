package prueba5;

import java.util.*;

public class Actividad3 {

	static String[] productos = new String[100];
    static int[] stock = new int[100];
    static double[] precios = new double[100];
    static int numProductos = 0;
    static final int STOCK_SEGURIDAD = 50;
    
	public static void main(String[] args) {
		var sc = new Scanner(System.in);
		
		productos[numProductos] = "Camiseta";
        stock[numProductos] = 100;
        precios[numProductos] = 12.00;
        numProductos++;

        productos[numProductos] = "Sudadera";
        stock[numProductos] = 70;
        precios[numProductos] = 20.00;
        numProductos++;

        int opcion;
        do {
            mostrarMenu();
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    introducirDatosInventario(sc);
                    break;
                case 2:
                    nuevoProducto(sc);
                    break;
                case 3:
                    buscarYModificarProducto(sc);
                    break;
                case 4:
                    eliminarProducto(sc);
                    break;
                case 5:
                    mostrarValorTotalInventario();
                    break;
                case 6:
                    informeRoturaStock();
                    break;
                case 7:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        } while (opcion != 7);

        sc.close();
    }

    public static void mostrarMenu() {
        System.out.println("\nGestión de Inventario:");
        System.out.println("1. Introducir datos nuevo inventario");
        System.out.println("2. Nuevo producto");
        System.out.println("3. Buscar producto y modificar información");
        System.out.println("4. Eliminar producto");
        System.out.println("5. Mostrar valor total del inventario");
        System.out.println("6. Informe rotura de stock");
        System.out.println("7. Salir");
        System.out.print("Seleccione una opción: ");
    }

    public static void introducirDatosInventario(Scanner sc) {
        System.out.print("Ingrese el número de productos a introducir: ");
        int cantidad = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < cantidad; i++) {
            System.out.print("Ingrese el nombre del producto: ");
            productos[numProductos] = sc.nextLine();
            System.out.print("Ingrese el stock del producto: ");
            stock[numProductos] = sc.nextInt();
            System.out.print("Ingrese el precio del producto: ");
            precios[numProductos] = sc.nextDouble();
            sc.nextLine();
            numProductos++;
        }
    }

    public static void nuevoProducto(Scanner sc) {
        System.out.print("Ingrese el nombre del nuevo producto: ");
        productos[numProductos] = sc.nextLine();
        System.out.print("Ingrese el stock del nuevo producto: ");
        stock[numProductos] = sc.nextInt();
        System.out.print("Ingrese el precio del nuevo producto: ");
        precios[numProductos] = sc.nextDouble();
        sc.nextLine();
        System.out.println("Producto añadido correctamente.");
    }

    public static void buscarYModificarProducto(Scanner sc) {
        System.out.print("Ingrese el nombre del producto a modificar: ");
        String nombre = sc.nextLine();

        for (int i = 0; i < numProductos; i++) {
            if (productos[i].equalsIgnoreCase(nombre)) {
                System.out.print("Nuevo stock para " + nombre + ": ");
                stock[i] = sc.nextInt();
                System.out.print("Nuevo precio para " + nombre + ": ");
                precios[i] = sc.nextDouble();
                sc.nextLine();
                System.out.println("Producto modificado correctamente.");
                return;
            }
        }
        System.out.println("Producto no encontrado.");
    }

    public static void eliminarProducto(Scanner sc) {
        System.out.print("Ingrese el nombre del producto a eliminar: ");
        String nombre = sc.nextLine();

        for (int i = 0; i < numProductos; i++) {
            if (productos[i].equalsIgnoreCase(nombre)) {
            	
                for (int j = i; j < numProductos - 1; j++) {
                    productos[j] = productos[j + 1];
                    stock[j] = stock[j + 1];
                    precios[j] = precios[j + 1];
                }
                numProductos--;
                System.out.println("Producto eliminado correctamente.");
                return;
            }
        }
        System.out.println("Producto no encontrado.");
    }

    public static void mostrarValorTotalInventario() {
        double total = 0;
        for (int i = 0; i < numProductos; i++) {
            total += stock[i] * precios[i];
        }
        System.out.println("El valor total del inventario es: " + total);
    }

    public static void informeRoturaStock() {
        System.out.println("Informe de productos con stock bajo el límite de seguridad:");
        for (int i = 0; i < numProductos; i++) {
            if (stock[i] < STOCK_SEGURIDAD) {
                System.out.println(productos[i] + " - Stock: " + stock[i]);
            }
        }
    }
}
