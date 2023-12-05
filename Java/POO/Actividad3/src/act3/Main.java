package act3;

public class Main {

	public static void main(String[] args) {
		//creación de objetos
		Complejo c1 = new Complejo(1, 1);
		Complejo c2 = new Complejo(2, 2);
		Complejo c3 = c1.sumar(c2);
		Complejo c4 = c1.restar(c2);
		Complejo c5 = c1.dividir(c2);
		Complejo c6 = c1.multiplicar(c2);
		Complejo c7 = c1.multiplicar(3.5);
		
		//mostrar resultados
		System.out.println(c1.mostrar() + " + " + c2.mostrar() + " = " + c3.mostrar());
		System.out.println(c1.mostrar() + " - " + c2.mostrar() + " = " + c4.mostrar());
		System.out.println(c1.mostrar() + " / " + c2.mostrar() + " = " + c5.mostrar());
		System.out.println(c1.mostrar() + " * " + c2.mostrar() + " = " + c6.mostrar());
		System.out.println(c1.mostrar() + " *  3.5   = " + c7.mostrar());
		c2.iguales(c7);
		c7.iguales(c7);
		
		
		
		
	}

}
