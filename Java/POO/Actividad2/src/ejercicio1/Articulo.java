package ejercicio1;

public class Articulo {
	private String nombre;
	private double precio;
	private final double iva = 1.21;
	private int cuantosQuedan;
	
	//setters & getters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getCuantosQuedan() {
		return cuantosQuedan;
	}

	public void setCuantosQuedan(int cuantosQuedan) {
		this.cuantosQuedan = cuantosQuedan;
	}

	public double getIva() {
		return iva;
	}
	
	//class methods
	public void imprimir() {
		System.out.println("Nombre: " + nombre + "\nPrecio: " + precio + "\nPrecio con IVA(" + iva + "): " + precio*iva + "\nDisponibilidad: " + cuantosQuedan);
	}
	
	public double getPVP(double precio) {
		return precio*iva;
	}
	
	public double getPVPDescuento(double precio, double descuento) {
		return precio-(precio*descuento)/100;
	}
	
	public boolean vender(int cantidad) {
		boolean esPosible = false;
		if(!(cantidad > cuantosQuedan)) {
			esPosible = true;
			cuantosQuedan-=cantidad;
		}
		
		return esPosible;
	}
	
	public boolean almacenar(int cantidad) {
		cuantosQuedan+=cantidad;
		return true;
	}

	//class constructor
	public Articulo(String nombre, double precio, int cuantosQuedan) {
		if(nombre.equals("")) {
			System.err.println("No se puede introducir un nombre negativo");
		}else if(precio <= 0) {
			System.err.println("No se puede introducir un precio negativo o cero");
		}else if (cuantosQuedan < 0){
			System.err.println("No se puede introducir una cantidad de stock negativa");
		}else {
			this.nombre = nombre;
			this.precio = precio;
			this.cuantosQuedan = cuantosQuedan;
		}
	}

}
