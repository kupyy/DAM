import java.util.Scanner;

public class Ej5 {
	
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
		
		double num[] = new double[5];
		double media = 0;
		
		pide(num);
		
		for(int i = 0; i < num.length; i++) {
			media+=num[i];
		}
		
		media/=num.length;
		
		System.out.println("Valor medio: " + media);
		
		
	}

}
