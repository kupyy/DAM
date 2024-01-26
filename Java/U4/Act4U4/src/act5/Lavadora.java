package act5;

public class Lavadora extends Electrodomestico {
	private double carga;
	
	private final double cargaBase=5;
	
	public Lavadora() {
		super();
		carga = cargaBase;
	}
	
	//Class methods
	public double getCarga() {
		return carga;
	}
	
	public double precioFinal() {
		double precioF = super.precioFinal();
		
		if(carga > 30) precioF += 50;
		
		return precioF;
	}
	
	//Class Constructors
	public Lavadora(double precio, double peso) {
		super(precio, peso);
		carga = cargaBase;
	}
	
	public Lavadora(double precio, double peso, char consumo, String color, double carga) {
		super(precio, peso, consumo, color);
		this.carga = carga;
	}

	@Override
	public String toString() {
		return "Lavadora [carga=" + carga + ", cargaBase=" + cargaBase + ", precioBase=" + precioBase + ", colorBase="
				+ colorBase + ", consumoBase=" + consumoBase + ", pesoBase=" + pesoBase + ", precio=" + precio
				+ ", peso=" + peso + ", consumo=" + consumo + ", color=" + color + "]";
	}
	
	
	
}
