Algoritmo ejercicio5
	//Declaraci�n de variables
	intentos<-0
	EsCorrecta<-Falso
	clave<-"algoritmo"
	
	Repetir
		Escribir "Introduzca la contrase�a"
		leer intento
		
		si intento=clave Entonces
			//si la clave es correcta cambiar� el booleano a verdadero para que se cumpla la condici�n del bucle
			Escribir "La clave es correcta"
			EsCorrecta<-Verdadero
		SiNo
			//al fallar, el contador de intentos aumenta
			intentos<-intentos+1
			si intentos=4 Entonces
				//En el cuarto intento ofrece una pista
				Escribir "Pista: Relacionado con la programaci�n"
			FinSi
		FinSi
		//sale del bucle cuando se cumpla una de ambas condiciones
	Hasta Que intentos=5 o EsCorrecta=Verdadero
	
	//valora si se ha salido del bucle por haber acertado la contrase�a o no
	//en caso de que no, el contador de intentos ser� 5 y mostrar� el mensaje de error
	Si intentos=5 Entonces
		Escribir "Numero de intentos agotado"
	FinSi
	
FinAlgoritmo
