import java.util.Scanner;

public class Ej2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double num[] = new double[10];
		double suma = 0;
		
		for(int i = 0; i < num.length; i++) {
			System.out.println("introduce numero");
			num[i]=sc.nextDouble();
			suma+=num[i];
		}
		
		System.out.println(suma);
	}
}
