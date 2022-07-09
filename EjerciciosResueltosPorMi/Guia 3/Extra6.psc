Algoritmo Extra6
	Definir n Como Real
	Escribir "Ingrese un número;"
	Leer n
	Escribir "El número ingresado tiene todos sus digitos impares: ", digitosimpares(n)
FinAlgoritmo

Funcion impar <- digitosimpares(n)
	Definir impar Como Logico
	Definir aux Como Real
	aux=n
	impar=Verdadero
	Hacer
		Si (aux%10)%2==0 Entonces
			impar=Falso
		FinSi
		aux=TRUNC(aux/10)
	Mientras Que aux>0
FinFuncion
	