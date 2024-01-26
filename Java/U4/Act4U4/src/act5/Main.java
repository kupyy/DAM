package act5;

public class Main {

	public static void main(String[] args) {
		Lavadora L = new Lavadora(100, 40, 'A', "Rojo", 20);
		Lavadora L2 = new Lavadora();
		
		System.out.println(L2);
		
		System.out.println(L.precioFinal());

	}

}
