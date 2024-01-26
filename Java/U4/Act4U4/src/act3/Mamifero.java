package act3;

public class Mamifero extends Animal {
	protected int gestacion;
	
	public Mamifero(String nombre, String alimentacion, int edad, int gestacion) {
		super(nombre, alimentacion, edad);
		this.gestacion = gestacion;
	}

	@Override
	public String toString() {
		return "Mamifero [gestacion=" + gestacion + ", nombre=" + nombre + ", tipo_alimentacion=" + tipo_alimentacion
				+ ", edad=" + edad + "]";
	}
	
	
	
}
