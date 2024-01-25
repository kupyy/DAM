package act1;

public class Examen {
	private String nombre_asignatura;
	private Fecha fecha;
	private Hora hora;
	
	public Examen(String nombre_asignatura, Fecha fecha, Hora hora) {
		this.nombre_asignatura = nombre_asignatura;
		this.fecha = fecha;
		this.hora = hora;
	}

	@Override
	public String toString() {
		return "Examen de " + nombre_asignatura + ", fecha: " + fecha + ", hora: " + hora;
	}
	
	
	
	
}
