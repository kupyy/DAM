package personaE;

public class Persona {
	//propiedades de objeto
	private final String dni;
	private String nombre;
	private String apellidos;
	private int edad;
	
	//getters & setters
	//DNI
	public String getDni() {
		return dni;
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
	//mayor de edad/no
	public boolean esMayorEdad(int edad) {
		boolean mayor = true;
		if(edad<18) mayor = false;
		
		return mayor;
	}
	
	//muestra datos
	public void imprime() {
		System.out.println("DNI:" + this.dni + ".\nNombre:" + this.nombre + this.apellidos + ".\nEdad:" + this.edad + ".\n");
	}
	
	//jubilado
	public boolean esJubilado() {
		boolean jubileta=true;
		if(edad<65) jubileta=false;
		
		return jubileta;
	}
	
	//diferencia de edad
	public int diferenciaEdad(Persona p) {
		int diff = this.edad - p.edad;
		return diff;
	}
	
	//validador de DNI
	/*static boolean validarDNI(String dni) {
		boolean esValido=false;
		
		
		return esValido;
	}*/
	
	//constructor
	public Persona(String nombre, String apellidos, String dni, int edad) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
		this.edad = edad;
	}
}
