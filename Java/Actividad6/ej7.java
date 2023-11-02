package Actividad6;
import java.util.Scanner;
import java.lang.Math;

public class ej7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean acierto=false, esCero = false;
        int numeroUsuario = 0;
        double numAleatorio = Math.random()*10+1;

        
        do {
            System.out.println("Introduce un número");
            numeroUsuario = sc.nextInt();

            if ((int) numAleatorio == numeroUsuario) {
                System.out.println("Has acertado");
                acierto = true;
            }else if (numeroUsuario == 0) {
                esCero = true;
            }
        } while (!acierto && !esCero);

    }
}
