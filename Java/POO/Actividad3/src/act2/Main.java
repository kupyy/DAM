package act2;

public class Main {

	public static void main(String[] args) {
		Movil m1 = new Movil("Xiaomi", "Redmi Note 10 5G", "MediaTek Dimensity 700", 75.99, 6.5, 381300, 13);
		Movil m2 = new Movil();
		m2.copiaMovil(m1);

		m1.mostrar();
	}

}
