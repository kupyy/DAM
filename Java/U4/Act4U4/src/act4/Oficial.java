package act4;

public class Oficial extends Operario {
	public Oficial(String string) {
		super(string);
		// TODO Apéndice de constructor generado automáticamente
	}

	@Override
	public String toString() {
		return super.toString() + " -> Oficial";
	}
}
