package personaD;
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
		p1.setNombre("Jose Antonio");
		p1.setApellidos("Collantes");
		p1.setDni("12314523");
		p1.setEdad(19);
		
		//p2
		p2.setNombre("Llados");
		p2.setApellidos("Llados");
		p2.setDni("escomofak");
		p2.setEdad(67);
		

		
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
