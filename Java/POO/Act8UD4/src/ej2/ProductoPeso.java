package ej2;

public class ProductoPeso extends Producto implements IPrecio {
	private double peso;
	private double precioPorPeso;
	
	public ProductoPeso(String nombre, String categoria, double peso, double precioPorPeso) {
		super(nombre, categoria);
		this.peso = peso;
		this.precioPorPeso = precioPorPeso;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getPrecioPorPeso() {
		return precioPorPeso;
	}

	public void setPrecioPorPeso(double precioPorPeso) {
		this.precioPorPeso = precioPorPeso;
	}

	@Override
	public double getImporteTotal() {
		return peso*precioPorPeso;
	}

	@Override
	public String imprimir() {
		return this.getNombre() + ", " + peso + " * " + precioPorPeso + " = " + getImporteTotal();
	}
}
