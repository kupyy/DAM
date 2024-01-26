package act3;

public class Perro extends Mamifero {
	public String raza;
	
	public Perro(String nombre, String alimentacion, int edad, int gestacion, String raza) {
		super(nombre, alimentacion, edad, gestacion);
		this.raza = raza;
	}

	@Override
	public String toString() {
		return "Perro [raza=" + raza + ", gestacion=" + gestacion + ", nombre=" + nombre + ", tipo_alimentacion="
				+ tipo_alimentacion + ", edad=" + edad + "]";
	}
	
	
	
}
