package Actividad6;

public class ej5 {
    public static void main(String[] args){
        String texto = "La lluvia en Sevilla es una maravilla";
        String textoAlt = texto.replace("lluvia", "playa").replace("Sevilla", "Cádiz");

        System.out.println(textoAlt);
    }
}
