Algoritmo Ejercicio22
	Definir tamanio, i, j, k Como Entero
	i=0
	j=0
	k=0
	Escribir "Ingrese el tamaño:"
	Leer tamanio
	Para i<-0 Hasta tamanio-1 Hacer
		Para j<-0 Hasta tamanio-1 Hacer
			Si i==0 O i==tamanio-1 Entonces
				Escribir Sin Saltar "*"
			SiNo
				Si j==0 O j==tamanio-1 Entonces
					Escribir Sin Saltar "*"
				SiNo
						Escribir Sin Saltar " "
				FinSi
			FinSi
		FinPara
		Escribir""
		j=0
	FinPara
	Escribir ""
FinAlgoritmo
