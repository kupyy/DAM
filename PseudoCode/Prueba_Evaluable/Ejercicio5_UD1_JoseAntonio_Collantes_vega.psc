Algoritmo ejercicio5
	//Declaración de variables
	intentos<-0
	EsCorrecta<-Falso
	clave<-"algoritmo"
	
	Repetir
		Escribir "Introduzca la contraseña"
		leer intento
		
		si intento=clave Entonces
			//si la clave es correcta cambiará el booleano a verdadero para que se cumpla la condición del bucle
			Escribir "La clave es correcta"
			EsCorrecta<-Verdadero
		SiNo
			//al fallar, el contador de intentos aumenta
			intentos<-intentos+1
			si intentos=4 Entonces
				//En el cuarto intento ofrece una pista
				Escribir "Pista: Relacionado con la programación"
			FinSi
		FinSi
		//sale del bucle cuando se cumpla una de ambas condiciones
	Hasta Que intentos=5 o EsCorrecta=Verdadero
	
	//valora si se ha salido del bucle por haber acertado la contraseña o no
	//en caso de que no, el contador de intentos será 5 y mostrará el mensaje de error
	Si intentos=5 Entonces
		Escribir "Numero de intentos agotado"
	FinSi
	
FinAlgoritmo
