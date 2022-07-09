Algoritmo Extra10
	Definir mat, n, m Como Entero
	Escribir "Ingrese la cantidad de filas de la matriz :"
	Leer n
	Escribir "Ingrese la cantidad de columnas de la matriz :"
	Leer m
	Dimension mat(n, m)
	cargarmatriz(mat, n, m)
	mostrarmatriz(mat, n, m)
FinAlgoritmo

SubProceso mostrarmatriz(mat, n, m)
	Definir i, j Como Entero
	i=0
	j=0
	Para i<-0 Hasta n-1 Hacer
		Para j<-0 Hasta m-1 Hacer
			Escribir Sin Saltar mat(i, j)," "
		FinPara
		Escribir ""
		j=0
	FinPara
FinSubProceso

SubProceso cargarmatriz(mat, n, m)
	Definir i, j Como Entero
	i=0
	j=0
	Para i<-0 Hasta n-1 Hacer
		Para j<-0 Hasta m-1 Hacer
			mat(i, j)=Aleatorio(1, 100)
		FinPara
	FinPara
FinSubProceso

	