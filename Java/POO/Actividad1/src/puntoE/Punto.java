package puntoE;
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
	public int distancia(int dx, int dy) {
		int distanciaxY;
		
		distanciaxY=(int)Math.sqrt((dx-x)+(dy-y));
		
		return distanciaxY;
	}
	
	//crear punto aleatorio
	public static Punto puntoRandom() {
		int rX = (int) (Math.random()*100)+1;
		int rY = (int) (Math.random()*100)+1;
		Punto p = new Punto(rX, rY);
		return p;
	}
	
	//Constructor de objeto
	public Punto(int x, int y){
		this.x = x;
		this.y = y;
	}
}
