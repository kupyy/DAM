package act5;

public class Main {

	public static void main(String[] args) {
		Electrodomestico e[] = new Electrodomestico[5];

		e[1] = new Lavadora(125, 20, 'F', "Blanco", 33);
		e[2] = new Television(150.67, 40, 'A', "Rojo", 40, true);
		e[3] = new Lavadora(90, 40, 'C', "Azul", 25);
		e[4] = new Electrodomestico();
		e[0] = new Television(200, 23, 'B', "Azul", 55, false);
		
		for(int i = 0; i < e.length-1; i++) {
			System.out.println(e[i].precioFinal());
		}

	}

}
