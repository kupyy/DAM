package fracciones;

public class Main {
	


	public static void main(String[] args) {
		Fracc fracciones[] = new Fracc[6];
		
		fracciones[0] = new Fracc(5,7);
		
		fracciones[1] = new Fracc(1,2);
		
		fracciones[2] = fracciones[0].sumar(fracciones[1]);
		
		fracciones[2].mostrarF();

	}

}
