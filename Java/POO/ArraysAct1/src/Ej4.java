import java.util.Scanner;

public class Ej4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double num[] = new double[5];
		
		double sumaP = 0, sumaN = 0;
		
		for(int i = 0; i < num.length; i++) {
			System.out.println("Introduce numero: ");
			num[i]=sc.nextDouble();
		}
		
		for(int i = 0; i < num.length; i++) {
			if(num[i] < 0) {
				sumaN+=num[i];
			}else {
				sumaP+=num[i];
			}
		}
		
		
		System.out.println("Total de positivos: " + sumaP);
		System.out.println("Total de negativos: " + sumaN);
		
	}

}
