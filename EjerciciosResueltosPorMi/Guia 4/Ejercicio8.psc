Algoritmo Ejercicio8
	Definir mat, i, j Como Entero
	Dimension  mat(3, 3)
	i=0
	j=0
	Para i<-0 Hasta 2 Hacer
		Escribir "Ingrese los valor de la fila ", i
		Para j<-0 Hasta 2 Hacer
			Leer mat(i, j)
		FinPara
		j=0
	FinPara
	i=0
	j=0
	Para i<-0 Hasta 2 Hacer
		Para j<-0 Hasta 2 Hacer
			Escribir Sin Saltar mat(i, j)," "
		FinPara
		j=0
		Escribir ""
	FinPara
FinAlgoritmo
	