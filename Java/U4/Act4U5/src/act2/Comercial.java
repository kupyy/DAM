package act2;

public class Comercial extends Empleado{
	private int comision;
	
	//constructor
	public Comercial() {
		
	}
	
	public Comercial(String nombre, String apellido, int edad, double salario, int comision) {
		super(nombre, apellido, edad, salario);
		this.comision = comision;
	}

	public boolean plus(double sueldoPlus) {
		boolean posible = false;
		
		if(comision < 50) {
			posible = true;
			this.setSalario(this.getSalario()+sueldoPlus);
		}
		
		return posible;
	}
}
