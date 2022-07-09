Algoritmo Extra7CONBURBUJA
	Definir vec, n Como Entero
	Escribir "Ingrese la dimensión del vector:"
	Leer n
	Dimension vec(n)
	llenarvector(vec,n)
	mostrarvector(vec,n)
	ordenarvector(vec,n)
	mostrarvector(vec,n)
FinAlgoritmo

SubProceso llenarvector(vec, n)
	Definir i Como Entero
	Para i<-0 Hasta n-1 Hacer
		vec(i)=Aleatorio(0,100)
	FinPara
FinSubProceso

SubProceso mostrarvector(vec, n)
	Definir i Como Entero
	Para i<-0 Hasta n-1 Hacer
		Escribir Sin Saltar vec(i), " "
	FinPara
	Escribir ""
FinSubProceso

SubProceso ordenarvector(vec, n)
	Definir i, j, aux Como Entero
	i=0
	j=0
	Para i<-0 Hasta n-2 Hacer
		Para j<-0 Hasta n-2 Hacer
			Si vec(j)>vec(j+1) Entonces
				aux=vec(j)
				vec(j)=vec(j+1)
				vec(j+1)=aux
			FinSi
		FinPara
	FinPara
FinSubProceso
	