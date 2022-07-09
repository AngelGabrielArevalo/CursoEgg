Algoritmo Extra28
	Definir fac, i, j, num Como Entero
	Definir sum Como Real
	i=0
	j=0
	Escribir "Ingrese un número:"
	Leer num
	sum=0
	fac=1
	Para i<-0 Hasta num-1 Hacer
		Para j<-0 Hasta i Hacer
			fac=fac*(j+1)
		FinPara
		sum=sum+1/fac
		j=0
		fac=1
	FinPara
	Escribir sum
FinAlgoritmo
