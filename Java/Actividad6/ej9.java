package Actividad6;
import java.util.Scanner;

public class ej9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rangoMin = 100, rangoMax=0, numeroMaquina = ((rangoMax+rangoMin)/2);
        boolean acierto=false;

        /*
         * se establece un rango de 0 a 100
         * el numero que de la maquina sera el numero medio que esté entre ambos mediante una media aritmética
         * si es mayor, el rango mínimo se actualiza al que da la maquina
         * si es menor, se actualiza el rango máximo al que ha dado la máquina
         * se repite el proceso hasta que se diga que es igual
         */
        

        
        do {
            if (numeroMaquina == 33) {
                System.out.println(numeroMaquina+"?");
            }else{
                System.out.println(numeroMaquina);
            }
            String condicion = sc.nextLine();

            if (condicion.equals("mayor")) {
                rangoMax = numeroMaquina;
                numeroMaquina = ((rangoMax+rangoMin)/2);
            } else if (condicion.equals("menor")) {
                rangoMin = numeroMaquina;
                numeroMaquina = ((rangoMax+rangoMin)/2);
            }else if (condicion.equals("igual")){
                acierto=true;
                if (numeroMaquina == 33) {
                    System.out.println("Me repites ese numerín?");
                }
            }    
        } while (!acierto);

        
    }
}
