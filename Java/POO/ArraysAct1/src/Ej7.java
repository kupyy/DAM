import java.util.Scanner;

public class Ej7 {
	public static void pide(double arr[]) {
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println("Introduce numero: ");
			arr[i]=sc.nextDouble();
		}

	}
	
	public static void imprime(int arr[]) {
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
		int n1, n2;
		
		System.out.println("Introduce el primer valor");
		n1 = sc.nextInt();
		System.out.println("Introduce el primer valor");
		n2 = sc.nextInt();
		
		int num[] = new int[n2-n1+1];
		
		for(int i = 0; i < num.length; i++) {
			num[i] = n1;
			n1++;
		}
		
		imprime(num);
	}
}
