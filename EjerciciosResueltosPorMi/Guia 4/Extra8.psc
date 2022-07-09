Algoritmo Extra8
	Definir vec, n Como Entero
	Escribir "Ingrese la dimensión del vector:"
	Leer n
	Dimension vec(n)
	cargarvector(vec, n)
	mostrarvector(vec,n)
	Escribir "La suma de los elementos del vector es ", sumavector(vec,n)
FinAlgoritmo

SubProceso mostrarvector(vec, n)
	Definir i Como Entero
	i=0
	Para i<-0 Hasta n-1 Hacer
		Escribir Sin Saltar vec(i)," "
	FinPara
	Escribir ""
FinSubProceso

SubProceso cargarvector(vec, n)
	Definir i Como Entero
	i=0
	Escribir "Ingrese los valores del vector:"
	Para i<-0 Hasta n-1 Hacer
		Leer vec(i)
	FinPara
FinSubProceso

Funcion suma <- sumavector(vec, n)
	Definir suma Como Entero
	Si n==1 Entonces
		suma=vec(0)
	SiNo
		suma=vec(n-1)+sumavector(vec, n-1)
	FinSi
FinFuncion
	