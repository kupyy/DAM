import java.util.Arrays;
import java.util.Scanner;

public class Ej15 {
	
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
		int num, tam;
		
		System.out.println("Introduce el numero a introducir");
		num = sc.nextInt();
		System.out.println("Introduce el tamaño del array");
		tam = sc.nextInt();
		
		int arr[]= new int[tam];
		
		Arrays.fill(arr, num);
		
		imprime(arr);
	}

}
