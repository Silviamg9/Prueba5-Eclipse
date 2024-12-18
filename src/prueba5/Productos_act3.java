package prueba5;

public class Productos_act3 {

	private String nombre;
	private int cantDisponible;
	private double precio;
	
	public Productos_act3 (String nombre, int cantDisponible, double precio) {
		this.nombre = nombre;
		this.cantDisponible = cantDisponible;
		this.precio = precio;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCantDisponible() {
		return cantDisponible;
	}

	public void setCantDisponible(int cantDisponible) {
		this.cantDisponible = cantDisponible;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	public void mostrarProducto() {
        System.out.println("Nombre: " + nombre + ", Cantidad Disponible: " + cantDisponible + ", Precio: " + precio);
    }
}
