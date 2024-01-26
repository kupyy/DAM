package act4;

public class Operario extends Empleado {

	public Operario(String string) {
		super(string);
		// TODO Apéndice de constructor generado automáticamente
	}



	@Override
	public String toString() {
		return "Empleado " + nombre + "-> Operario";
	}

}
