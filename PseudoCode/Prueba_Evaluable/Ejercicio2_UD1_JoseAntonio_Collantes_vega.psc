Algoritmo ejercicio2
	//Declaración de variables
	multiplicacion<-0
	cubo<-0
	
	//Obtención de datos
	Escribir "Introduce el primer número"
	Leer num1
	Escribir "Introduce el segundo número"
	Leer num2
	
	//Comprobación de que el primer número es válido
	Si num1<=10 Entonces
		Escribir "Error, el primer número no es válido"
	//Operaciones si el número introducido es el correcto	
	SiNo
		multiplicacion<-num1*num2
		cubo<-num1^3
		
		Escribir "La multiplicación de ambos números es ", multiplicacion
		Escribir "El cubo del primer número es ", cubo
	FinSi
FinAlgoritmo

