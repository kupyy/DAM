package Actividad3;
import java.util.Scanner;
public class ej10 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce tu nota");
        double nota = sc.nextDouble();

        if(nota < 0 || nota > 10){
            System.out.println("Nota incorrecta");
        }else if( nota < 5){
            System.out.println("Insuficiente");
        }else if( nota < 7 ){
            System.out.println("Suficiente");
        }else if( nota < 9 ){
            System.out.println("Notable");
        }else{
            System.out.println("Sobresaliente");
        }
    }
}
