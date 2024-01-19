package complejo;

public class Main {

	public static void main(String[] args) {
		int a = 400;
		int b = 780;
		int res = 0;
		
		while(!(res % a == res % b && res != 0)) {
			res+=b;
		}
		
		System.out.println(res);
	}

}
