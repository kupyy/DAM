package act1;

public class Main {

	public static void main(String[] args) {
		Cuenta c1 = new Cuenta("Juan Cuesta", 1000, 2);
		Cuenta c2 = new Cuenta("Emilio García");
		
		c1.muestraC();
		c2.muestraC();
		
		c1.transfer(c2, 400);
		
		c1.muestraC();
		c2.muestraC();
	}

}
