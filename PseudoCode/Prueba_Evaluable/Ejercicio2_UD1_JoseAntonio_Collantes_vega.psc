Algoritmo ejercicio2
	//Declaraci�n de variables
	multiplicacion<-0
	cubo<-0
	
	//Obtenci�n de datos
	Escribir "Introduce el primer n�mero"
	Leer num1
	Escribir "Introduce el segundo n�mero"
	Leer num2
	
	//Comprobaci�n de que el primer n�mero es v�lido
	Si num1<=10 Entonces
		Escribir "Error, el primer n�mero no es v�lido"
	//Operaciones si el n�mero introducido es el correcto	
	SiNo
		multiplicacion<-num1*num2
		cubo<-num1^3
		
		Escribir "La multiplicaci�n de ambos n�meros es ", multiplicacion
		Escribir "El cubo del primer n�mero es ", cubo
	FinSi
FinAlgoritmo

