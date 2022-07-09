Algoritmo Ejercicio3
	Definir n1, n2 Como Entero
	Escribir  "Ingrese dos números: "
	Leer n1
	Leer n2
	Escribir n1," es multiplo de ",n2,": ", esmultiplo(n1, n2)
FinAlgoritmo

Funcion multi <- esmultiplo(n1, n2)
	Definir multi Como Logico
	Si n2%n1==0 Entonces
		multi=Verdadero
	SiNo
		multi=Falso
	FinSi
FinFuncion
	