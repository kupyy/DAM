package act5;

public class Electrodomestico {
	
	//Default properties
	protected final double precioBase = 100;
	protected final String colorBase = "Blanco";
	protected final char consumoBase = 'F';
	protected final double pesoBase = 5;
	
	//object properties
	protected double precio, peso;
	protected char consumo;
	protected String color;
	
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
	protected double precioFinal() {
		double precioF;
		precioF = precio;
		
		switch(consumo) {
		case 'A':
			precioF+=100;
			break;
		case 'B':
			precioF+=80;
			break;
		case 'C':
			precioF+=60;
			break;
		case 'D':
			precioF+=50;
			break;
		case 'E':
			precioF+=30;
			break;
		case 'F':
			precioF+=10;
			break;
		}
		
		if(peso >= 0 && peso <20) {
			precioF+=10;
		}else if(peso >= 20 && peso < 50) {
			precioF+=50;
		}else if(peso >= 50 && peso < 80) {
			precioF+=80;
		}else if(peso >= 80) {
			precioF+=100;
		}
		
		return precioF;
		
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
