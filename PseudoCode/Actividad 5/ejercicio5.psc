Algoritmo porcentajes
	numNotas<-0
	
	notables<-0
	suspensos<-0
	aprobados<-0
	
	Repetir
		Escribir "Introduce una nota"
		Leer nota
		si nota>=0 Entonces
			numNotas<-numNotas+1
			si nota < 5 Entonces
				suspensos<-suspensos+1
				
			SiNo
				aprobados<-aprobados+1
				si nota>=7 y nota<9 Entonces
					notables<-notables+1
				FinSi
			FinSi
		FinSi
 	Hasta Que nota<0
	
	Escribir "El numero de suspensos es ", suspensos, ", y el porcentaje es ", suspensos/numNotas*100, "%"
	Escribir "El numero de aprobados es ", aprobados, ", y el porcentaje es ", aprobados/numNotas*100, "%"
	Escribir "El numero de notables es ", notables, ", y el porcentaje dentro de los aprobados es ", notables/aprobados*100, "%"
	
FinAlgoritmo