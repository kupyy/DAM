package puntoB;

public class Main {

	public static void main(String[] args) {
		//creación de objetos
		Punto p1 = new Punto(5,0);
		Punto p2 = new Punto(10,10);
		Punto p3 = new Punto(-3,7);
		
		//mostrar posiciones por pantalla
		System.out.println("Punto 1: x:" + p1.x + ", y:" + p1.y);
		System.out.println("Punto 2: x:" + p2.x + ", y:" + p2.y);
		System.out.println("Punto 3: x:" + p3.x + ", y:" + p3.y);

	}

}
