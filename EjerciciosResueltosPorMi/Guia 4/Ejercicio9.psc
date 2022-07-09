Algoritmo Ejercicio9
	Definir mat, i, j, n, f, c, cant Como Entero
	Dimension mat(5,5)
	i=0
	j=0
	cant=0
	Para i=0 Hasta 4 Hacer
		Para j=0 Hasta 4 Hacer
			mat(i, j)=Aleatorio(0, 100)
		FinPara
		j=0
	FinPara
	i=0
	j=0
	Escribir "Ingrese el elemento que desea buscar:"
	Leer n
	Para i=0 Hasta 4 Hacer
		Para j=0 Hasta 4 Hacer
			Si cant==0 Entonces
				Si mat(i,j)==n Entonces
					cant=cant+1
					Escribir Sin Saltar "El elemento ingresado se encuentra en las coordenadas: (",i,",",j,") "
				FinSi
			SiNo
				Si mat(i,j)==n Entonces
					cant=cant+1
					Escribir Sin Saltar "(",i,",",j,") "
				FinSi
			FinSi
		FinPara
		j=0
	FinPara
	Si cant==0 Entonces
		Escribir "El elemento ingresado no se encuentra en la matriz."
	SiNo
		Escribir ""
	FinSi
FinAlgoritmo
	