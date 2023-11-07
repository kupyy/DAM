package Actividad7;
import java.util.Scanner;

public class ej4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double resultado = 0.0;

        System.out.println("Introduce un número");
        double num = sc.nextInt();

        for (int i = 1; i <= num; i++) {
            resultado = resultado + 1.0/i;
        }

        System.out.println(resultado);
    }
}
