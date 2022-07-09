Algoritmo Ejercicio10
	Definir m, n, sum, i, j, mat Como Entero
	i=0
	j=0
	sum=0
	Escribir "Ingrese la cantidad de filas de la matriz:"
	Leer m
	Escribir "Ingrese la cantidad de columnas de la matriz:"
	Leer n
	Dimension mat(m,n)
	llenarmatriz(mat, m, n)
	sumamatriz(mat, m, n, sum)
	Escribir "La matriz es:"
	Para i<-0 Hasta m-1 Hacer
		Para j<-0 Hasta n-1 Hacer
			Escribir Sin Saltar mat(i,j), " "
		FinPara
		j=0
		Escribir ""
	FinPara
	Escribir "La suma de los valores de la matriz es: ", sum
	
FinAlgoritmo

SubProceso llenarmatriz(mat, m, n)
	Definir i, j Como Entero
	i=0
	j=0
	Para i<-0 Hasta m-1 Hacer
		Para j<-0 Hasta n-1 Hacer
			mat(i,j)=Aleatorio(0,100)
		FinPara
		j=0
	FinPara
FinSubProceso

SubProceso sumamatriz( mat Por Referencia, m Por Valor, n Por Valor, sum Por Referencia)
	Definir i, j Como Entero
	i=0
	j=0
	Para i<-0 Hasta m-1 Hacer
		Para j<-0 Hasta n-1 Hacer
			sum=sum+mat(i, j)
		FinPara
		j=0
	FinPara
FinSubProceso
	