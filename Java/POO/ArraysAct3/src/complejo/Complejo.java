package complejo;

public class Complejo {
	public static void main(String[] args) {

		int a = 3;
		int b = 5;
		int mcm = 0;
		boolean exit = false;
		
		while(!exit) {
			if(a == b) {
				mcm = a;
				exit = true;
			}else {
				a = a + a;
				b = b+b;
			}
		}
		
		System.out.println(mcm);
	}
}
