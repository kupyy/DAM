package act6;

public class Serie implements Entregable, Comparable<Serie>{
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
	
	@Override
	public void entregar() {
		this.entregado = true;
	}
	
	@Override
	public void devolver() {
		this.entregado = false;
	}

	@Override
	public String toString() {
		return "Serie " + titulo + ", genero " + genero + ", creador " + creador + ", n_temporadas "
				+ n_temporadas + ", entregado " + entregado;
	}

	@Override
	public boolean isEntregado() {
		return this.entregado;
	}

	@Override
	public int compareTo(Serie s) {
		//int temporadas_e = ((Serie)e).getN_temporadas();
		int res = -1;
		
		if(this.n_temporadas > s.n_temporadas) {
			res = 1;
		}else if(this.n_temporadas == s.n_temporadas) {
			res = 0;
		}
		
		return res;
	}

}

