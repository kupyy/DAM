Algoritmo ejercicio6
	//declaración de variables
	contador_lenovo<-0
	contador_dell<-0
	total_lenovo<-0
	total_dell<-0
	mayor_lenovo<-0
	mayor_dell<-0
	precio<-0
	
	//calculos a realizar
	Repetir
		Escribir "Introduce una opción:"
		Escribir "1- Lenovo"
		Escribir "2- Dell"
		Escribir "0- Salir"
		Leer opc
		
		Segun opc
			1:
				//aumenta el contador de ordenadores lenovo en 1 y pregunta por su precio
				contador_lenovo<-contador_lenovo+1
				Escribir "Introduce el precio del ordenador"
				Leer precio
				
				//suma al total del precio de los lenovo el precio introducido
				total_lenovo<-total_lenovo+precio
				
				//valora que el precio introducido sea el mayor de todos
				si precio>mayor_lenovo Entonces
					mayor_lenovo<-precio
				FinSi
			2:
				//aumenta el contador de ordenadores dell en 1 y pregunta por su precio
				contador_dell<-contador_dell+1
				Escribir "Introduce el precio del ordenador"
				Leer precio
				
				//suma al total del precio de los lenovo el precio introducido
				total_dell<-total_dell+precio
				
				//valora que el precio introducido sea el mayor de todos
				si precio>mayor_dell Entonces
					mayor_dell<-precio
				FinSi
			0:
				//Mensaje de despedida para que el 0 no se valore como opción incorrecta
				Escribir "Adios"
			De Otro Modo:
				//Si la opción no está en el menú, muestra el mensaje de error siguiente
				Escribir "Opción incorrecta"
		FinSegun
	Hasta Que opc=0
	
	//muestra de resultados
	//se valora si se han introducido ordenadores de cada marca, para evitar que se hagan divisiones entre 0
	si total_lenovo > 0 Entonces
		Escribir "El precio medio de Lenovo es ", total_lenovo/contador_lenovo, " euros. Hay un total de ", contador_lenovo, " ordenadores de la marca Lenovo, de los cuales el más caro cuesta ", mayor_lenovo, " euros."
	FinSi
	
	si total_dell > 0 Entonces
		Escribir "El precio medio de Dell es ", total_dell/contador_dell, " euros. Hay un total de ", contador_dell, " ordenadores de la marca Dell, de los cuales el más caro cuesta ", mayor_dell, " euros."
	FinSi

FinAlgoritmo
