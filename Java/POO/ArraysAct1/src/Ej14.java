
public class Ej14 {
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
		int tamaño = 1+2+3+4+5+6+7+8+9+10, n = 1;
		
		int num[] = new int[tamaño];
		
		for(int i = 0; i < num.length; i++) {
			for(int j = 0; j <= i; j++) {
				num[i] = n;
				System.out.print(n + " ");
			}

			n++;
		}
		System.out.println();
		imprime(num);

	}
	

}
