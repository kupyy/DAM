package Actividad6;
import java.util.Scanner;

public class ej10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número");
        int num = sc.nextInt();

        for(int i = 0; i<num; i++){
            System.out.print("*");
        }
        System.out.println();
    }
}
