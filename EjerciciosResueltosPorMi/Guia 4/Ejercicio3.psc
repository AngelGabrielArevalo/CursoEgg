Algoritmo Ejercicio3
	Definir vec, n, element, i, cant Como Entero
	Escribir "Ingrese la dimensíon del vector:"
	Leer n
	Dimension vec(n)
	Escribir "Ingrese los elementos del vector:"
	i=0
	Para i<-0 Hasta n-1 Hacer
		Leer vec(i)
	FinPara
	Escribir "Ingrese el elemento que desea buscar:"
	Leer element
	i=0
	cant=0
	Para i<-0 Hasta n-1 Hacer
		Si cant==0 Entonces
			Si vec(i)==element
				Escribir Sin Saltar "El elemento ingresado se encuentra en la pocisión: "
				Escribir Sin Saltar i 
				cant=cant+1
			FinSi
		SiNo
			Si vec(i)==element
				Escribir Sin Saltar i 
				cant=cant+1
			FinSi
		FinSi
	FinPara
	Si cant==0 Entonces
		Escribir "No se encontro el elemento."
	SiNo
		Escribir ""
	FinSi
	
	
	
FinAlgoritmo

