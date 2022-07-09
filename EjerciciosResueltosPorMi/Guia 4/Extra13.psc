Algoritmo Extra13
	Definir matA, matB, matMul Como Entero
	Dimension matA(3,3)
	Dimension matB(3,3)
	Dimension matMul(3,3)
	cargarmatriz(matA, 3, 3)
	cargarmatriz(matB, 3, 3)
	multiplicarmatriz(matA, matB,matMul, 3, 3)
	mostrarmatriz(matA,3 , 3)
	Escribir ""
	mostrarmatriz(matB, 3, 3)
	Escribir ""
	mostrarmatriz(matMul,3,3)
FinAlgoritmo

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

SubProceso  multiplicarmatriz(matA, matB, matMul, n,m)
	Definir i, j Como Entero
	i=0
	j=0
	Para i=0 Hasta n-1 Hacer
		Para j<-0 Hasta m-1 Hacer
			matMul(i,j)=matA(i,j)*matB(i,j)
		FinPara
	FinPara
FinSubProceso

