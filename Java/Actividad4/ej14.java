package Actividad4;
import java.util.Scanner;

public class ej14 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double notaMedia=0, totalNotas=0, nota;

        do{
            System.out.println("Introduce una nota");
            nota=sc.nextDouble();
            if(nota>-1){
                totalNotas++;
                notaMedia+=nota;
            }
        }while(nota>=0);

        notaMedia/=totalNotas;
        System.out.println("La nota media es " + notaMedia);
    }
}
