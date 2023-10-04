Algoritmo sin_titulo
	clave<-"java"
	contador<-1
	check_clave<-Falso
	
	Escribir "introduce la contraseña"
	leer clave_usr
	
	Repetir
		si contador<=3 Entonces
			Escribir "introduce la contraseña"
			leer clave_usr
			si clave_usr<>clave Entonces
				Escribir "Contraseña incorrecta, prueba otra vez"
				contador<-contador+1
			SiNo
				Escribir "Bienvenido"
				check_clave<-Verdadero
			FinSi			
		SiNo
			Escribir "Intentos agotados"
		FinSi
		
	Hasta Que contador=3 o check_clave=Verdadero
	
	
	
FinAlgoritmo
