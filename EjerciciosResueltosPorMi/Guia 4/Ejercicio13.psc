Algoritmo Ejercicio13
	Definir n, mat, suma Como Entero
	Definir magico Como Logico
	Hacer 
		Escribir "Ingrese el diametro de la matriz cuadrada:"
		Leer n
		Si n>10 Entonces
			Escribir "ERROR, debe ser menor o igual a 10"
		FinSi
	Mientras Que n>10
	Dimension mat(n, n)
	cargarmatriz(mat, n)
	mostrarmatriz(mat,n)
	esmagico(mat, n, magico, suma)
	Si magico Entonces
		Escribir "La matriz es mágica"
	SiNo
		Escribir "La matriz NO es mágica"
	FinSi
FinAlgoritmo

SubProceso mostrarmatriz(mat,n)
	Definir i, j Como Entero
	i=0
	j=0
	Para i<-0 Hasta n-1 Hacer
		Para j<-0 Hasta n-1 Hacer
			Escribir Sin Saltar mat(i,j)," "
		FinPara
		j=0
		Escribir ""
	FinPara
FinSubProceso

SubProceso cargarmatriz(mat, n)
	Definir i, j Como Entero
	i=0
	j=0
	Para i<-0 Hasta n-1 Hacer
		Escribir "Ingrese los valores de la fila ", i
		Para j<-0 Hasta n-1 Hacer
			Hacer
				Leer mat(i,j)
				Si mat(i,j)<1 O mat(i,j)>9 Entonces
					Escribir "Ingrese un valor entre 1 y 9"
				FinSi
			Mientras Que mat(i,j)<1 O mat(i,j)>9
		FinPara
		j=0
	FinPara
FinSubProceso

SubProceso esmagico(mat Por Referencia, n Por Valor, magico Por Referencia, suma Por Referencia)
	Definir i, sum1, sum2 Como Entero
	i=0
	sum1=0
	sum2=0
	Para i<-0 Hasta n-1 Hacer
		sum1=sum1+mat(0, i)
	FinPara
	i=0
	Para i<-0 Hasta n-1 Hacer
		sum2=sum2+mat(i, 0)
	FinPara
	Si sum1==sum2 Entonces
		i=0
		sum2=0
		Para i<-0 Hasta n-1 Hacer
			sum2=sum2+mat(n-1, i)
		FinPara
		Si sum1==sum2 Entonces
			i=0
			sum2=0
			Para i<-0 Hasta n-1 Hacer
				sum2=sum2+mat(i, n-1)
			FinPara
			Si sum1==sum2 Entonces
				i=0
				sum2=0
				Para i<-0 Hasta n-1 Hacer
					sum2=sum2+mat(i, i)
				FinPara
				Si sum1==sum2 Entonces
					i=0
					sum2=0
					Para i<-0 Hasta n-1 Hacer
						sum2=sum2+mat(n-1-i, n-1-i)
					FinPara
					Si sum1==sum2 Entonces
						magico=Verdadero
						suma=sum1
					SiNo
						magico=Falso
					FinSi
				SiNo
					magico=Falso
				FinSi
			SiNo
				magico=Falso
			FinSi
		SiNo
			magico=Falso
		FinSi
	SiNo
		magico=Falso
		
	FinSi
FinSubProceso
	