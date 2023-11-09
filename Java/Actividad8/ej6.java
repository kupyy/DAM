package Actividad8;
import java.util.Scanner;

public class ej6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int anno;
        String mes;

        System.out.println("Introduce un año");
        anno = sc.nextInt();
        sc.nextLine();

        System.out.println("Introduce un mes");
        mes = sc.nextLine();
        mes = mes.toLowerCase();

        switch (mes) {
            case "enero":
            case "marzo":
            case "mayo":
            case "julio":
            case "agosto":
            case "octubre":
            case "diciembre":
                System.out.println("Tiene 31 dias");
                break;
            case "abril":
            case "junio":
            case "septiembre":
            case "noviembre":
                System.out.println("Tiene 30 dias");
                break;
            case "febrero":
                if ( (anno%400 == 0) || (anno%4 == 0 && anno%100 != 0) ) {
                    System.out.println("Tiene 29 días");
                }else{
                    System.out.println("Tiene 28 días");
                }
                break;
            default:
                break;
        }
    }
}
