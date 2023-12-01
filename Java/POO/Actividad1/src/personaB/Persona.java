package personaB;

public class Persona {
	//propiedades de objeto
	String dni;
	String nombre;
	String apellidos;
	int edad;
	
	//metodos de objeto
	public String esMayor(int edad) {
		String mayor = "es mayor de edad";
		if(edad<18) mayor = "no es mayor de edad";
		
		return mayor;
	}
	
	//constructor
	public Persona(String nombre, String apellidos, String dni, int edad) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
		this.edad = edad;
	}
}
