package personaB;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//creación de objetos
		Scanner sc = new Scanner(System.in);
		
		//asignación de atributos
		//p1
		String p1nombre=sc.nextLine();
		String p1apellidos=sc.nextLine();
		String p1dni=sc.nextLine();
		int p1edad=sc.nextInt();
		
		sc.nextLine();
		
		//p2
		String p2nombre=sc.nextLine();
		String p2apellidos=sc.nextLine();
		String p2dni=sc.nextLine();
		int p2edad=sc.nextInt();
		
		//creación de las 2 personas
		Persona p1 = new Persona(p1nombre, p1apellidos, p1dni, p1edad);
		Persona p2 = new Persona(p2nombre, p2apellidos, p2dni, p2edad);
		
		//muestreo de datos
		//p1
		System.out.println(p1.nombre + " " + p1.apellidos + " con DNI " + p1.dni + " " + p1.esMayor(p1.edad));
		
		//p2
		System.out.println(p2.nombre + " " + p2.apellidos + " con DNI " + p2.dni + " " + p2.esMayor(p2.edad));
	}

}
