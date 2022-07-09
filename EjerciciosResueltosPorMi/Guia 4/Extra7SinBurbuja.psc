Algoritmo Extra7SinBurbuja
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
	Definir i, j,k, aux Como Entero
	Definir menor Como Logico
	j=0
	i=0
	k=0
	Hacer
		Hacer 
			Si vec(j)<=vec(i+k) Entonces
				menor=Verdadero
				i=i+1
			SiNo
				menor=Falso
			FinSi
		Hasta Que  (i+k)==n O menor==Falso
		Si menor==Verdadero Entonces
			aux=vec(j)
			vec(j)=vec(k)
			vec(k)=aux
			k=k+1
			j=0+k
		SiNo
			j=j+1
		FinSi
		i=0
	Mientras  Que j<n
	
FinSubProceso
	