package fracciones;

public class Fracc {
	private int num, den;
	
	public Fracc() {
		num = 0;
		den = 1;
	}
	
	public static int mcm(int a, int b) {
		int res = 0;
		
		while(!(res % a == res % b && res != 0)) {
			res+=a;
		}
		
		return res;
	}
	
	public Fracc(int num, int den) {
		this.num = num;
		this.den = den;
	}
	
	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public int getDen() {
		return den;
	}

	public void setDen(int den) {
		this.den = den;
	}
	
	public void mostrarF() {
		System.out.println(this.num + "/" + this.den);
	}

	public Fracc sumar(Fracc f1) {
		Fracc res = new Fracc();
		
		if(this.den == f1.den) {
			res.num = this.num + f1.num;
			res.den = this.den;
		}else {
			res.den = this.den * f1.den;
			res.num = (this.num * f1.den) + (f1.num * this.den);
		}
		
		return res;
		
	}
	
	public Fracc restar(Fracc f1) {
		Fracc res = new Fracc();
		
		if(this.den == f1.den) {
			res.num = this.num - f1.num;
			res.den = this.den;
		}else {
			res.den = this.den * f1.den;
			res.num = (this.num * f1.den) - (f1.num * this.den);
		}
		
		return res;
	}
	
	public Fracc multiplicar(Fracc f1) {
		Fracc res = new Fracc();
		
		res.den = this.den*f1.den;
		res.num = this.num*f1.num;
		
		return res;
	}
	
	public Fracc dividir(Fracc f1) {
		Fracc res = new Fracc();
		
		res.den = this.den*f1.num;
		res.num = this.num*f1.den;
		
		return res;
		
	}
}
