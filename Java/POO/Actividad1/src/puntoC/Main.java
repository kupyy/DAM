package puntoC;

public class Main {

	public static void main(String[] args) {
		//creación de objetos
		Punto p1 = new Punto(5, 0);
		Punto p2 = new Punto(10, 10);
		Punto p3 = new Punto(-3, 7);

		
		//mostrar posiciones por pantalla
		System.out.println("Punto 1: x:" + p1.getX() + ", y:" + p1.getY());
		System.out.println("Punto 2: x:" + p2.getX() + ", y:" + p2.getY());
		System.out.println("Punto 3: x:" + p3.getX() + ", y:" + p3.getY());
		
		//alterar valores
		//p1
		p1.setX(p1.getY());
		p1.setY(4+p1.getY());
		
		//p2
		p2.setX(p1.getY());
		p2.setY(3+1);
		
		//p3
		p3.setX(1);
		p3.setY(p3.getY()+1);
		
		System.out.println();
		System.out.println("======Nuevos Valores======");
		//mostrar posiciones por pantalla
		System.out.println("Punto 1: x:" + p1.getX() + ", y:" + p1.getY());
		System.out.println("Punto 2: x:" + p2.getX() + ", y:" + p2.getY());
		System.out.println("Punto 3: x:" + p3.getX() + ", y:" + p3.getY());
	}

}
