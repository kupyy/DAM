#include <stdio.h>

int main()
{
    int a, b, opc, resultado;
    opc = a = b = 0;
    
    while(a<1 || a>10){
        printf("Introduce el primer número:\n");
        scanf("%d", &a);
        
        if (a<1 || a>10){
            printf("Número incorrecto, prueba otra vez.\n");
        }
    }
    
    while(b<1 || b>10){
        printf("Introduce el segundo número\n");
        scanf("%d", &b);
        
        if (b<1 || b>10){
            printf("Número incorrecto, prueba otra vez.\n");
        }
    }

    while (opc!=1 && opc!=2){
        printf("\nElige la operación:\n1.Sumar.\n2.Multiplicar\n");
        scanf("%d", &opc);
        switch(opc){
            case 1:
                resultado=a+b;
                printf("El resultado de la suma es %d", resultado);
                break;
            case 2:
                resultado=a*b;
                printf("El resultado de la multiplicación es %d", resultado);
                break;
            default:
                printf("opción incorrecta");
                break;
        }
    }
}
