Algoritmo parimpar
	//lee la variable num del usuario
	Escribir "Introduce un número"
	Leer num
	
	//Compara que el numero sea 0 o menor para descartar errores
	Si num <= 0 Entonces
		Escribir "Número erroneo"
	SiNo
		//muestra el mensaje "es par" si el numero es divisible entre 2
		Si num%2=0
			Escribir "Es par"
		SiNo
			//en caso de que no, muestra el mensaje "es impar"
			Escribir "Es impar"
		FinSi
	FinSi
	
FinAlgoritmo
	