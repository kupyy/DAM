package Actividad3;
import java.util.Scanner;

public class ej8 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el sueldo del empleado");
        double sueldo = sc.nextDouble();
        
        if ( sueldo < 18000 ){
            sueldo += sueldo*0.05;
        }else if ( sueldo > 17999 && sueldo <= 25000){
            sueldo += sueldo*0.03;
        }else{
            sueldo += sueldo*0.02;
        }
        System.out.println(sueldo);
    }
}
