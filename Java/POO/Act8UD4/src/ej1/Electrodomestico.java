package ej1;

public class Electrodomestico {
	private String tipo;
	private String marca;
	private double potencia;
	
	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public double getPotencia() {
		return potencia;
	}

	public void setPotencia(double potencia) {
		this.potencia = potencia;
	}

	public Electrodomestico(String tipo, String marca, double potencia) {
		this.tipo = tipo;
		this.marca = marca;
		this.potencia = potencia;
	}

	@Override
	public String toString() {
		return tipo + " de marca " + marca + " y " + potencia + "KW/h";
	}
	
	public double getConsumo(int horas) {
		return potencia*horas;
	}
	
	public double getCosteConsumo(int horas, double costeHora) {
		return getConsumo(horas)*costeHora;
	}	
}
