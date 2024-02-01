package act4;

public class Tecnico extends Operario {
	public Tecnico(String string) {
		super(string);
		// TODO Apéndice de constructor generado automáticamente
	}

	@Override
	public String toString() {
		return super.toString() + " -> Tecnico";
	}
}
