package act3;

public class Gato extends Mamifero {
	private double pedigri;
	
	public Gato(String nombre, String alimentacion, int edad, int gestacion, double pedigri) {
		super(nombre, alimentacion, edad, gestacion);
		this.pedigri = pedigri;
	}

	@Override
	public String toString() {
		return "Gato [pedigri=" + pedigri + ", gestacion=" + gestacion + ", nombre=" + nombre + ", tipo_alimentacion="
				+ tipo_alimentacion + ", edad=" + edad + "]";
	}

	
	
	
	
}
