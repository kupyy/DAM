package serie;

public class Serie {
	private String titulo, genero, creador;
	private int n_temporadas = 3;
	private boolean entregado = false;
	
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

	public String getCreador() {
		return creador;
	}

	public void setCreador(String creador) {
		this.creador = creador;
	}

	public int getN_temporadas() {
		return n_temporadas;
	}

	public void setN_temporadas(int n_temporadas) {
		this.n_temporadas = n_temporadas;
	}
	
	public void entregar() {
		this.entregado = true;
	}
	
	public void devolver() {
		this.entregado = false;
	}

	public Serie() {
		
	}
	
	public Serie(String titulo, String creador) {
		this.titulo = titulo;
		this.creador = creador;
	}
	
	public Serie(String titulo, String creador, int n_temp, String genero) {
		this.titulo = titulo;
		this.creador = creador;
		n_temporadas = n_temp;
		this.genero = genero;
	}
	
}
