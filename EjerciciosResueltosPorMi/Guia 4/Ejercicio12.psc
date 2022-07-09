Algoritmo Ejercicio12
	Definir mat, palabra Como Caracter
	Definir i, j, k Como Entero
	Dimension mat(3,3)
	i=0
	j=0
	k=0
	Hacer 
		Escribir "Ingrese una palabra de 9 caracteres:"
		Leer palabra
		Si Longitud(palabra)<>9 Entonces
			Escribir "ERROR"
		FinSi
	Mientras Que Longitud(palabra)<>9
	Para i<-0 Hasta 2 Hacer
		Para j<-0 Hasta 2 Hacer
			mat(i,j)=Subcadena(palabra, k, k)
			k=k+1
		FinPara
		j=0
	FinPara
	i=0
	j=0
	Para i<-0 Hasta 2 Hacer
		Para j<-0 Hasta 2 Hacer
			Escribir Sin Saltar mat(i,j), " "
		FinPara
		j=0
		Escribir ""
	FinPara
FinAlgoritmo

