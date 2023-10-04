Algoritmo yolo
	total<-0
	cantidad<-0
	
	para i<-1 hasta cantidad con paso 1 Hacer

	FinPara
	
	Repetir
		
		cantidad<-cantidad+1
		
		Escribir "Introduce nota"
		Leer nota
		si nota < 0 o nota > 10 Entonces
			cantidad<-cantidad-1
		SiNo
			total<-total+nota
		FinSi
	Hasta Que nota < 0
	
	media<-total/cantidad
	Escribir media
FinAlgoritmo
