package ej2;
import java.util.Scanner;

public class Ticket {
	private String cliente;
	private Producto[] listaCompra;
	final int UNITARIO=1;
	final int PESO=2;
	
	public Ticket(String cliente, int cantidad) {
		this.cliente = cliente;
		listaCompra = new Producto[cantidad];		
	}
	
	//agrega todos los productos
	public void agregarProductos() {
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < listaCompra.length; i++) {
		
		
			System.out.println("Introduce el nombre de producto");
			String nombre = sc.nextLine();
		
			System.out.println("Introduce el tipo de producto: \n 1-UNITARIO \n 2-PESO");
			int opc = sc.nextInt();
			sc.nextLine();
		
			System.out.println("Introduce el precio del producto");
			Double precio = sc.nextDouble();
		
			switch(opc) {
			case UNITARIO:
				System.out.println("Introduce la cantidad");
				int cantidad = sc.nextInt();
				listaCompra[i] = new ProductoUnitario(nombre, null, cantidad, precio);
				break;
			case PESO:
				System.out.println("Introduce el peso");
				double peso = sc.nextDouble();
				listaCompra[i] = new ProductoPeso(nombre, null, peso, precio);
				break;
			}
			sc.nextLine();
		}
	}
	
	//imprime el ticket
	public void imprime() {
		if (operable()) {
			System.out.println("____________________________________________________________");
			System.out.println("TICKET DE LA COMPRA \t Cliente: " + cliente);
			
			System.out.println();
			
			for(int i = 0; i < listaCompra.length; i++) {
				if(listaCompra[i] instanceof ProductoUnitario) {
					System.out.println( ((ProductoUnitario)listaCompra[i]).imprimir() );
				}else if(listaCompra[i] instanceof ProductoPeso){
					System.out.println( ((ProductoPeso)listaCompra[i]).imprimir() );
				}
			}
			
			System.out.println();
			
			System.out.println("IMPORTE TOTAL = "+importeTotal());
			System.out.println("____________________________________________________________");
		}else{
			System.out.println("El ticket del cliente " + cliente + " se encuentra vacío");
		}
	}
	
	//calcula el importe total del ticket
	private double importeTotal() {
		double importeT=0;
		for(int i = 0; i < listaCompra.length; i++) {
			if(listaCompra[i] instanceof ProductoUnitario) {
				importeT+=((ProductoUnitario)listaCompra[i]).getImporteTotal() ;
			}else if(listaCompra[i] instanceof ProductoPeso){
				importeT+=((ProductoPeso)listaCompra[i]).getImporteTotal() ;
			}
		}
		
		return importeT;
	}
	
	//elimina un elemento del ticket
	public void borraElemento(int pos){
		if (pos < listaCompra.length && pos >= 0) {
			listaCompra[pos] = new Producto(null, null);
		} else {
			System.out.println("Fuera de rango");
		}
	}

	//agregador de elemento único
	public void agregarProducto(){
		int pos = primerLibre();

		if (pos != -1) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Introduce el nombre de producto");
			String nombre = sc.nextLine();
		
			System.out.println("Introduce el tipo de producto: \n 1-UNITARIO \n 2-PESO");
			int opc = sc.nextInt();
			sc.nextLine();
		
			System.out.println("Introduce el precio del producto");
			Double precio = sc.nextDouble();
		
			switch(opc) {
				case UNITARIO:
					System.out.println("Introduce la cantidad");
					int cantidad = sc.nextInt();
					listaCompra[pos] = new ProductoUnitario(nombre, null, cantidad, precio);
					break;
				case PESO:
					System.out.println("Introduce el peso");
					double peso = sc.nextDouble();
					listaCompra[pos] = new ProductoPeso(nombre, null, peso, precio);
					break;
			}
		}
	}

	//comprobador de que hay elementos en la lista
	public boolean operable(){
		boolean valido = false;
		for(int i = 0; i < listaCompra.length;i++){
			if (listaCompra[i] instanceof ProductoPeso || listaCompra[i] instanceof ProductoUnitario) {
				valido = true;
			}
		}
		return valido;
	}

	//obtiene el primer elemento libre de la lista
	public int primerLibre(){
		int libre=-1 , i=0;

		while (i < listaCompra.length && libre == -1) {
			if ( !(listaCompra[i] instanceof ProductoPeso) && !(listaCompra[i] instanceof ProductoUnitario) ) {
				libre = i;
			}

			i++;
		}

		return libre;
	}
}
