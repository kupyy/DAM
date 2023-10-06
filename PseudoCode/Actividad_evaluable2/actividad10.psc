Algoritmo invertir_numero
	n_d<-0
	n_u<-0
	n_c<-0
	
	Escribir "Escribe un número"
	Leer n
	

	
	si n <= 0 Entonces
		Escribir "Número no válido"
	SiNo
		si n <10 Entonces
			Escribir n
		SiNo
			si n>=10 Entonces
				n_d<-(n%10)
				n_u<-trunc(n/10)
				
				Escribir n_d, n_u
			FinSi
			
		FinSi
		
	FinSi
	
FinAlgoritmo
	