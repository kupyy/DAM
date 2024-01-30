package act2;

public class Main {
	public static void main(String[] args) {
		Comercial c = new Comercial("Wenfi", "ndesemana", 24, 1300.45, 49);
		
		System.out.println(c.plus(400));
		
		System.out.println(c.getSalario());
	}
}
