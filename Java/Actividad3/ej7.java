package Actividad3;
import java.util.Scanner;

public class ej7 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int horas, horas_extra, salario,salario_extra;

        System.out.println("Introduce las horas trabajadas en la semana");
        horas=sc.nextInt();
        System.out.println("Introduce el salario por hora");
        salario=sc.nextInt();
        if(horas > 40){
            horas_extra = horas-40;
            salario_extra=salario+(salario/2);

            System.out.println("Se ha trabajado un total de " + horas +" horas, de las cuales" + horas_extra + " son extra.");
            System.out.println("El salario es de " + (salario*40) + "€, agregando un aumento por horas extra de " + horas_extra*salario_extra + "€");
        }else{
            System.out.println("Se ha trabajado un total de " + horas + " horas, teniendo un salario semanal de " + (horas*salario)+"€");
        }

    }
}
