package Actividad6;
import java.util.Scanner;

public class ej13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce una frase");
        String frase = sc.nextLine();

        frase = frase.replace(" ", "");

        System.out.println(frase);
    }
}
