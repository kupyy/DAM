package Actividad4;
import java.util.Scanner;

public class ej11 {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int n, contadorNeg = 0;
        boolean esNegativo = false;

        for(int i = 0; i<10; i++){
            System.out.println("Introduce un número");
            n = sc.nextInt();
            if(n<0){
                esNegativo=true;
                contadorNeg++;
            }
        }

        if(esNegativo){
            System.out.println("ERROR. Se ha introducido " + contadorNeg + " número/s negativo/s");
        }
    }
}
