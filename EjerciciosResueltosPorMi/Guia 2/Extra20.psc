Algoritmo Extra20
	Definir i, sumpar, sumimpar, cantpar, cantimpar, num Como Entero
	i=0
	sumpar=0
	sumimpar=0
	cantimpar=0
	cantpar=0
	Hacer
		Escribir "Ingrese un número:"
		Leer num
		Si num%2==0 Entonces
			sumpar=sumpar+num
			cantpar=cantpar+1
		SiNo
			sumimpar=sumimpar+num
			cantimpar=cantimpar+1
		FinSi
		i=i+1
	Mientras Que i<10
	Escribir "La media de los némeros pares es: ", sumpar/cantpar
	Escribir "La media de los némeros impares es: ", sumimpar/cantimpar
FinAlgoritmo
