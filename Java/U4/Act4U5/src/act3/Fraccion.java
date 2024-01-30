package act3;

public class Fraccion {
	private int num, den;
	
	public Fraccion() {
		num = 0;
		den = 1;
	}
	
	public Fraccion(int num, int den) {
		this.num = num;
		this.den = den;
	}

	
	public static int mcm(int a, int b) {
		int res = 0;
		
		while(!(res % a == res % b && res != 0)) {
			res+=a;
		}
		
		return res;
	}
	
	public static int mcd(int a , int b) {
		int res = 1;
		
		while(a % res != b % res && res > a && res > b) {
			System.out.println(a%res);
			System.out.println(b%res);
			res++;
		}
		
		return res;
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

	public Fraccion sumar(Fraccion f1) {
		Fraccion res = new Fraccion();
		
		if(this.den == f1.den) {
			res.num = this.num + f1.num;
			res.den = this.den;
		}else {
			res.den = this.den * f1.den;
			res.num = (this.num * f1.den) + (f1.num * this.den);
		}
		
		return res;
		
	}
	
	public Fraccion restar(Fraccion f1) {
		Fraccion res = new Fraccion();
		
		if(this.den == f1.den) {
			res.num = this.num - f1.num;
			res.den = this.den;
		}else {
			res.den = this.den * f1.den;
			res.num = (this.num * f1.den) - (f1.num * this.den);
		}
		
		return res;
	}
	
	public Fraccion multiplicar(Fraccion f1) {
		Fraccion res = new Fraccion();
		
		res.den = this.den*f1.den;
		res.num = this.num*f1.num;
		
		return res;
	}
	
	public Fraccion dividir(Fraccion f1) {
		Fraccion res = new Fraccion();
		
		res.den = this.den*f1.num;
		res.num = this.num*f1.den;
		
		return res;
		
	}
}
