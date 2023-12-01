package persona;

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
}
