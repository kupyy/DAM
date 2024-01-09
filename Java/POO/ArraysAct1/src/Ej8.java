import java.util.Scanner;

public class Ej8 {
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
		
		double num[] = new double[100];
		double media = 0, n = 0;
		int cont=0;
		
		for(int i = 0; i < num.length; i++) {
			num[i] = Math.random();
		}
		
		System.out.println("Introduce un número entre 0 y 1");
		n = sc.nextDouble();
		
		for(int i = 0; i < num.length; i++) {
			if(n >= num[i]) {
				cont++;
			}
		}
		
		System.out.println(cont  + " valores son iguales o mayores");
		
	}
}
