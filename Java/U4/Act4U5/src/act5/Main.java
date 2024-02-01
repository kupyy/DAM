package act5;

public class Main {
	public static void main(String[] args) {
		
		ArrayReales arr = new ArrayReales(10);
		
		System.out.println(arr);
		System.out.println("Mayor: " + arr.maximo());
		System.out.println("Menor: " + arr.minimo());
		System.out.println("Total: " + arr.sumatorio());
	}
}
