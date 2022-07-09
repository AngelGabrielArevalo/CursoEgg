Algoritmo Extra16
	Definir n Como Entero
	Hacer
		Escribir "Ingrese un número par mayor que 0:"
		Leer n
		Si n%2<>0 O n==0 Entonces
			Escribir "ERROR"
		FinSi
	Mientras Que n%2<>0 O n==0
	Escribir "La sumatoria da: ", sumaenterospares(n)
FinAlgoritmo

Funcion sum <- sumaenterospares(n)
	Definir sum Como Entero
	Si n==2 Entonces
		sum=2
	SiNo
		sum=n+sumaenterospares(n-2)
	FinSi
FinFuncion
	