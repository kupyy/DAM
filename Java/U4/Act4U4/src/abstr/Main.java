package abstr;

public class Main {

	public static void main(String[] args) {
		Cuadrado c1 = new Cuadrado("rojo", 3);
		System.out.println("El color del cuadrado es " + c1.getColor()+ " y su area es " + c1.calcArea());
		
		Triangulo t1 = new Triangulo("azul", 4, 5);
		System.out.println("El color del cuadrado es " + t1.getColor()+ " y su area es " + t1.calcArea());

	}

}
