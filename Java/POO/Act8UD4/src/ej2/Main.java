package ej2;

public class Main {

	public static void main(String[] args) {
		Ticket t = new Ticket("Inés", 3);
		
		t.agregarProductos();

		t.borraElemento(2);
		

		t.imprime();
	}

}
