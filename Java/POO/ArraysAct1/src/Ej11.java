
public class Ej11 {
	
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
		int arr1[] = new int[100];
		int arr2[] = new int[100];
		
		int j = 100;
		
		for(int i = 0 ; i < arr1.length; i++) {
			arr1[i] = i+1;
		}
		
		for(int i = 0; i < arr1.length; i++) {
			arr2[i] = j;
			j--;
		}
		
		
		imprime(arr1);
		imprime(arr2);
	}
}
