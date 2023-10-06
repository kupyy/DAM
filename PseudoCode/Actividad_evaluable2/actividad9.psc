Algoritmo concesionario
	
	total_skoda<-0
	total_renault<-0
	total_vw<-0
	total_peugeot<-0
	preciot_skoda<-0
	preciot_renault<-0
	preciot_vw<-0
	preciot_peugeot<-0
	
	Repetir
		Escribir "Introduce una opción"
		Escribir "1-Skoda"
		Escribir "2-Renault"
		Escribir "3-VW"
		Escribir "4-Peugeot"
		Escribir "0-Salir"
		Leer opc
		
		Segun opc Hacer
			1:
				Escribir "Introduce el modelo del coche"
				Leer modelo
				Escribir "Introduce el precio del modelo"
				Leer precio
				
				total_skoda<-total_skoda+1
				preciot_skoda<-preciot_skoda+precio
				
			2:
				Escribir "Introduce el modelo del coche"
				Leer modelo
				Escribir "Introduce el precio del modelo"
				Leer precio
				
				total_renault<-total_renault+1
				preciot_renault<-preciot_renault+precio
			3:
				Escribir "Introduce el modelo del coche"
				Leer modelo
				Escribir "Introduce el precio del modelo"
				Leer precio
				
				total_vw<-total_vw+1
				preciot_vw<-preciot_vw+precio
			4:
				Escribir "Introduce el modelo del coche"
				Leer modelo
				Escribir "Introduce el precio del modelo"
				Leer precio
				
				total_peugeot<-total_peugeot+1
				preciot_peugeot<-preciot_peugeot+precio
			0:
				Escribir "Adios"
			De Otro Modo:
				Escribir "Opcion no correcta"
		FinSegun
	Hasta Que opc=0
	
	Escribir "Hay disponibles ", total_skoda, " de la marca Skoda, su precio medio es ", preciot_skoda/total_skoda
	Escribir "Hay disponibles ", total_renault, " de la marca Renault, su precio medio es ", preciot_renault/total_renault
	Escribir "Hay disponibles ", total_vw, " de la marca VW, su precio medio es ", preciot_vw/total_vw
	Escribir "Hay disponibles ", total_peugeot, " de la marca Peugeot, su precio medio es " preciot_peugeot/total_peugeot
	
FinAlgoritmo
	