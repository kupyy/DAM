package ej1;

public class Lavadora extends Electrodomestico{
	private double precio;
	private boolean aguaCaliente;
	
	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public boolean isAguaCaliente() {
		return aguaCaliente;
	}

	public void setAguaCaliente(boolean aguaCaliente) {
		this.aguaCaliente = aguaCaliente;
	}

	public Lavadora(String tipo, String marca, double potencia) {
		super(tipo, marca, potencia);
		this.aguaCaliente = false;
	}

	public Lavadora(String tipo, String marca, double potencia, double precio, boolean aguaCaliente) {
		super(tipo, marca, potencia);
		this.precio = precio;
		this.aguaCaliente = aguaCaliente;
	}

	public double getConsumo(int horas) {
		double consumo;
		
		if(aguaCaliente) {
			consumo = (getPotencia()+getPotencia()*0.2);
		}else {
			consumo = getPotencia()*horas;
		}
		
		return consumo;
	}
	
	@Override
	public String toString() {
		String aguaC;
		
		if(aguaCaliente) {
			aguaC = "con";
		}else {
			aguaC = "sin";
		}
		
		return super.toString()+",  precio " + precio + "€ " + aguaC + " agua caliente";
	}
	
	
	
}
