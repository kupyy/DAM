package ejercicio1;

public class Main {

	public static void main(String[] args) {
		Articulo at1 = new Articulo("Arroz", 0, 4);
		
		at1.imprimir();
		
		at1.vender(3);
		System.out.println("==Venta de 3 artículos==");
		
		at1.imprimir();
		
		System.out.println("==Restock de 32 artículos==");
		at1.almacenar(32);
		at1.imprimir();
		
		System.out.println("==Pvp de articulo 1==");
		System.out.println(at1.getPVP(at1.getPrecio()));
		System.out.println("==Pvp de articulo 1 con 15% de descuento==");
		System.out.println(at1.getPVPDescuento(at1.getPrecio(), 15));

	}

}
