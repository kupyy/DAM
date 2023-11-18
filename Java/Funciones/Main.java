package Funciones;

public class Main{

    public static void holaMundo(){//funcion que escribe un hola mundo
        System.out.println("Hola mundo");
    }

    //funcion que suma dos números
    public static void muestraSuma(int a, int b){
        System.out.println("El resultado es " + (a+b));
    }

    //calcular descuentos
    public static double precioDto(double precio, double dto){
        double res = precio*(dto/100);
        return res;
    }

    //calcular multiplicacion
    public static void multiplicacion(int a, int b){
        System.out.println("La multiplicacion es " + a*b);
    }

    //comprobar si un número es par o no
    public static boolean esPar(int n){
        boolean res;
        if (n%2==0) {
            res = true;
        }else{
            res = false;
        }
        return res;
    }

    //contar las cifras de un número
    public static int contarCifras(int n){
        int numCifras = Integer.toString(n).length();
        return numCifras;
    }
    public static void main(String[] args) {
        int cantCifras = contarCifras(1234);
        System.out.println("El número tiene " + cantCifras + " cifras");
    }
}