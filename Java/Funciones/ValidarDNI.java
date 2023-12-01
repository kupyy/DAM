package Funciones;

public class ValidarDNI {
    public static void main(String[] args) {
        String dni = "12345678Z";
        int numdni = Integer.parseInt(dni.substring(0,8));
        System.out.println(numdni);
        dni = Character.toString(dni.charAt(8));
        System.out.println(dni);
    }
}
