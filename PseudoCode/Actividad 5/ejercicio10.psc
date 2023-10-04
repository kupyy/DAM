Algoritmo ejercicio10
	total_personas<-0
	menores<-0
	edad_18_a_30<-0
	edad_30_a_50<-0
	mayor_50<-0
	
	Repetir
		Escribir "Introduce una edad"
		Leer edad
		
		si edad>0 Entonces
			total_personas<-total_personas+1
			si edad<18 Entonces
				menores<-menores+1
			SiNo
				si edad<=30 Entonces
					edad_18_a_30<-edad_18_a_30+1
				SiNo
					si edad<=50 Entonces
						edad_30_a_50<-edad_30_a_50+1
					SiNo
						mayor_50<-mayor_50+1
					FinSi
				FinSi
			FinSi
		FinSi
	Hasta Que edad<0
	
	Escribir "Hay ", menores, " menores de edad, constituyen un ", menores/total_personas*100, "%"
	Escribir "Hay ", edad_18_a_30, " personas entre 18 y 30 años, constituyen un ", edad_18_a_30/total_personas*100, "%"
	Escribir "Hay ", edad_30_a_50, " personas entre 30 y 50 años, constituyen un ", edad_30_a_50/total_personas*100, "%"
	Escribir "Hay ", mayor_50, " personas mayores de 50 años, constituyen un ", mayor_50/total_personas*100, "%"
	
FinAlgoritmo
