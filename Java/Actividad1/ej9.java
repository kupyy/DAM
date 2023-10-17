package Actividad1;
import java.util.Scanner;

public class ej9 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //Numero a comparar
        int num = sc.nextInt();
        //Comparación
        if(num % 2 == 0){
            System.out.println("Es par");
        }else{
            System.out.println("Es impar");
        }
    }
}
