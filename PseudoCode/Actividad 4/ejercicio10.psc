Algoritmo sin_titulo
	Escribir "Introduce el numero de notas"
	leer numNotas
	total<-0
	
	para i<-1 hasta numNotas con paso 1 Hacer
		Escribir "Escribe una nota"
		leer nota
		total<-total+nota
	FinPara
	
	Escribir "La media es ", total/numNotas
	
FinAlgoritmo
