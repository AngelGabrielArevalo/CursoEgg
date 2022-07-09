Algoritmo Extra29
	Definir cantcentros, sum1, sum2, centro, i, centrosdeseables Como Real
	sum1=0
	sum2=0
	i=0
	centro=2
	cantcentros=0
	Escribir "Ingrese la cantidad de los primeros centros numericos que desea:"
	Leer centrosdeseables
	Escribir "Los centros numericos son: "
	Hacer
		sum1=sum1+centro-1
		//Para i<-0 Hasta centro-2 Hacer
		//	sum1=sum1+centro-1-i
		//FinPara
		i=0
		Hacer
			sum2=sum2+centro+1+i
			i=i+1
		Mientras Que sum1>sum2
		Si sum1==sum2 Entonces
			cantcentros=cantcentros+1
			Escribir Sin Saltar centro, " "
		FinSi
		i=0
		centro=centro+1
		//sum1=0
		sum2=0
	Mientras Que cantcentros<>centrosdeseables
	Escribir ""
FinAlgoritmo
