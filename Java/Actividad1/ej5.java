package Actividad1;
import java.util.Scanner;

public class ej5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //Variables
        float num1, num2;

        //Asignacion de valores
        System.out.println("Introduce el primer número:");
        num1 = sc.nextFloat();
        System.out.println("Introduce el segundo número:");
        num2 = sc.nextFloat();
        
        //Resultados
        System.out.println("La suma de " + num1 + " y de " + num2 + " es " + (num1+num2));
        System.out.println("La resta de " + num1 + " y de " + num2 + " es " + (num1-num2));
        System.out.println("La multiplicación de " + num1 + " y de " + num2 + " es " + (num1*num2));
        System.out.println("La división de " + num1 + " y de " + num2 + " es " + (num1/num2));
    }
}
