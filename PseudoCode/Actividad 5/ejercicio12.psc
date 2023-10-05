Algoritmo division_restas
	
	resultado<-0
	resto<-0
	
	Escribir "Introduce el dividendo: "
	Leer dividendo
	
	Escribir "Introduce el divisor:"
	Leer divisor
	
	Mientras dividendo >= divisor Hacer
		dividendo<-dividendo-divisor
		resultado<-resultado+1
	FinMientras
	
	resto<-dividendo
	
	Escribir "El resultado es ", resultado," y el resto es ", resto
	
FinAlgoritmo
