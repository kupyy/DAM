package Actividad3;

public class ej4 {
    public static void main(String[] args){
        int empleadosMadrid = 400;
        int empleadosBarna = 250;
        int totalEmpleados = empleadosBarna+empleadosMadrid;

        double porcMadrid = (double)empleadosMadrid*100/totalEmpleados;
        double porcBarna = (double)empleadosBarna*100/totalEmpleados;

        System.out.println("El porcentaje de empleados de Madrid es " + porcMadrid + " y el porcentaje de empleados en Barcelona es un " + porcBarna);
    }
}
