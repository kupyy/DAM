package Actividad3;

public class ej4 {
    public static void main(String[] args){
        int empleadosMadrid = 400;
        int empleadosBarna = 250;
        int totalEmpleados = empleadosBarna+empleadosMadrid;

        float porcMadrid = (float)empleadosMadrid*100/totalEmpleados;
        float porcBarna = (float)empleadosBarna*100/totalEmpleados;

        System.out.println("El porcentaje de empleados de Madrid es " + porcMadrid + " y el porcentaje de empleados en Barcelona es un " + porcBarna);
    }
}
