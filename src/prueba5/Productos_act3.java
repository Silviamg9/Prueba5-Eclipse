package prueba5;

public class Productos_act3 {

	private String nombre;
	private int cantDisponible;
	private double precio;
	private int stockSeguridad = 50;
	
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

	public int getStockSeguridad() {
		return stockSeguridad;
	}

	public void setStockSeguridad(int stockSeguridad) {
		this.stockSeguridad = stockSeguridad;
	}
	
	public void buscar (String nombre) {
		this.nombre = nombre;
	}
	
	public void actualizar (int stock) {
		
	}
	
	public void calcular (double precio) {
		
	}

	public String toString() {
		return "Productos_act3 [Nombre = " + nombre + ", CantDisponible = " + cantDisponible + ", Precio = " + precio + "]";
	}
	
}
