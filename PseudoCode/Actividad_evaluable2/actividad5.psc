Algoritmo cuadrado_rango
	//declaracion de variables
	resultado<-0
	contador<-1
	
	//lee el valor final del rango
	Escribir "Introduce un numero"
	Leer num
	
	//en cada iteración, al resultado se le suma el cuadrado del contador
	Mientras contador <= num Hacer
		resultado<-resultado+(contador^2)
		
		//incremento del contador para evitar bucles infinitos
		contador<-contador+1
		Escribir "Resultado actual: ", resultado
	FinMientras
	
	Escribir "Resultado final: ", resultado
FinAlgoritmo	