package Actividad4;
import java.util.Scanner;

public class ej12 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num, contPos = 0, contNeg = 0;

        do {
            System.out.println("Introduce un número");
            num = sc.nextInt();
            if(num < 0){
                contNeg++;
            }else if (num > 0){
                contPos++;
            }

        } while (num != 0);

        System.out.println("Cantidad de positivos: " + contPos);
        System.out.println("Cantidad de negativos: " + contNeg);
    }
}
