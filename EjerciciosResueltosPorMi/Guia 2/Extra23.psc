Algoritmo Extra23
	Definir sum, i Como Entero
	sum=0
	i=1
	Para i<-1 Hasta 100 Hacer
		Si i%2==0 O i%3==0 Entonces
			sum=sum+1
		FinSi
	FinPara
	Escribir "La cantidad de números que son múltiplos de 2 o de 3 comprendidos entre 1 y 100 es: ", sum
FinAlgoritmo
