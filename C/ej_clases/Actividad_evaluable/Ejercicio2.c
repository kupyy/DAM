#include <stdio.h>
/*
a. Pide por pantalla un primer número entero entre 0 y 10
b. Pide por pantalla un segundo número entero entre 0 y 10
c. Pide por pantalla que seleccionemos la operación, que podrá ser: 1=SUMAR,
2=RESTAR o 3=MULTIPLICAR.
d. Asegurar que todos los datos introducidos son correctos, tanto los números como la
operación. En caso de error pedir que se introduzcan de nuevo.
e. Mostrar por pantalla el resultado de la operación. Con el siguiente formato donde
debes sustituir las palabras en rojo, por los valores reales: 
*/
int main(){
    int x, y, result, opc;
    opc = 0;
    x = y = 11;
    

    while (x<0 || x>10){
        printf("Introduce el primer número.\n");
        scanf("%d", &x);
        
        if (x<0 || x>10){
            printf("Numero incorrecto\n");
        }
    }
    
    while (y<0 || y>10){
        printf("Introduce el segundo número.\n");
        scanf("%d", &y);
        
        if (y<0 || y>10){
            printf("Numero incorrecto\n");
        }
    }
    
    while (opc<1 || opc>3){
        printf("\nElige la operación:\n1.Sumar.\n2.Restar\n3.Multiplicar\n");
        scanf("%d", &opc);
        switch(opc){
            case 1:
                result=x+y;
                printf("La operacion de suma de los numeros %d y %d es igual a %d", x, y, result);
                break;
            case 2:
                result=x-y;
                printf("La operacion de resta de los numeros %d y %d es igual a %d", x, y, result);
                break;
            case 3:
                result=x*y;
                printf("La operacion de multiplicacion de los numeros %d y %d es igual a %d", x, y, result);
                break;
            default:
                printf("opción incorrecta");
                break;
        }
    }
}
