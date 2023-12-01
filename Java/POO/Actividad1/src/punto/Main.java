package punto;

public class Main {

	public static void main(String[] args) {
		//Creación de 3 objetos
		Punto p1 = new Punto();
		Punto p2 = new Punto();
		Punto p3 = new Punto();
		
		//Modificación de valores
		//p1
		p1.x=5;
		p1.y=0;
		
		//p2
		p2.x=10;
		p2.y=10;
		
		//p3
		p3.x=-3;
		p3.y=7;
		
		//mostrar posiciones por pantalla
		System.out.println("Punto 1: x:" + p1.x + ", y:" + p1.y);
		System.out.println("Punto 2: x:" + p2.x + ", y:" + p2.y);
		System.out.println("Punto 3: x:" + p3.x + ", y:" + p3.y);

		//modificar puntos
		//p1
		p1.x+=1;
		p1.y = p1.x+2;
		
		//p2
		p2.x++;
		p2.y=p2.y+4;
		
		//p3
		p3.x*=-2;
		p3.y=p1.x;
		
		//mostrar posiciones por pantalla
		System.out.println();
		System.out.println("========Nuevas posiciones=========");
		System.out.println("Punto 1: x:" + p1.x + ", y:" + p1.y);
		System.out.println("Punto 2: x:" + p2.x + ", y:" + p2.y);
		System.out.println("Punto 3: x:" + p3.x + ", y:" + p3.y);
	}

}
