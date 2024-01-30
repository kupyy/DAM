package act3;

public class Main {

	public static void main(String[] args) {
		int a= 5 , b = 12, res = 1;
		
		
		
		while(res < a && res < b) {
			if(a % res == b % res) {
				res = a;
			}
		}
		
		System.out.println(res);
	}

}
