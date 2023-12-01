package puntoD;
import java.lang.Math;

public class Punto {
	private int x;
	private int y;
	
	
	//getters & setters
	//x
	public int getX() {
		return x;
	}
	
	public void setX(int x) {
		this.x = x;
	}

	//y
	public int getY() {
		return y;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	//metodos
	//mostrar coords
	public void imprime() {
		System.out.print("(" + x + ", " + y + ")");
	}
	
	//modificar ambos valores
	public void setXY(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	//desplazar coordenadas
	public void desplaza(int dX, int dY) {
		x+=dX;
		y+=dY;
	}
	
	//distancia entre 2 puntos
	public int distancia(Punto p) {
		int distanciaxY;
		
		distanciaxY=(int)Math.sqrt(Math.pow(this.x-p.x, 2)+Math.pow(this.y-p.y, 2));
		
		
		return distanciaxY;
	}
	
	//Constructor de objeto
	public Punto(int x, int y){
		this.x = x;
		this.y = y;
	}
}
