#include <stdio.h>

/*
Compara el numero introducido por el usuario
con las caras de un dado y dice el lado contrario
para ello se usa la estructura switch
*/

int main(){
    //declaración de variables
    int cara;

    //incialización de variables
    printf("Introduce una cara: \n");
    scanf("%d", &cara);

    switch (cara){
        //en caso de que la variable sea 1,
        //se ejecutará el código que corresponde a ese valor
        case 1:
            printf("La cara opuesta es el 6");
            break;
        case 2:
            printf("La cara opuesta es el 5");
            break;
        case 3:
            printf("La cara opuesta es el 4");
            break;
        case 4:
            printf("La cara opuesta es el 3");
            break;
        case 5:
            printf("La cara opuesta es el 2");
            break;
        case 6:
            printf("La cara opuesta es el 1");
            break;
        //la opción default se usa para posibles valores que no se contemplen
        default:
            printf("Esa cara no existe en el dado");
            break;
    }

}