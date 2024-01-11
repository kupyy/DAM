import java.util.Arrays;

public class Ej18 {

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
		int arr[] = new int[30];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random()*10);
		}
		
		System.out.println("Array sin ordenar");
		imprime(arr);
		System.out.println("Array ordenado");
		Arrays.sort(arr);
		imprime(arr);

	}

}
