import java.util.Arrays;
import java.util.Scanner;

public class Ej9 {
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
		
		int num[] = new int[100];
		int n;
		
		for(int i = 0; i < num.length; i++) {
			num[i] = (int) (1+Math.random()*10);
		}
		
		System.out.println("Introduce un numero");
		n = sc.nextInt();
		
		imprime(num);
		
		for(int i =0; i < num.length; i++) {
			if(n == num[i]) {
				System.out.println(i);
			}
		}
	}

}
