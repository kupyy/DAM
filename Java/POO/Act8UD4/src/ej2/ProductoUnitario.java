package ej2;

public class ProductoUnitario extends Producto implements IPrecio {
	private int cantidad;
	private double precio;
	
	public ProductoUnitario(String nombre, String categoria, int cantidad, double precio) {
		super(nombre, categoria);
		this.cantidad = cantidad;
		this.precio = precio;
	}	
	
	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public double getImporteTotal() {
		return cantidad*precio;
	}

	@Override
	public String imprimir() {
		return this.getNombre() + ", " + cantidad + " * " + precio+ " = " + getImporteTotal();
	}


}
