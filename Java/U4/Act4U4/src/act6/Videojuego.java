package act6;

public class Videojuego implements Entregable, Comparable<Videojuego>{
	private String titulo="Default Game", genero="Default Genre", compañia="Default Company";
	private int horas_estimadas = 10;
	private boolean entregado = false;
	
	public Videojuego() {
		
	}

	public Videojuego(String titulo, int horas_estimadas) {
		this.titulo = titulo;
		this.horas_estimadas = horas_estimadas;
	}

	public Videojuego(String titulo, String genero, String compañia, int horas_estimadas, boolean entregado) {
		this.titulo = titulo;
		this.genero = genero;
		this.compañia = compañia;
		this.horas_estimadas = horas_estimadas;
		this.entregado = entregado;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getCompañia() {
		return compañia;
	}

	public void setCompañia(String compañia) {
		this.compañia = compañia;
	}

	public int getHoras_estimadas() {
		return horas_estimadas;
	}

	public void setHoras_estimadas(int horas_estimadas) {
		this.horas_estimadas = horas_estimadas;
	}

	@Override
	public void entregar() {
		this.entregado = true;
		
	}

	@Override
	public void devolver() {
		this.entregado = false;
		
	}

	@Override
	public boolean isEntregado() {
		return this.entregado;
	}

	@Override
	public int compareTo(Videojuego o) {
		// TODO Apéndice de método generado automáticamente
		return 0;
	}

	@Override
	public String toString() {
		return "Videojuego [titulo=" + titulo + ", genero=" + genero + ", compañia=" + compañia + ", horas_estimadas="
				+ horas_estimadas + ", entregado=" + entregado + "]";
	}
	
	

}
