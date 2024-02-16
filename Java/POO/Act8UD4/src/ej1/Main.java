package ej1;

public class Main {

	public static void main(String[] args) {
		Lavadora l = new Lavadora("Lavadora", "Balay", 50, 100, true);
		Lavadora l2 = new Lavadora("Lavadora", "Balay", 50, 100, false);
		
		System.out.println(l);
		
		System.out.println(l.getConsumo(1));
		System.out.println(l2.getConsumo(1));
		
		System.out.println(l.getCosteConsumo(2, 0.5));
		System.out.println(l2.getCosteConsumo(2, 0.5));

	}

}
