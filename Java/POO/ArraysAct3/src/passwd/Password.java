package passwd;

public class Password {
	private int longitud=8;
	private String contraseña;
	
	public String getPass() {
		return this.contraseña;
	}
	
	
	public Password() {
		
	}
	
	public Password(String contraseña) {
		this.contraseña = contraseña;
		longitud = contraseña.length();
	}
	
	public Password(int longi) {
		longitud = longi;
		contraseña = this.generarPassword();
	}
	
	public boolean esFuerte() {
		boolean esFuerte = false;
		int nmayus=0, nminus=0, nnum=0;

		
		for(int i = 0; i < contraseña.length(); i++) {
			if(contraseña.charAt(i) >= 65 && contraseña.charAt(i) <= 90) {
				nmayus++;
			}else if(contraseña.charAt(i) >= 97 && contraseña.charAt(i) <= 122) {
				nminus++;
			}else if(contraseña.charAt(i) >= 48 && contraseña.charAt(i) <= 57 ){
				nnum++;
			}
		}
		


		if(nmayus > 2 && nminus > 1 && nnum > 5) {
			esFuerte = true;
		}
		
		return esFuerte;
	}
	
	public void tal(String c) {
		for(int i = 0; i < c.length(); i++) {
			System.out.println((int)c.charAt(i));
		}
	}
	
	public String generarPassword() {
		String contr = "";
		final int MAYUS = 1;
		final int MINUS = 2;
		final int NUM = 3;
		int gen = 0;
		
		for(int i = 0; i < this.longitud; i++) {
			gen = (int)(1+Math.random()*3);
			
			switch(gen) {
				case MAYUS:
					contr = contr + (char)(65+Math.random()*26);
					break;
				case MINUS:
					contr = contr + (char)(97+Math.random()*26);
					break;
				case NUM:
					contr = contr + (int)(1+Math.random()*10);
					break;
			}
		}
		
		return contr;
	}
	
}
