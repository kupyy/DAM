Algoritmo ejercicio7
	intentos<-2
	
	login<-falso
	claveAdmin<-"admin"
	claveGestor<-"gestor"
	claveUsuario<-"usuario"
	
	Repetir
		Escribir "Introduzca su contrase�a"
		leer clave
		
		segun clave Hacer
			claveAdmin:
				Escribir "Has iniciado sesi�n como administrador"
				login<-Verdadero
			claveGestor:
				Escribir "Has iniciado sesi�n como gestor"
				login<-Verdadero
			claveUsuario:
				Escribir "Has iniciado sesi�n como usuario"
				login<-Verdadero
			De Otro Modo:
				Escribir "Contrase�a incorrecta"
				intentos<-intentos-1
		FinSegun
	Hasta Que intentos=0 o login
	
FinAlgoritmo
