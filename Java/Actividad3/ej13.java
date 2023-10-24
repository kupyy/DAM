package Actividad3;
import java.util.Scanner;

public class ej13 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número");
        double n=sc.nextDouble();
        String nCad=String.valueOf(n);
        if (( n - (int)n ) == 0){
            System.out.println("El número tiene " + (nCad.length()-2) + " cifras");
        }else{
            System.out.println("El número tiene " + (nCad.length()-1) + " cifras");
        }
    }
}
