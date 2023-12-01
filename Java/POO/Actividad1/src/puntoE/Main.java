package puntoE;

public class Main {

	public static void main(String[] args) {
		//creación de objetos
		Punto p1 = new Punto(5, 0);
		Punto p2 = new Punto(10, 10);
		Punto p3 = new Punto(-3, 7);

		
		//mostrar posiciones por pantalla
		System.out.println("Posiciones de puntos:");
		System.out.println("Punto 1:");
		p1.imprime();
		System.out.println("\nPunto 2:");
		p2.imprime();
		System.out.println("\nPunto 3:");
		p3.imprime();
		System.out.println();
		
		//alterar valores
		//p1
		p1.setX(p1.getY());
		p1.setY(4+p1.getY());
		
		//p2
		p2.setXY(3, 1);
		
		//p3
		p3.setX(1);
		p3.setY(p3.getY()+1);
		
		System.out.println();
		System.out.println("======Nuevos Valores======");
		//mostrar posiciones por pantalla
		System.out.println("Punto 1:");
		p1.imprime();
		System.out.println("\nPunto 2:");
		p2.imprime();
		System.out.println("\nPunto 3:");
		p3.imprime();
		System.out.println();
		System.out.println();
		
		//desplazamiento de puntos
		System.out.println("======Desplazamiento de valores======");
		System.out.println("Se desplaza el punto 3 (2, 5)");
		System.out.print("Coordenada antigua: ");
		p3.imprime();
		System.out.println();
		p3.desplaza(2, 5);
		System.out.print("Coordenada nueva: ");
		p3.imprime();
		System.out.println();
		System.out.println();
		
		//Distancia entre 2 puntos
		System.out.println("===Distancia entre 2 puntos===");
		System.out.print("Distancia entre punto 1");
		p1.imprime();
		System.out.print(" y punto 2");
		p2.imprime();
		System.out.print(": "+p1.distancia(p2.getX(), p2.getY()));
		System.out.println();
		
		//crear punto aleatorio
		Punto p4 = Punto.puntoRandom();
		p4.imprime();
		
	}

}
