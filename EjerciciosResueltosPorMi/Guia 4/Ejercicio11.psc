Algoritmo Ejercicio11
	Definir mat, n Como Entero
	Escribir "Ingrese la dimensión de la matriz cuadrada:"
	Leer n
	Dimension mat(n, n)
	rrellenarmatriz(mat, n)
	imprimirmatriz(mat, n)
FinAlgoritmo

SubProceso rrellenarmatriz( mat, n)
	Definir i, j Como Entero
	i=0
	j=0
	Para i<-0 Hasta n-1 Hacer
		Para j<-0 Hasta n-1 Hacer
			Si i==j Entonces
				mat(i,j)=0
			SiNo
				mat(i,j)=Aleatorio(0,100)
			FinSi
		FinPara
		j=0
	FinPara
FinSubProceso

SubProceso imprimirmatriz(mat, n)
	Definir i, j Como Entero
	i=0
	j=0
	Escribir "La matriz cuadrada es:"
	Para i<-0 Hasta n-1 Hacer
		Para j<-0 Hasta n-1 Hacer
			Escribir Sin Saltar mat(i,j)
			Si mat(i,j)<10 Entonces
				Escribir Sin Saltar "   "
			SiNo
				Si mat(i, j)<100 Entonces
					Escribir Sin Saltar "  "
				SiNo 
					Escribir Sin Saltar " "
				FinSi
			FinSi
		FinPara
		j=0
		Escribir ""
	FinPara
FinSubProceso

	