package Actividad5;
import java.util.Scanner;

public class ej5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero");
        int n =sc.nextInt();
        int fibo1=1, fibo2=1, suma=1;

        System.out.print(fibo1+" ");

        for (int i = 2; i <= n; i++){
            System.out.print(suma + " ");

            suma = fibo1+fibo2;

            fibo1=fibo2;

            fibo2=suma;
        }
        System.out.println();
    }
}
