import java.util.Scanner;

public class ej8 {
    public static boolean DNIvalido(String dni){
        boolean esValido = true;
        String letras = "TRWAGMYFPDXBNJZSQVHLCKE";

        char dniLetra = (char)dni.charAt(dni.length()-1);
        dni = dni.substring(0, 8);
        int dniN = Integer.parseInt(dni);

        int calculoletra = dniN%23;

        if (letras.charAt(calculoletra) != dniLetra) {
            esValido = false;
        }

        return esValido;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el DNI");
        String dni = sc.nextLine();

        if (DNIvalido(dni)) {
            System.out.println("Es valido");
        }else{
            System.out.println("No es valido");
        }

    }
}
