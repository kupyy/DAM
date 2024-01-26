package act4;

public class Directivo extends Empleado {



	public Directivo(String string) {
		super(string);
		// TODO Apéndice de constructor generado automáticamente
	}

	@Override
	public String toString() {
		return "Empleado " + nombre + "-> Directivo";
	}
	
}
