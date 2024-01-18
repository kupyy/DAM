package passwd;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce la cantidad de contraseñas a crear");
		int longi = sc.nextInt();
		
		System.out.println("Introduce la longitud de las contraseñas");
		int longC = sc.nextInt();
		
		Password contr[] = new Password[longi];
		boolean esF[] = new boolean[longi];
		
		for(int i = 0; i < longi; i++) {
			contr[i] = new Password(longC);
			esF[i] = contr[i].esFuerte();
			System.out.println(contr[i].getPass() + " → " + esF[i]);
		}
	}

}
