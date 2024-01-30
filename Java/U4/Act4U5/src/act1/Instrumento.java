package act1;

public abstract class Instrumento {
	private String tipo;
	
	public Instrumento(String tipo) {
		this.tipo = tipo;
	}
	
	public abstract void tocar();
}
