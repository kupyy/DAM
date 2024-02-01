package act3;

public class Fraccion implements Relacionable, Comparable<Fraccion>{
	private int num, den;
	
	public Fraccion() {
		num = 0;
		den = 1;
	}
	
	public Fraccion(int num, int den) {
		this.num = num;
		this.den = den;
	}

	
	public int mcm(int a, int b) {
		int res = 0;
		
		while(!(res % a == res % b && res != 0)) {
			res+=a;
		}
		
		return res;
	}
	
	public int mcd(int a, int b) {
		int res = 0;
		while (b != 0) {
			res = b;
	        b = a % b;
	        a = res;
	    }
		return res;
	}
	
	public void simplificar() {
		int maxCd = mcd(this.getDen(), this.getNum());
		this.setDen(this.getDen()/maxCd);
		this.setNum(this.getNum()/maxCd);
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

	@Override
	public boolean esMayorQue(Relacionable a) {
		this.simplificar();
		((Fraccion)a).simplificar();
		
		return ((Fraccion)a).getDen() < (this.getDen()) && ((Fraccion)a).getNum() < this.getNum();
	}

	@Override
	public boolean esMenorQue(Relacionable a) {
		this.simplificar();
		((Fraccion)a).simplificar();
		
		return ((Fraccion)a).getDen() > (this.getDen()) && ((Fraccion)a).getNum() > this.getNum();
	}

	@Override
	public boolean esIgualQue(Relacionable a) {
		this.simplificar();
		((Fraccion)a).simplificar();
		
		return ((Fraccion)a).getDen() == (this.getDen()) && ((Fraccion)a).getNum() == this.getNum();
	}

	@Override
	public String toString() {
		return num + "/" + den;
	}

	@Override
	public int compareTo(Fraccion o) {
		int res = 0;
		
		if(this.esMayorQue(o)) {
			res = 1;
		}else if(this.esIgualQue(o)) {
			res = 0;
		}else {
			res = -1;
		}
		
		return res;
	}
	
	
	
}
