#include <stdio.h>

//Codigo que pide tres números:
//Compara el segundo con los otros 2

int main()
{
    //declaración de variables
    int num1, num2, num3;
    
    //incialización de variables
    printf("Introduce el primer número");
    scanf("%d", &num1);
    
    printf("Introduce el segundo número");
    scanf("%d", &num2);
    
    printf("Introduce el tercer número");
    scanf("%d", &num3);
    
    //uso de if, 
    if(num2 < num3 && num2 > num1)
    {
        //si se cumple la condición de arriba, se ejecuta este código
        printf("%d es menor que %d y mayor que %d", num3, num2, num1);
    }
    else
    {
        //si no, se ejecutará lo siguiente
        printf("%d no es menor que %d y mayor que %d", num3, num2, num1);
    }
    
}
