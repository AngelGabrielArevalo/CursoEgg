Algoritmo Extra15
	Definir mat, vec, vecmul, n,m Como Entero
	Escribir "Ingrese la cantidad de filas:"
	Leer n
	Escribir "Ingrese la cantidad de columnas:"
	Leer m
	Dimension mat(n,m)
	Dimension vec(n)
	Dimension vecmul(n)
	cargarmatriz(mat, n, m)
	cargarvector(vec, m)
	matrizxvector(mat, vec, vecmul, n, m)
	mostrarmatriz(mat,n,m)
	Escribir ""
	mostrarvector(vec,n)
	Escribir ""
	mostrarvector(vecmul,n)
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

SubProceso cargarvector(vec, n)
	Definir i Como Entero
	i=0
	Para i<-0 Hasta n-1 Hacer
		vec(i)=Aleatorio(0,100)
	FinPara
FinSubProceso

SubProceso  matrizxvector(mat, vec, vecmul, n,m)
	Definir i, j Como Entero
	i=0
	j=0
	Para i=0 Hasta n-1 Hacer
		Para j<-0 Hasta m-1 Hacer
			Si j==0 Entonces
				vecmul(i)=mat(i,j)*vec(j)
			SiNo
				vecmul(i)=vecmul(i)+mat(i,j)*vec(j)
			FinSi
		FinPara
		j=0
	FinPara
FinSubProceso

SubProceso mostrarvector(vec,n)
	Definir i Como Entero
	i=0
	Para i<-0 Hasta n-1
		Escribir vec(i)
	FinPara
	Escribir ""
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