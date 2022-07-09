Algoritmo Extra12
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
			Escribir Sin Saltar mat(i, j)
			Si mat(i,j)<10 Entonces
				Escribir Sin Saltar "   "
			SiNo
				Si mat(i,j)<100 Entonces
					Escribir Sin Saltar "  "
				SiNo
					Escribir Sin Saltar " "
				FinSi
			FinSi
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
			Si i==0 O i==n-1 O j==0 O j==m-1 Entonces
				mat(i,j)=1
			SiNo
				mat(i,j)=0
			FinSi
		FinPara
	FinPara
FinSubProceso