package Actividad8;
import java.util.Scanner;

public class ej1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, m;
        System.out.println("Introduce el primer numero");
        n = sc.nextInt();
        System.out.println("Introduce el segundo numero");
        m = sc.nextInt();

        while (m>0) {
            n/=10;
            m--;
        }

        System.out.println(n);
    }
}
