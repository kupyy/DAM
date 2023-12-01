package personaC;

public class Persona {
	//propiedades de objeto
	private String dni;
	private String nombre;
	private String apellidos;
	private int edad;
	
	//getters & setters
	//DNI
	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	//Nombre
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	//Apellidos
	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	//Edad
	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	
	//metodos de objeto
	public String esMayor(int edad) {
		String mayor = "es mayor de edad";
		if(edad<18) mayor = "no es mayor de edad";
		
		return mayor;
	}
	
	//constructor
	public Persona() {
	}
}
