package ejercicio2;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String titular;
		double cantidad;
		
		System.out.println("Introduzca el nombre de titular");
		titular = sc.nextLine();
		System.out.println("Introduzca el dinero del titular");
		cantidad =  sc.nextDouble();
		
		Cuenta c1 = new Cuenta(titular, cantidad);
		
		System.out.println(c1.mostrar());
		
		c1.ingresar();
		
		System.out.println(c1.mostrar());
	}

}
