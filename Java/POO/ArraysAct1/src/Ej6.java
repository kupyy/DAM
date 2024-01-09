import java.util.Arrays;
import java.util.Scanner;

public class Ej6 {

	public static void pide(double arr[]) {
		Scanner sc = new Scanner(System.in);
			
		for(int i = 0; i < arr.length; i++) {
			System.out.println("Introduce numero: ");
			arr[i]=sc.nextDouble();
		}
	}
		
	public static void imprime(double arr[]) {
		for(int i = 0; i < arr.length; i++) {
			if(i == arr.length-1) {
				System.out.println(arr[i]);
			}else {
				System.out.print(arr[i] + ", ");
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce el primer valor");
		int n1 = sc.nextInt();
		System.out.println("Introduce el segundo valor");
		int n2 = sc.nextInt();
		
		double num[] = new double[n1];
		
		Arrays.fill(num, n2);
		
		imprime(num);
		
		
	}
}


