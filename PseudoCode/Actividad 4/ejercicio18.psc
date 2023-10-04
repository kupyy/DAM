Algoritmo mediaycosas
	
	media<-0
	contador<-0
	
	Escribir "Escribe un número"
	Leer num
	minimo<-num
	maximo<-num
	
	Mientras num<>0 Hacer
		
		media<-media+num
		contador<-contador+1
		
		si num>maximo Entonces
			maximo<-num
		FinSi
		
		si num<minimo Entonces
			minimo<-num
		FinSi
		
		Escribir "Escribe un numero"
		leer num
	Fin Mientras
	
	si media<>0 Entonces
		media<-media/contador
		
		Escribir "Media=", media
		Escribir "Maximo=", maximo
		Escribir "Minimo=", minimo
	FinSi

FinAlgoritmo
