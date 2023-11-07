package Actividad7;
import java.util.Scanner;

public class ej5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double notas = 0, apobados = 0, suspensos = 0, notable = 0, nota = 0;

        boolean esNegativa = false;
        
        do {
            System.out.println("Introduce una nota");
            nota = sc.nextDouble();
            if (nota < 0) {
                esNegativa = true;
            } else {
                notas++;
                if(nota < 5){
                    suspensos++;
                }else if (nota >= 5 && nota<=10) {
                    apobados++;
                    if(nota >=7 && nota<=8){
                        notable++;
                    }
                }
            }
            
        } while (!esNegativa);

        System.out.println("Hay " + suspensos + " suspensos (" + suspensos/notas*100 + "%)");
        System.out.println("Hay " + apobados + " aprobados (" + apobados/notas*100 + "%)");
        System.out.println("Hay " + notable + " notables (" + notable/apobados*100 + "%)");
    }
}
