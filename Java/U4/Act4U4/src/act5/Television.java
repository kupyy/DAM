package act5;

public class Television extends Electrodomestico {
	private double resolucion;
	private boolean TDT;
	
	private final double resolucionD = 20;
	private final boolean TDT_D = false;
	
	public Television() {
		super();
		resolucion = resolucionD;
		TDT = TDT_D;
	}
	
	public Television(double precio, double peso) {
		super(precio, peso);
		resolucion = resolucionD;
		TDT = TDT_D;
	}

	public Television(double precio, double peso, char consumo, String color, double resolucion, boolean TDT) {
		super(precio, peso, consumo, color);
		this.resolucion = resolucion;
		this.TDT = TDT;
	}

	public double getResolucion() {
		return resolucion;
	}

	public boolean isTDT() {
		return TDT;
	}
	
	public double precioFinal() {
		double precioF = super.precioFinal();
		
		if(resolucion > 40) {
			precioF *= 1.3;
		}
		
		if(isTDT()) {
			precioF+=50;
		}
		
		return precioF;
	}
	
	
	
}
