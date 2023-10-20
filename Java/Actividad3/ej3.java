package Actividad3;
import java.util.Scanner;
import java.lang.Math;

public class ej3 {
    public static void main(String[] args){
        //Escaner
        Scanner sc = new Scanner(System.in);

        //Variables
        int num = 0;
        double cuadrado = 0, raiz = 0;
    
        System.out.println("Introduce un número:");
        num = sc.nextInt();

        if(num <= 0){
            System.out.println("Opción incorrecta");
        }else{
            cuadrado=Math.pow(num, 2);
            raiz=Math.sqrt(num);
            System.out.println("Para el número "+num+", su potencia es "+ cuadrado + " y su raíz es " + raiz+".");
        }
    }
}
