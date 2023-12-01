package personaE;
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
		p1.imprime();
		
		//p2
		p2.imprime();
		
		//jubiletas
		System.out.println(p1.esJubilado());
		System.out.println(p2.esJubilado());
		
		//diferencia entre p1 y p2
		System.out.println(p1.diferenciaEdad(p2));
	}
	

}


