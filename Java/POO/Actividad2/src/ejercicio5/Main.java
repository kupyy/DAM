package ejercicio5;

public class Main {

	public static void main(String[] args) {
		Libro p1 = new Libro(1234, 154, 5000, "Los Juegos Del Hambre", "Suzane Collins");
		Libro p2 = new Libro(4323, 400, 13000, "Harry Potter", "Kanye West");
		Libro p3 = new Libro(3214, 124, 40, "Alex por qué me dejaste", "Taylor Swift");
		
		//Mostrar libros
		p1.mostrar();
		p2.mostrar();
		p3.mostrar();
		
		//copiar libro1
		Libro pCopia = new Libro();
		pCopia.copiaLibro(p1);
		
		//mostrar libro copiado
		pCopia.mostrar();
		
		//clasificación de libros
		System.out.println();
		System.out.println("Clasificación de libros");
		System.out.println("Titulo: " + p1.getTitulo() + ", " + p1.clasificaLibro(p1));
		System.out.println("Titulo: " + p2.getTitulo() + ", " + p2.clasificaLibro(p2));
		System.out.println("Titulo: " + p3.getTitulo() + ", " + p3.clasificaLibro(p3));
		
		//definir si libro 2 es popular
		if(p2.esPopular(p2)) {
			
		}
	}

}
