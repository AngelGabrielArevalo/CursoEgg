Algoritmo Ejercicio5
	Definir num Como Entero
	Escribir "Ingrese una número:"
	Leer num
	Escribir "Es primo: ", esprimo(num)
FinAlgoritmo

Funcion primo <- esprimo(num)
	Definir primo Como Logico
	Definir i, cant Como Entero
	i=0
	cant=0
	Para i<-0 Hasta num-1 Hacer
		Si num%(i+1)==0 Entonces
			cant=cant+1
		FinSi
	FinPara
	Si cant==2 Entonces
		primo=Verdadero
	SiNo
		primo=Falso
	FinSi
	
FinFuncion
	