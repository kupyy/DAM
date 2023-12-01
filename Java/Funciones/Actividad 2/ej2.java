import java.util.Scanner;

public class ej2 {
    public static boolean comruebaAño(int dia, String mes, int año){
        boolean esCorrecto = true;
        mes = mes.toLowerCase();

        if(año < 1){
            esCorrecto = false;//comprobar año
        }else if (dia < 1) {
            esCorrecto = false;//comprobar día
        }

        if (esCorrecto) {
            switch (mes) {
                case "enero":
                case "marzo":
                case "mayo":
                case "julio":
                case "agosto":
                case "octubre":
                case "diciembre":
                    if (dia > 31) {
                        esCorrecto = false;
                    }
                    break;
                case "abril":
                case "junio":
                case "septiembre":
                case "noviembre":
                    if (dia > 30) {
                        esCorrecto = false;
                    }
                    break;
                case "febrero":
                    if(dia > 28){
                        esCorrecto = false;
                    }
                    break;
                default:
                    esCorrecto = false;
                    break;
            }    
            return esCorrecto;
        }

        

        return esCorrecto;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dia, año;
        String mes;
        System.out.println("Introduce día");
        dia = sc.nextInt();
        sc.nextLine();
        System.out.println("Introduce mes");
        mes = sc.nextLine();
        System.out.println("Introduce año");
        año = sc.nextInt();

        if (comruebaAño(dia, mes, año)) {
            System.out.println("La fecha es válida");
        }else{
            System.out.println("La fecha no es válida");
        }
    }
}
