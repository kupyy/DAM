package act3;

public class Caballo extends Mamifero {
	private String comida;
	private int ejercicio;
	
	
	public Caballo(String nombre, String alimentacion, int edad, int gestacion, String comida, int ejercicio) {
		super(nombre, alimentacion, edad, gestacion);
		this.comida = comida;
		this.ejercicio = ejercicio;
	}


	@Override
	public String toString() {
		return "Caballo [comida=" + comida + ", ejercicio=" + ejercicio + ", gestacion=" + gestacion + ", nombre="
				+ nombre + ", tipo_alimentacion=" + tipo_alimentacion + ", edad=" + edad + "]";
	}
	
	
	
	
	
}
