package Actividad8;
import java.util.Scanner;

public class ej8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jornada = 8, salarioDia = 20;
        double salarioNoche=salarioDia+(salarioDia*0.6), finDia=salarioDia+(salarioDia*0.4), finNoche=salarioNoche+(salarioNoche*0.6);
        String finSem = "";

        System.out.println("Introduce tu turno:");
        System.out.println("1-Dia");
        System.out.println("2-Noche");
        String turnoUsr = sc.nextLine();

        System.out.println("¿Es fin de semana?[S/N]");
        turnoUsr += sc.nextLine();

        switch (turnoUsr) {
            case "1s":
                System.out.println("El salario es de " + finDia + "€");
                break;
            case "1n":
                System.out.println("El salario es de " + salarioDia + "€");
                break;
            case "2s":
                System.out.println("El salario es de " + finNoche + "€");
                break;
            case "2n":
                System.out.println("El salario es de " + salarioNoche + "€");
                break;
            default:
                System.out.println("Se ha introducido una opción incorrecta");
                break;
        }
        
    }
}
