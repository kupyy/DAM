package ejercicio2;
import java.util.Scanner;

public class Cuenta {
	//Escaner
	Scanner sc = new Scanner(System.in);
	
	private String titular;
	private double cantidad;
	
	//getters & setters
	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getCantidad() {
		return cantidad;
	}

	public void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}
	
	public String mostrar() {
		return "Titular: " + titular + ". Cantidad disponible:" + cantidad + "€";
	}
	
	public void ingresar() {
		System.out.println("Introduzca la cantidad a ingresar");
		double cantidad = sc.nextDouble();
		if(cantidad > 0) this.cantidad+=cantidad;
	}
	
	public void retirar() {
		System.out.println("Introduzca la cantidad a ingresar");
		double cantidad = sc.nextDouble();
		this.cantidad-=cantidad;
		if(this.cantidad<0) this.cantidad=0;
	}

	//class constructors
	public Cuenta(String titular, double cantidad) {
		if(titular.equals("")) {
			do {
				System.err.println("Error:No se puede introducir un titular vacío, pruebe de nuevo");
				titular = sc.nextLine();
			}while(titular.equals(""));
		}
		this.titular = titular;
		if(cantidad < 0) {
			this.cantidad = 0;
		}else{
			this.cantidad = cantidad;
		}
	}
	
	public Cuenta(String titular) {
		if(titular.equals("")) {
			do {
				System.err.println("Error:No se puede introducir un titular vacío, pruebe de nuevo");
				titular = sc.nextLine();
			}while(titular.equals(""));
		}
		this.titular = titular;
	}

}
