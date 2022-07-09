Algoritmo Ejercicio2
	Definir num Como Entero
	Leer num
	Escribir "IMPAR: ", esimpar(num)
FinAlgoritmo

Funcion impar <- esimpar(num)
	Definir impar Como Logico
	Si num%2<>0 Entonces
		impar=Verdadero
	SiNo
		impar=Falso
	FinSi
FinFuncion
	