package puntoC;

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
	
	//Constructor de objeto
	public Punto(int x, int y){
		this.x = x;
		this.y = y;
	}
}
