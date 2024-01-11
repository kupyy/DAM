import java.util.Arrays;
import java.util.Scanner;

public class Ej17 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr1[] = new int[5];
		int arr2[] = new int[5];
		
		for(int i = 0; i < arr1.length; i++) {
			System.out.println("Introduce un valor");
			arr1[i] = sc.nextInt();
		}
		
		for(int i = 0; i < arr2.length; i++) {
			System.out.println("Introduce un valor");
			arr2[i] = sc.nextInt();
		}
		
		if(Arrays.equals(arr1, arr2)) {
			System.out.println("Ambos arrays son iguales");
		}else {
			System.out.println("Ambos arrays son distintos");
		}
		
	}

}
