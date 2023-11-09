package Actividad6;
import java.util.Scanner;

public class ej8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int horas, minutos, segundos, incrementoS, incrementoM, incrementoH;

        System.out.println("Introduce las horas");
        horas = sc.nextInt();
        System.out.println("Introduce los minutos");
        minutos = sc.nextInt();
        System.out.println("Introduce los segundos");
        segundos = sc.nextInt();

        System.out.println("Introduce los segundos a avanzar");
        incrementoS = sc.nextInt();

        //se pasan los segundos a minutos
        incrementoM = incrementoS/60;
        //se pasan los minutos a horas
        incrementoH = incrementoM/60;
        //se restan los minutos que aumentan a los segundos introducidos
        incrementoS = incrementoS-incrementoM*60;
        //se restan las horas que aumentan a los minutos
        incrementoM = incrementoM-incrementoH*60;

        System.out.println("Hora anterior");
        System.out.println(horas+":"+minutos+":"+segundos);

        //se actualiza la hora introducida, comprobando el formato


        if ((segundos+incrementoS) >= 60) {
            segundos = 0;
            incrementoM++;
            if ((minutos+incrementoM) >= 60) {
                minutos = 0;
                incrementoH++;
                if((horas+incrementoH) == 23){
                    horas=0;
                }else if((horas+incrementoH) > 24){
                horas = 0;
                horas+=incrementoH-1;
                horas=horas%24;
                }
            }else{
                minutos+=incrementoM;
            }
        }else{
            segundos+=incrementoS;
        }

        System.out.println("Hora nueva");
        System.out.println(horas+":"+minutos+":"+segundos);
        
        
    }
}
