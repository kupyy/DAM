#include <stdio.h>

int main(){
    int num1, num2, suma;

    printf("Introduce un número: \n");
    scanf("%d", &num1);

    printf("Introduce el segundo número:\n");
    scanf("%d", &num2);

    suma=num1+num2;

    printf("La suma de %d y %d da como resultado %d", num1, num2, suma);
}