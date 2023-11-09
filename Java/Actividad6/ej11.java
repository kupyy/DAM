package Actividad6;
import java.util.Scanner;

public class ej11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Introduce un número: ");
        n = sc.nextInt();

        //System.out.println();

        for (int i = 1; i <= n; i++) { 
            for(int j = 0; j<i; j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
