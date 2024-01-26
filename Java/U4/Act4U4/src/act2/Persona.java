package act2;

import java.util.Calendar;

public class Persona {
	private String nombre;
	private String direccion;
	private int codigoPostal;
	private String ciudad;
	private Fecha fechaNacimiento;

	public Persona() {
		
	}

	public Persona(String nombre, String direccion, int codigoPostal, String ciudad, Fecha fechaNacimiento) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.codigoPostal = codigoPostal;
		this.ciudad = ciudad;
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getCodigoPostal() {
		return codigoPostal;
	}

	public void setCodigoPostal(int codigoPostal) {
		this.codigoPostal = codigoPostal;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public Fecha getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Fecha fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	
	public boolean esMayorDeEdad() {
		boolean esMayor =  false;
		
		Calendar hoy = Calendar.getInstance();
		
		
		if(hoy.get(Calendar.YEAR) - fechaNacimiento.getAño() > 18) {
			esMayor=true;
		}else if (hoy.get(Calendar.YEAR) - fechaNacimiento.getAño() == 18 && hoy.get(Calendar.MONTH)+1 < fechaNacimiento.getMes()){
			esMayor = true;
		}else if (hoy.get(Calendar.MONTH)+1 == fechaNacimiento.getMes() && hoy.get(Calendar.DAY_OF_MONTH) >= fechaNacimiento.getDia()) {
			esMayor = true;
		}
		
		return esMayor;
	}

	@Override
	public String toString() {
		return "Nombre: " + nombre + "\nFecha nacimiento: " + fechaNacimiento + "\nDireccion: " + direccion + "\n" + codigoPostal + " " + ciudad;
	}
	
	
	
}
