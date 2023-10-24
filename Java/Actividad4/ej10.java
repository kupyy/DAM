package Actividad4;
import java.util.Scanner;

public class ej10 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int numNotas;
        double mediaNotas, totalNotas;
        System.out.println("Introduce la cantidad de notas a introducir");
        numNotas=sc.nextInt();
        totalNotas = 0;

        for(int i = 0; i<numNotas; i++){
            System.out.println("Introduce una nota");
            totalNotas+=sc.nextDouble();
        }

        mediaNotas=totalNotas/numNotas;
        System.out.println("La nota media es " + mediaNotas);
    }
}
