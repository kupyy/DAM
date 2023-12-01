package ejercicio4;

public class Electrodomestico {
	
	//Default properties
	private final double precioBase = 100;
	private final String colorBase = "Blanco";
	private final char consumoBase = 'F';
	private final double pesoBase = 5;
	
	//object properties
	private double precio, peso;
	private char consumo;
	private String color;
	
	//setters & getters
	public double getPrecioBase() {
		return precioBase;
	}

	public String getColorBase() {
		return colorBase;
	}

	public char getConsumoBase() {
		return consumoBase;
	}

	public double getPesoBase() {
		return pesoBase;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public char getConsumo() {
		return consumo;
	}

	public void setConsumo(char consumo) {
		this.consumo = consumo;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	//class methods
	//check letter
	private char comprobarConsumoEnergetico(char letra) {
		letra = Character.toUpperCase(letra);
		
		if( letra != 'A' || 
			letra != 'B' || 
			letra != 'C' || 
			letra != 'D' || 
			letra != 'E' || letra != 'F') {
			letra = 'F';
		}
		
		return letra;
	}
	
	//check color
	private String comprobarColor(String color) {
		color = color.toLowerCase();
		
		if( !color.equals("blanco") || 
			!color.equals("negro") || 
			!color.equals("rojo") || 
			!color.equals("azul") || 
			!color.equals("gris")) {
			color = "blanco";
		}
		return color;
	}
	
	//price with discount
	public double precioFinal(double descuento) {
		return this.precioFinal()-((this.precioFinal()*descuento/100));
	}
	
	//price without discount
	public double precioFinal() {
		return this.precio*1.21;
	}
	
	//show data
	public void mostrar() {
		System.out.println("====Datos de electrodoméstico====");
		System.out.println("Color: " + this.getColor());
		System.out.println("Precio: " + this.getPrecio());
		System.out.println("Peso: " + this.getPeso());
		System.out.println("Consumo: " + this.getConsumo());
	}

	//class constructors
	/**
	 * default constructor
	 * */
	public Electrodomestico() {
		this.precio = precioBase;
		this.color = colorBase;
		this.consumo = consumoBase;
		this.peso = pesoBase;
	}
	
	/**
	 * price & weight constructor
	 * */
	public Electrodomestico(double precio, double peso) {
		this.color = colorBase;
		this.consumo = consumoBase;
		this.precio = precio;
		this.peso = peso;
	}

	
	/**
	 * full constructor
	 * */
	public Electrodomestico(double precio, double peso, char consumo, String color) {
		this.color = comprobarColor(color);
		this.precio = precio;
		this.peso = peso;
		this.consumo = comprobarConsumoEnergetico(consumo);
		this.color = color;
	}
	

}
