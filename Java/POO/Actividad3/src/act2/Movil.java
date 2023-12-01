package act2;

public class Movil {
	private String marca, modelo, procesador;
	private double precio, pulgadas;
	private int pBenchmark, versionAndroid;
	
	//getters & setters
	//marca
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	//modelo
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	//procesador
	public String getProcesador() {
		return procesador;
	}
	public void setProcesador(String procesador) {
		this.procesador = procesador;
	}
	//precio
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	//pulgadas
	public double getPulgadas() {
		return pulgadas;
	}
	public void setPulgadas(double pulgadas) {
		this.pulgadas = pulgadas;
	}
	//benchmark
	public int getpBenchmark() {
		return pBenchmark;
	}
	public void setpBenchmark(int pBenchmark) {
		this.pBenchmark = pBenchmark;
	}
	//version android
	public int getVersionAndroid() {
		return versionAndroid;
	}
	public void setVersionAndroid(int versionAndroid) {
		this.versionAndroid = versionAndroid;
	}
	
	//class methods
	public void mostrar() {
		System.out.println("Marca: " + marca);
		System.out.println("Modelo: " + modelo);
		System.out.println("Procesador: " + procesador);
		System.out.println("Precio: " + precio + "€");
		System.out.println("Pulgadas de pantalla: " + pulgadas + "\"");
		System.out.println("Puntuación de benchmark: " + pBenchmark);
		System.out.println("Versión de Android: " + versionAndroid);
	}
	
	public void copiaMovil(Movil m) {
		this.marca = m.marca;
		this.modelo = m.modelo;
		this.procesador = m.procesador;
		this.precio = m.precio;
		this.pulgadas = m.pulgadas;
		this.pBenchmark = m.pBenchmark;
		this.versionAndroid = m.versionAndroid;
	}
	
	public String comparaBenchmark(Movil m) {
		String mejorM;
		if(m.pBenchmark > this.pBenchmark) {
			mejorM = m.marca + " " + m.modelo;
		}else {
			mejorM = this.marca + " " + this.modelo;
		}
		
		return mejorM;
	}
	
	public String comparaPrecio(Movil m) {
		String masCaro;
		if(m.precio> this.precio) {
			masCaro = m.marca + " " + m.modelo;
		}else {
			masCaro = this.marca + " " + this.modelo;
		}
		
		return masCaro;
	}
	
	public boolean estaActualizado(Movil m) {
		return (m.versionAndroid >= 12 && m.versionAndroid <= 14);
	}
	
	public String clasificaPantalla(Movil m) {
		String tamanno;
		
		if(m.pulgadas < 5) {
			tamanno = "compacto";
		}else if(m.pulgadas > 6.5) {
			tamanno = "grande";
		}else {
			tamanno = "medio";
		}
		
		return tamanno;
	}
	
	public String clasificaMovil(Movil m) {
		String gama;
		
		if(m.pBenchmark < 1000) {
			gama = "compacto";
		}else if(m.pBenchmark > 2000) {
			gama = "grande";
		}else {
			gama = "medio";
		}
		
		return gama;
	}
	
	//class constructors
	public Movil() {
		
	}
	
	public Movil(String marca, String modelo, String procesador, double precio, double pulgadas, int pBenchmark,
			int versionAndroid) {
		this.marca = marca;
		this.modelo = modelo;
		this.procesador = procesador;
		this.precio = precio;
		this.pulgadas = pulgadas;
		this.pBenchmark = pBenchmark;
		this.versionAndroid = versionAndroid;
	}
	
	public Movil(String marca, String modelo, String procesador, double precio, double pulgadas,
			int versionAndroid) {
		this.marca = marca;
		this.modelo = modelo;
		this.procesador = procesador;
		this.precio = precio;
		this.pulgadas = pulgadas;
		this.versionAndroid = versionAndroid;
	}

}
