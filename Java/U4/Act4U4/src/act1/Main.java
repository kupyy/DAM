package act1;

public class Main {
	public static void main(String [] args) {
		Examen e1 = new Examen("Matemáticas", new Fecha(12, 4, 2024), new Hora(12, 33));
		Examen e2 = new Examen("Biología", new Fecha(14,4,2024), new Hora(8, 33));
		Examen e3 = new Examen("Lengua", new Fecha(11,4,2024), new Hora(9, 33));
		
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e3);
	}
}
