#include <stdio.h>

int main()
{
    /*
    *a -> primer numero
    *b -> segundo numero
    *opc -> opcion del menú
    *resultado -> resultado de la operacion
    */
    int a, b, opc, resultado;
    opc = a = b = 0;
    
    //La operación se repetirá hasta que el primer número sea correcto
    while(a<1 || a>10){
        printf("Introduce el primer número:\n");
        scanf("%d", &a);
        
        if (a<1 || a>10){
            printf("Número incorrecto, prueba otra vez.\n");
        }
    }
    
    //La operación se repetirá hasta que el segundo número sea correcto
    while(b<1 || b>10){
        printf("Introduce el segundo número\n");
        scanf("%d", &b);
        
        if (b<1 || b>10){
            printf("Número incorrecto, prueba otra vez.\n");
        }
    }

    //se repite la operación hasta que se introduzca una opción valida
    while (opc!=1 && opc!=2){
        printf("\nElige la operación:\n1.Sumar.\n2.Multiplicar\n");
        scanf("%d", &opc);
        //según el valor de opc, sumará ambos números o los multiplicará
        switch(opc){
            case 1:
                resultado=a+b;
                printf("El resultado de la suma es %d", resultado);
                break;
            case 2:
                resultado=a*b;
                printf("El resultado de la multiplicación es %d", resultado);
                break;
            //si el valor no es correcto, se muestra un mensaje de error
            default:
                printf("opción incorrecta");
                break;
        }
    }
}
