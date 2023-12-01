package ejercicio5;

public class Libro {
	//object properties
	private int ISBN, n_paginas, n_ventas;
	private String titulo, autor;
	
	
	//getters & setters
	public int getISBN() {
		return ISBN;
	}

	public void setISBN(int ISBN) {
		this.ISBN = ISBN;
	}

	public int getN_paginas() {
		return n_paginas;
	}

	public void setN_paginas(int n_paginas) {
		this.n_paginas = n_paginas;
	}

	public int getN_ventas() {
		return n_ventas;
	}

	public void setN_ventas(int n_ventas) {
		this.n_ventas = n_ventas;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	//class methods
	//show data
	public void mostrar() {
		System.out.println("El libro \"" + this.titulo + "\" con ISBN " + this.ISBN + " creado por el autor " + this.autor + " tiene " + this.n_paginas + " páginas");
	}
	
	//copy book
	public void copiaLibro(Libro l) {
		this.autor = l.autor;
		this.ISBN = l.ISBN;
		this.n_paginas = l.n_paginas;
		this.n_ventas = l.n_ventas;
		this.titulo = l.titulo;
	}
	
	//compare book sells
	public int comparaVentas(Libro l1, Libro l2) {
		int mayorV;
		
		if(l1.getN_ventas() > l2.getN_ventas()) {
			mayorV = l1.getISBN();
		}else {
			mayorV = l2.getISBN();
		}
		
		return mayorV;
	}
	
	//compare pages
	public int comparaPaginas(Libro l1, Libro l2) {
		int mayorP;
		
		if(l1.getN_paginas() > l2.getN_paginas()) {
			mayorP = l1.getISBN();
		}else {
			mayorP = l2.getISBN();
		}
		
		return mayorP;
	}
	
	//define popular book
	public boolean esPopular(Libro l1) {
		return (l1.getN_ventas()>10000);
	}
	
	//classify books per pages
	public String clasificaLibro(Libro l) {
		String tipo;
		
		if(l.getN_paginas() < 150) {
			tipo = "duracion corta";
		}else if (l.getN_paginas() > 300) {
			tipo = "duracion larga";
		}else {
			tipo = "duracion media";
		}
		
		return tipo;
	}
	
	//class constructors
	public Libro() {
		 
	}

	public Libro(int ISBN, int n_paginas, int n_ventas, String titulo, String autor) {
		this.ISBN = ISBN;
		this.n_paginas = n_paginas;
		this.n_ventas = n_ventas;
		this.titulo = titulo;
		this.autor = autor;
	}
	
	

}
