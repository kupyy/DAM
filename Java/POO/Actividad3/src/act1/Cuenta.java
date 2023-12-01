package act1;

public class Cuenta {
	private String nombreCliente, numeroCuenta;
	private double interes, saldo;
	private static String ultimaCuenta = "00000000000000000000";
	
	//setters & getters
	public String getNombreCliente() {
		return nombreCliente;
	}

	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}

	public String getNumeroCuenta() {
		return numeroCuenta;
	}

	public void setNumeroCuenta(String numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}

	public double getInteres() {
		return interes;
	}

	public void setInteres(double interes) {
		this.interes = interes;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public static String getUltimaCuenta() {
		return ultimaCuenta;
	}

	public static void setUltimaCuenta(String ultimaCuenta) {
		Cuenta.ultimaCuenta = ultimaCuenta;
	}
	
	//class methods
	/**
	 * Account generator
	 * */
	private String generaCuenta(String ultimaC) {
		int digUltima = Integer.parseInt(ultimaC);
		digUltima++;
		ultimaC = Integer.toString(digUltima);
		
		while(ultimaC.length()<20) {
			ultimaC = "0" + ultimaC;
		}
		
		ultimaCuenta = ultimaC;
		return ultimaCuenta;
	}
	
	/**
	 * Obtain IBAN
	 * */
	public String obtenerIBAN() {
		return "ES16"+numeroCuenta;
	}
	
	/**
	 * Show account data
	 * */
	public void muestraC() {
		System.out.println("Nombre del titular: " + nombreCliente);
		System.out.println("IBAN: " + obtenerIBAN());
		System.out.println("Interés: " + interes + "%");
		System.out.println("Saldo: " + saldo + "€");
	}
	
	/**
	 * interes
	 * */
	public double calcInteres() {
		double interesF;
		interesF = saldo+(saldo*interes/100);
		
		return interesF;
	}
	
	/**
	 * interes by time(years)
	 * */
	public double calcInterest(int t) {
		double interesF;
		interesF = saldo+(saldo*interes/100*3);
		
		return interesF;
	}
	
	/**
	 * ingreso
	 * */
	public boolean ingreso(double ingreso) {
		boolean posible = false;
		
		if(ingreso > 0) {
			saldo+=ingreso;
			posible = true;
		}
		
		return posible;
	}
	
	/**
	 * reintegro
	 * */
	public boolean reintegro(double retiro) {
		boolean posible = false;
		
		if(retiro > 0 && retiro < saldo) {
			saldo-=retiro;
			posible = true;
		}
		
		return posible;
	}
	
	/*
	 * transpher
	 * */
	public boolean transfer(Cuenta c, double cantidad) {
		boolean posible = false;
		if(this.saldo > cantidad && cantidad > 0) {
			this.saldo-=cantidad;
			c.saldo+=cantidad;
			posible = true;
		}
		
		return posible;
	}

	//class constructor
	/**
	 * Default
	 * */
	public Cuenta() {
		numeroCuenta = generaCuenta(ultimaCuenta);
	}
	
	/**
	 * Constructor 2
	 * */
	public Cuenta(String nombreCliente, double saldo, double interes) {
		numeroCuenta = generaCuenta(ultimaCuenta);
		this.nombreCliente = nombreCliente;
		this.interes = interes;
		this.saldo = saldo;
	}
	
	/**
	 * Constructor 3
	 * */
	public Cuenta(String nombreCliente) {
		numeroCuenta = generaCuenta(ultimaCuenta);
		this.nombreCliente = nombreCliente;
		this.interes = 1;
		this.saldo = 0;
	}
}
