package Actividad6;
import java.util.Scanner;

public class ej12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce una frase");
        String frase = sc.nextLine();

        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i)!=' ') {
                System.out.print(frase.charAt(i));
            }
        }
        System.out.println();
    }
}
