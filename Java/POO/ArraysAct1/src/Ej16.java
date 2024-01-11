import java.util.Arrays;

public class Ej16 {
	
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
		int longitud = 10+9+8+7+6+5+4+3+2+1;
		int indexI=0, indexF=1;
		int arr[] = new int[longitud];
		
		
		for(int i =1; i <=10; i++) {
			Arrays.fill(arr, indexI, indexF, i);
			indexI=indexF;
			indexF+=i+1;
		}
		
		
		
		System.out.println();
		imprime(arr);
	}
	

}
