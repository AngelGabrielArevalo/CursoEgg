Algoritmo Ejercicio4
	Definir frase, letra Como Caracter
	Escribir "Ingrese una frase y una letra:"
	Leer frase
	Leer letra
	Escribir "La cantidad de veces que la letra ",letra, " aparece en la frase es: ", cantvecesletra(frase, letra)
FinAlgoritmo

Funcion cant <- cantvecesletra(frase, letra)
	Definir cant, i Como Entero
	i=0
	cant=0
	Para i<-0 Hasta Longitud(frase)-1 Hacer
		Si Subcadena(frase, i, i)==letra Entonces
			cant=cant+1
		FinSi
	FinPara
	
FinFuncion
	