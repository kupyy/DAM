package Actividad1;
import java.util.Scanner;

public class ej8 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //Número a comparar
        int num = sc.nextInt();

        //Comparación del número
        if(num < 10){
            System.out.println("Es menor que 10");
        }else if (num > 10){
            System.out.println("Es mayor que 10");
        }else{
            System.out.println("Es igual que 10");
        }
    }
}
