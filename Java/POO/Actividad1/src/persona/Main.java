package persona;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//creación de objetos
		Scanner sc = new Scanner(System.in);
		Persona p1 = new Persona();
		Persona p2 = new Persona();
		
		//asignación de atributos
		//p1
		p1.nombre=sc.nextLine();
		p1.apellidos=sc.nextLine();
		p1.dni=sc.nextLine();
		p1.edad=sc.nextInt();
		
		sc.nextLine();
		
		//p2
		p2.nombre=sc.nextLine();
		p2.apellidos=sc.nextLine();
		p2.dni=sc.nextLine();
		p2.edad=sc.nextInt();
		
		//muestreo de datos
		//p1
		System.out.println(p1.nombre + " " + p1.apellidos + " con DNI " + p1.dni + " " + p1.esMayor(p1.edad));
		
		//p2
		System.out.println(p2.nombre + " " + p2.apellidos + " con DNI " + p2.dni + " " + p2.esMayor(p2.edad));
	}

}
