package Actividad4;
import java.util.Scanner;

public class ej13 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num, factorial = 1;
        System.out.println("Introduce un numero");
        num=sc.nextInt();

        for(int i = 1; i<=num; i++){
            factorial *= i;
        }
        System.out.println("El factorial es " + factorial);
    }
}
