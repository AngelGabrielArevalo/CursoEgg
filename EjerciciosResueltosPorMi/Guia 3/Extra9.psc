Algoritmo Extra9
	Definir m, n Como Entero
	Escribir "Ingrese el valor de m: "
	Leer m
	Escribir "Ingrese el valor de n (debe ser mayor a 0 y menor a ", m
	Leer n
	Escribir "La combinatoria es (", m,"/",n,")=", combinacion(m, n)
FinAlgoritmo

Funcion fac <- factorial(n)
	Definir fac, i Como Entero
	i=0
	fac=1
	Si n==0 Entonces
		fac=1
	SiNo
		Para i<-0 Hasta n-1 Hacer
			fac=fac*(i+1)
		FinPara
	FinSi
FinFuncion

Funcion com <- combinacion(m, n)
	Definir com Como Real
 	com=factorial(m)/(factorial(n)*factorial(m-n))
FinFuncion
	