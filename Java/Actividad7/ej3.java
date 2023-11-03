package Actividad7;
import java.util.Scanner;

public class ej3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long resultado = 1;
        System.out.println("Introduce el primer numero:");
        int num1 = sc.nextInt();
        System.out.println("Introduce el segundo numero:");
        int num2 = sc.nextInt();

        if (num2<=num1) {
            System.out.println("Rango incorrecto");
        } else {
            while (num1<=num2) {
                resultado*=num1;
                num1++;
            }
            System.out.println(resultado);
        }
    }
}
