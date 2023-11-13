package Actividad7;
import java.util.Scanner;

public class ej6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número");
        int num = sc.nextInt();
        int cont = 1, resultado = 0;

        while(cont < num){
            if(num%cont==0){
                resultado+=cont;
            }
            cont++;
        }

        if (resultado == num) {
            System.out.println(num + " es perfecto");
        } else {
            System.out.println(num + " no es perfecto");
        }
    }
}
