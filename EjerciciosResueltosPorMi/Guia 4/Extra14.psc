Algoritmo Extra14
	Definir mat, n Como Entero
	Escribir "Ingrese la cantidad de filas:"
	Leer n
	Dimension mat(n,3)
	cargarmatriz(mat, n-1, 3)
	ultimafila(mat, n, 3)
	mostrarmatriz(mat, n, 3)
	
FinAlgoritmo

SubProceso cargarmatriz(mat, n, m)
	Definir i, j Como Entero
	i=0
	j=0
	Para i<-0 Hasta n-1 Hacer
		Escribir "Ingrese los elementos de la fila ",i
		Para j<-0 Hasta m-1 Hacer
			Leer mat(i,j)
		FinPara
	FinPara
FinSubProceso

SubProceso ultimafila(mat, n, m)
	Definir i, j Como Entero
	i=0
	j=0
	Para i<-0 Hasta m-1 Hacer
		Para j<-0 Hasta n-2 Hacer
			Si j==0 Entonces
				mat(n-1, i)=mat(j,i)
			SiNo
				mat(n-1, i)=mat(j,i)+mat(n-1, i)
			FinSi
		FinPara
	FinPara
FinSubProceso

SubProceso mostrarmatriz(mat, n, m)
	Definir i, j Como Entero
	i=0
	j=0
	Para i<-0 Hasta m-1 Hacer
		Para j<-0 Hasta n-1 Hacer
			Escribir Sin Saltar mat(j, i)
			Si j==0 Entonces
				Escribir Sin Saltar "+"
			SiNo
				Si j==1 Entonces
					Escribir Sin Saltar "="
				FinSi
			FinSi
		FinPara
		Escribir ""
		j=0
	FinPara
FinSubProceso