#include <stdio.h>

int main(){
    int cara;

    printf("Introduce una cara: \n");
    scanf("%d", &cara);

    switch (cara){
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
        default:
            printf("Esa cara no existe en el dado");
            break;
    }

}