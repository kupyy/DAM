package Actividad4;
import java.util.Scanner;

public class ej21 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = 0;
        boolean esPrimo=true;
        System.out.println("Introduce un numero");
        num = sc.nextInt();

        for(int i = 1; i<=num; i++){
            if(num%i==0 && i>1 && i<num){
                esPrimo = false;
            }
        }

        if(esPrimo){
            System.out.println("Es primo");
        }else{
            System.out.println("No es primo");
        }
    }
}
