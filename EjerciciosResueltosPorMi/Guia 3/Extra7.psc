Algoritmo Extra7
	Definir n Como Entero
	Escribir "Ingrese la pocisión de la cadena de Fibonacci que desea saber:"
	Leer n
	Escribir Fibonacci(n)
FinAlgoritmo

Funcion fibo <- Fibonacci(n)
	Definir fibo,i, aux1, aux2 Como Entero
	i=2
	aux1=1
	aux2=1
	Si n==0 O n==1 Entonces
		fibo=1
	SiNo
		Para i<-2 Hasta n Hacer
				fibo=aux1+aux2
				aux1=aux2
				aux2=fibo
		FinPara
	FinSi
FinFuncion
	