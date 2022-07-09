Algoritmo Extra1
	Definir n Como Entero
	Escribir "Ingrese un número:"
	Leer n
	Escribir "La sumatoria de los divores de ", n, " es ", sumatoriadivisor(n)
FinAlgoritmo

Funcion sum <- sumatoriadivisor(n)
	Definir sum, i Como Entero
	i=0
	sum=0
	Para i<-0 Hasta n-3 Hacer
		Si n%(i+1)==0 Entonces
			sum=sum+i+1
		FinSi
	FinPara
FinFuncion
	