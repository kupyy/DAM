package abstr;

public class Triangulo extends Figura{
	private double base, altura;
	
	public Triangulo(String color, double base, double altura) {
		super(color);
		this.altura = altura;
		this.base = base;
	}
	
	public double calcArea() {
		return base*altura/2;
	}
}
