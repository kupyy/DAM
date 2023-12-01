package ejercicio4;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String color;
		char consumo;
		double precio, peso;
		
		//first object
		System.out.println("introduce el color");
		color = sc.nextLine();
		System.out.println("introduce el precio");
		precio = sc.nextDouble();
		sc.nextLine();
		System.out.println("introduce el consumo");
		consumo = sc.nextLine().charAt(0);
		System.out.println("introduce el peso");
		peso = sc.nextDouble();
		
		Electrodomestico e1 = new Electrodomestico(precio, peso, consumo, color);
		//second object
		System.out.println("Introduce el precio");
		precio = sc.nextDouble();
		System.out.println("introduce el peso");
		peso = sc.nextDouble();
		
		Electrodomestico e2 = new Electrodomestico(precio, peso);
		//third object
		Electrodomestico e3 = new Electrodomestico();
		
		//methods testing
		//final price
		System.out.println("Precio del electrodoméstico 1: "+ e1.precioFinal() + " €");
		
		//final price with 20% of discount
		System.out.println("Precio del electrodoméstico 1 con 30% de descuento: " + e1.precioFinal(30) + "€");
		//show objects properties
		e1.mostrar();
		e2.mostrar();
		e3.mostrar();
	}
}
