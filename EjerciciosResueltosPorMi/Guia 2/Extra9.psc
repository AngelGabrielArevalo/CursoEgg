Algoritmo Extra9
	Definir anio Como Entero
	Escribir "Ingrese un a�o:"
	Leer anio
	Si (anio%4==0 Y anio%100<>0) O (anio%100==0 Y anio%400==0) Entonces
		Escribir "Es un a�o bisiesto"
	SiNo
		Escribir "No es un a�o bisiesto"
	FinSi
FinAlgoritmo
