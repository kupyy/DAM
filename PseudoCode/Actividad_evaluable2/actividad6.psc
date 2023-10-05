Algoritmo suma_par_impar
	//Declaración de variables
	suma_pares<-0
	suma_impares<-0
	
	//Lectura de valor inicial y final del rango
	Escribir "Escribe el valor inicial"
	Leer inicio
	Escribir "Escribe el valor final (mayor que ", inicio ")"
	Leer final
	
	//control de que el rango sea correcto
	Si inicio >= final Entonces
		Escribir "Rango incorrecto"
	SiNo
		Mientras inicio < final Hacer
			//si el número en la iteración es par, se suma al total de pares
			si inicio%2=0
				suma_pares<-suma_pares+inicio
			SiNo
				//lo mismo con los impares
				suma_impares<-suma_impares+inicio
			FinSi
			inicio<-inicio+1
		FinMientras
		//Muestra de resultados
		//Se colocan dentro de la estructura si, para que en caso de que el rango no sea correcto no intente mostrar el resultado por pantalla
		Escribir "La suma de todos los pares es ", suma_pares
		Escribir "La suma de todos los impares es ", suma_impares
	FinSi
	

	
FinAlgoritmo
	