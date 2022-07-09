Algoritmo Extra18
	Definir n Como Entero
	Escribir "Ingrese un número:"
	Leer n
	Escribir Fibonacci(n)
FinAlgoritmo

Funcion fibo <- Fibonacci(n)
	Definir fibo Como Entero
	Si n==0 O n==1 Entonces
		fibo=1
	SiNo
		fibo=Fibonacci(n-1)+Fibonacci(n-2)
	FinSi
	
FinFuncion
	