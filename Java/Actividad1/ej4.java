package Actividad1;
import java.util.Scanner;

public class ej4 {
    public static void main(String[] args){
        //Escaner
        Scanner sc = new Scanner(System.in);

        //Declaracion de variables
        int num1, num2;

        //Operaciones
        System.out.println("Introduce el primer número:");
        num1 = sc.nextInt();

        System.out.println("Introduce el segundo número:");
        num2 = sc.nextInt();

        System.out.println("El resultado es " + (num1+num2));
    }
}
