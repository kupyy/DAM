package act3;

public class Main {

	public static void main(String[] args) {
		Fraccion fracciones[] = new Fraccion[5];
		
		fracciones[0] = new Fraccion(2, 4);
		fracciones[1] = new Fraccion(4, 8);
		fracciones[2] = new Fraccion(3, 4);
		fracciones[3] = new Fraccion(1, 5);
		fracciones[4] = fracciones[1].sumar(fracciones[2]);
		
		System.out.println(fracciones[0]);
		
		
		for(int i = 0; i < fracciones.length; i++) System.out.println(fracciones[i]);
		
		System.out.println(fracciones[0].esIgualQue(fracciones[2]));
		System.out.println(fracciones[4].esMayorQue(fracciones[0]));
		System.out.println(fracciones[3].esMenorQue(fracciones[4]));
		
		System.out.println(fracciones[4]);
		
		System.out.println(fracciones[1].compareTo(fracciones[4]));
	}

}
