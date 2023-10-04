Algoritmo ejercicio7
	intentos<-2
	
	login<-falso
	claveAdmin<-"admin"
	claveGestor<-"gestor"
	claveUsuario<-"usuario"
	
	Repetir
		Escribir "Introduzca su contraseña"
		leer clave
		
		segun clave Hacer
			claveAdmin:
				Escribir "Has iniciado sesión como administrador"
				login<-Verdadero
			claveGestor:
				Escribir "Has iniciado sesión como gestor"
				login<-Verdadero
			claveUsuario:
				Escribir "Has iniciado sesión como usuario"
				login<-Verdadero
			De Otro Modo:
				Escribir "Contraseña incorrecta"
				intentos<-intentos-1
		FinSegun
	Hasta Que intentos=0 o login
	
FinAlgoritmo
