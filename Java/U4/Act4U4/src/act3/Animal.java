package act3;

public class Animal {
	protected String nombre;
	protected String tipo_alimentacion;
	protected int edad;
	
	public Animal(String nombre, String alimentacion, int edad) {
		this.nombre = nombre;
		tipo_alimentacion = alimentacion;
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Nombre=" + nombre + ", tipo_alimentacion=" + tipo_alimentacion + ", edad=" + edad;
	}
	
	
}
