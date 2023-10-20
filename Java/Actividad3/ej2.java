package Actividad3;
import java.util.Scanner;

public class ej2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //Declaración de variables
        int num1, num2, num3 = 0;

        //Asinación de variables
        System.out.println("Introduce el primer número");
        num1=sc.nextInt();
        System.out.println("Introduce el segundo número");
        num2=sc.nextInt();
        System.out.println("Introduce el tercer número");
        num3=sc.nextInt();

        //Comparación de números
        if (num1 > num2 && num1 > num3){
            System.out.println("Numero 1 es mayor");
        }else if( num2 > num3 && num2 > num1){
            System.out.println("Numero 2 es mayor");
        }else if(num3 > num1 && num3 > num2){
            System.out.println("Numero 3 es mayor");
        }else{
            System.out.println("Todos los números son iguales");
        }
    }
}
