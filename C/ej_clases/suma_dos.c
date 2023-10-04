#include <stdio.h>

int main(){
    //declaración de variables:
    //tipo y nombre de variables
    int num1, num2, suma;

    //printf -> mostrar por pantalla
    printf("Introduce un número: \n");

    //scanf -> Leer teclado
    //"%d" -> tipo de dato que se almacena(d=numerico)
    //&num1 -> nombre de variable al que se dirije el valor introducido
    scanf("%d", &num1);

    printf("Introduce el segundo número:\n");
    scanf("%d", &num2);

    /*
    incialización de variable "suma"
    con el resultado de las 2 variables
    introducidas por el usuario
    */
    suma=num1+num2;

    /*
    Muestra de resultado,
    para mostrar variable se indica el tipo de valor dentro del texto
    y se especifica la variable después de las comillas, separadas por comas
    */
    printf("La suma de %d y %d da como resultado %d", num1, num2, suma);
}
