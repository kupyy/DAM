package Actividad4;
import java.util.Scanner;

public class ej16 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double numero; 
        int resultado=0;
        System.out.println("Introduce un número");
        numero=sc.nextInt();

        while(numero>0){
            int nEntero = (int) numero;
            double nDecimal = numero - nEntero;
            resultado+=(nDecimal*10);
            numero = numero/10;
        }
        System.out.println(resultado);
    }
}
