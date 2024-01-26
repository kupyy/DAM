package act4;

public class Empleado {
	protected String nombre;

	public Empleado(String string) {
		nombre = string;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Empleado " + nombre;
	}
	
}
