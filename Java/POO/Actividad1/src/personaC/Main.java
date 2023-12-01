package personaC;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//creación de objetos
		Scanner sc = new Scanner(System.in);
		//creación de las 2 personas
		Persona p1 = new Persona();
		Persona p2 = new Persona();
		
		//asignación de atributos
		//p1
		System.out.println("Introduce el nombre");
		p1.setNombre(sc.nextLine());
		System.out.println("Introduce los apellidos");
		p1.setApellidos(sc.nextLine());
		System.out.println("Introduce el dni");
		p1.setDni(sc.nextLine());
		System.out.println("Introduce la edad");
		p1.setEdad(sc.nextInt());
		
		sc.nextLine();
		
		//p2
		System.out.println("Introduce el nombre");
		p2.setNombre(sc.nextLine());
		System.out.println("Introduce los apellidos");
		p2.setApellidos(sc.nextLine());
		System.out.println("Introduce el dni");
		p2.setDni(sc.nextLine());
		System.out.println("Introduce la edad");
		p2.setEdad(sc.nextInt());
		

		
		//muestreo de datos
		//p1
		System.out.println(p1.getNombre() + " " + p1.getApellidos() + " con DNI " + p1.getDni() + " " + p1.esMayor(p1.getEdad()));
		
		//p2
		System.out.println(p2.getNombre() + " " + p2.getApellidos() + " con DNI " + p2.getDni() + " " + p2.esMayor(p2.getEdad()));
	}

}
