package act3;
import java.lang.Math;

public class Complejo {
	private double p_r, p_i;
	
	//getters & setters
	public double getP_r() {
		return p_r;
	}

	public void setP_r(double p_r) {
		this.p_r = p_r;
	}

	public double getP_i() {
		return p_i;
	}

	public void setP_i(double p_i) {
		this.p_i = p_i;
	}

	
	//methods
	public String mostrar() {
		return "(" + p_r + ", " + p_i + ")";
	}
	
	public Complejo sumar(Complejo c) {
		Complejo res = new Complejo();
		
		res.p_i = (this.p_i + c.p_i);
		res.p_r = (this.p_r + c.p_r);
		return res;
	}
	
	public Complejo restar(Complejo c) {
		Complejo res = new Complejo();
		
		res.p_i = (this.p_i - c.p_i);
		res.p_r = (this.p_r - c.p_r);
		return res;
	}
	
	public Complejo multiplicar(Complejo c) {
		Complejo res = new Complejo();
		
		res.p_i = (p_r*c.p_r + p_i * c.p_i);
		res.p_r = (p_r*c.p_r - p_i * c.p_i);
		
		return res;
	}
	
	public Complejo multiplicar(double n) {
		Complejo res = new Complejo();
		
		res.p_i = (this.p_i * n);
		res.p_r = (this.p_r * n);
		return res;
	}
	
	public Complejo dividir(Complejo c) {
		Complejo res = new Complejo();
		
		res.p_r = ( (p_r*c.p_r) / (Math.pow(c.p_r, 2) + Math.pow(c.p_i, 2)) );
		res.p_i = ( (p_i * c.p_r) / (Math.pow(c.p_r, 2) + Math.pow(c.p_i, 2)) );
		return res;
	}
	
	public void iguales(Complejo c) {
		if (!(p_r==c.p_r && p_i == c.p_i)) {
			System.out.println(this.mostrar() + " distinto que " + c.mostrar());
		} else {
			System.out.println(this.mostrar() + " igual que " + c.mostrar());
		}
	}
	
	
	//class constructors
	public Complejo() {
		p_i = 0;
		p_r = 0;
	}
	
	public Complejo(double p_r, double p_i) {
		this.p_i = p_i;
		this.p_r = p_r;
	}

}
